package br.com.exercicios.cadastro;

import java.util.ArrayList;

public class Agencia {

    private String nomeAgencia;

    ArrayList<Conta> contas = new ArrayList<>();

    public Agencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    public void inserirConta(Conta conta) {
        contas.add(conta);
    }

    public Conta buscarConta() {
        for (int i = 0; i < contas.size(); i++) {


            return contas.get(i);
        }
    }
}