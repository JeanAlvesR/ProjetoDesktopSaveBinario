/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author Jean
 */
public class Diretor extends Pessoa{
    private static final long serialVersionUID = 9;
    protected String cpf;

    public Diretor() {
        cpf = "";
    }

    public Diretor(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public Diretor(Integer idPessoa, String nome, String cpf) {
        super(idPessoa, nome);
        this.cpf = cpf;
    }
    
    public Diretor(Integer idPessoa){
        this.idPessoa = idPessoa;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    @Override
    public String toString() {
        return idPessoa + ";"+ nome + ";" + cpf+"\n";
    } 
    
}
