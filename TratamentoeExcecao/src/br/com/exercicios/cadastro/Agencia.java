package br.com.exercicios.cadastro;

import java.util.ArrayList;

public class Agencia {

    private String nomeAgencia;

    ArrayList<Conta> contas = new ArrayList<Conta>(2);

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

    public String buscarConta() {
        int numConta=0;
        Conta c ;

        for (int i = 0; i < contas.size(); i++) {
            c = (Conta)contas.get(i);
            numConta = c.getNumConta();
        }
        return "Conta encontrada!\n\n" + numConta;
    }
}