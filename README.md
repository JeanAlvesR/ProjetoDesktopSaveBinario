<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  
</head>
<body>
  <h1>Projeto de Cadastro em Java com Swing</h1>

  <p>Este é um projeto em Java que implementa um sistema de cadastro usando a biblioteca Swing para a interface gráfica e persistindo os dados em um arquivo binário em formato TXT.</p>

  <h2>Funcionalidades</h2>

  <p>O projeto possui as seguintes funcionalidades:</p>
  <ul>
    <li>Cadastro de novos registros</li>
    <li>Visualização dos registros cadastrados</li>
    <li>Edição dos registros existentes</li>
    <li>Exclusão de registros</li>
    <li>Persistência dos dados em um arquivo binário em formato TXT</li>
  </ul>

  <h2>Requisitos</h2>

  <p>Para executar o projeto, é necessário ter instalado:</p>
  <ul>
    <li>Java Development Kit (JDK) 8 ou superior</li>
    <li>Ambiente de desenvolvimento integrado (IDE) compatível com Java, como NETBEANS</li>
  </ul>

  <h2>Instruções de uso</h2>

  <ol>
    <li>Clone ou faça o download do repositório para o seu ambiente local.</li>
    <li>Abra o projeto na IDE NetBeans.</li>
    <li>Compile e execute o arquivo <code>CadastroApp.java</code> para iniciar a aplicação.</li>
    <li>A interface gráfica será exibida, permitindo que você realize as operações de cadastro, visualização, edição e exclusão de registros.</li>
    <li>Os dados serão persistidos em um arquivo binário em formato TXT  <code>da sua escolha</code>.</li>
  </ol>

  <h2>Estrutura do projeto</h2>

  <pre>
projeto-cadastro/
  ├── src/
  │   ├── main/
  │   │   ├── java/
  │   │   │   ├── controller/
  │   │   │   │   ├── ControllerArquivo.java
  │   │   │   │   └── ControllerArquivoBinario.java
  │   │   │   ├── model/
  │   │   │   │   ├── Aluno.java
  │   │   │   │   ├── Diretor.java
  │   │   │   │   ├── Pessoa.java
  │   │   │   │   └── Professor.java
  │   │   │   └── view/
  │   │   │       ├── JanPrincipal.form
  │   │   │       └── JanPrincipal.java
  └── README.html

  </pre>
  
  <p>O projeto está organizado da seguinte forma:</p>
<ul>
  <li>O arquivo <code>ControllerArquivo.java</code> está localizado em <code>src/main/java/controller/</code>.</li>
  <li>O arquivo <code>ControllerArquivoBinario.java</code> está localizado em <code>src/main/java/controller/</code>.</li>
  <li>O arquivo <code>Aluno.java</code> está localizado em <code>src/main/java/model/</code>.</li>
  <li>O arquivo <code>Diretor.java</code> está localizado em <code>src/main/java/model/</code>.</li>
  <li>O arquivo <code>Pessoa.java</code> está localizado em <code>src/main/java/model/</code>.</li>
  <li>O arquivo <code>Professor.java</code> está localizado em <code>src/main/java/model/</code>.</li>
  <li>O arquivo <code>JanPrincipal.form</code> está localizado em <code>src/main/java/view/</code>.</li>
  <li>O arquivo <code>JanPrincipal.java</code> está localizado em <code>src/main/java/view/</code>.</li>
</ul>
