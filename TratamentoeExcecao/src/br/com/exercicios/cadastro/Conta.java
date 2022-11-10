package br.com.exercicios.cadastro;

public class Conta {

    private String nome;
    private String cpf;
    private int numConta;
    private String telefone;
    private String email;

    public Conta(String nome, String cpf, int numConta, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.numConta = numConta;
        this.telefone = telefone;
        this.email = email;
    }

    public Conta() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String imprimirConta(){
        return "Nome: " + getNome() +
                "\nCPF: " + getCpf() +
                "\nConta: " + getNumConta() +
                "\nTelefone: " + getTelefone() +
                "\nE-mail: " +getEmail();
    }

}
