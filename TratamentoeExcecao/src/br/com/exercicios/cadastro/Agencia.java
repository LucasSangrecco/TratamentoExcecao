package br.com.exercicios.cadastro;

import java.util.ArrayList;

public class Agencia {

    private String nomeAgencia;

    Conta[] contas = new Conta[2];
    Conta conta;


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
        for (int i=0;i< contas.length;i++){
            contas[i] = new Conta();
        }
    }

    public String buscarConta() {
        int conta=0;
        for (int i = 0; i < contas.length; i++) {
            contas[i].getNumConta();
            conta=i;
        }
        return "Conta encontrada!\n\n" + contas[conta].imprimirConta();
    }
}