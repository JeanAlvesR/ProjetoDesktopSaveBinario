package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import model.Pessoa;


/**
 * @author Jean
 */
public class ControllerArquivoBinario<T extends Pessoa> extends ControllerArquivo {

    private List<T> lista = new ArrayList();
    private ObjectInputStream leitor = null;
    private ObjectOutputStream escritor = null;

    /**
     * @return the lista
     */
    public List<T> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(List<T> lista) {
        this.lista = lista;
    }

    @Override
    public boolean ler() {
        if(this.getArquivo() == null){
            return false;
        }
        try {
            if(getArquivo().length() == 0L && getArquivo().isFile()){
                lista = new ArrayList();
                return true;
            }
            leitor = new ObjectInputStream(new FileInputStream(arquivo));
            lista = (ArrayList<T>) leitor.readObject();
            leitor.close();
            return true;
        } catch (ClassNotFoundException erro) {
            return false;
            
        }catch(ClassCastException cce){
            return false;
        }
        catch (IOException erro) {
            return false;
        }
    }

    @Override
    public boolean escrever(boolean append) {
        if (arquivo != null && arquivo.isFile()) {
            try {
                escritor = new ObjectOutputStream(new FileOutputStream(arquivo, append));
                escritor.writeObject(lista);
                escritor.close();
                return true;
            } catch (IOException erro) {
                System.err.println(erro.getMessage() + "Erro ao escrever arquivo binário.");
                return false;
            }
        } else {
            return false;
        }
    }
    
    public T consLista(T pessoa){
        return lista.stream().filter(x -> x.getIdPessoa().equals(pessoa.getIdPessoa())).findFirst().orElse(null);
    }
    
    
    public boolean deletePessoa(T pessoa){
       
        if(pessoa == null){
            return false;
        }
        final T aux = pessoa;
        pessoa = consLista(pessoa);
        if(pessoa == null){
            return false;
        }
        lista.remove(pessoa);
        escrever(false);
        return true;
    }
    
    public boolean updatePessoa(T pessoa){
        AtomicInteger verifica = new AtomicInteger(0);//Serve para thread Safe...

        lista = lista.stream().
                map(x -> {
                    if (x.getIdPessoa().equals(pessoa.getIdPessoa())) {
                        verifica.set(1);
                        return pessoa;
                    }
                    return x;
                }).collect(Collectors.toList());

        if (verifica.get() == 1) {
            escrever(false);
        }

        return verifica.get() == 1;
    }
    
}
