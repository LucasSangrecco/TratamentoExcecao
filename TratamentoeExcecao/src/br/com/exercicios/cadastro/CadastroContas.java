package br.com.exercicios.cadastro;

import javax.swing.*;
import java.util.InputMismatchException;

public class CadastroContas {
    public static void main(String[] args) {


        String nome;
        String cpf;
        int numConta=0;
        String telefone;
        String email;
        int opcao;
        int buscar;

        Conta c;
        Conta[] contas = new Conta[10];
        Agencia ag1 = new Agencia("Banco!!!");

            do {
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opcão:" +
                        "\n1 - Cadastrar contas." +
                        "\n2 - Consultar conta." +
                        "\n3 - Sair."));

                switch (opcao) {
                    case 1:
                        try {
                            for (int i=0;i<contas.length;i++) {

                                JOptionPane.showInputDialog("Cadastre sua conta:");
                                nome = JOptionPane.showInputDialog("Digite o seu nome: ");
                                cpf = JOptionPane.showInputDialog("Digite o seu CPF: ");
                                telefone = JOptionPane.showInputDialog("Digite o seu telefone: ");
                                email = JOptionPane.showInputDialog("Digite o seu e-mail: ");
                                numConta++;

                                c = new Conta(nome, cpf, numConta, telefone, email);
                                contas[i] = c;
                                ag1.inserirConta(c);
                            }
                        }
                        catch (InputMismatchException excecaoDadoInvalido){
                            JOptionPane.showMessageDialog(null, "O dado inserido é inválido.", "Erro", JOptionPane.WARNING_MESSAGE);
                        }
                        catch(ArrayIndexOutOfBoundsException excecaoRepositorio){
                            JOptionPane.showMessageDialog(null, "Não é possivel inserir mais contas.", "Erro", JOptionPane.WARNING_MESSAGE);
                        }
                    break;

                    case 2:
                        try{
                            buscar=Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta que deseja buscar: "));
                            for (int i=0;i<contas.length;i++){
                                if (.equals(buscar)){
                                    JOptionPane.showMessageDialog(null,);
                                }
                            }
                        }
                        catch(NullPointerException excecaoElementoInexistente){
                            JOptionPane.showMessageDialog(null, "Conta inexistente.", "Erro", JOptionPane.WARNING_MESSAGE);
                        }

                }
            }
            while(opcao!=3);


        for(int i=0;i<contas.length;i++) {
            if(contas[i].getNumConta()==(contas[i].getNumConta()));{
                JOptionPane.showMessageDialog(null, "Conta ja existente.", "Erro", JOptionPane.WARNING_MESSAGE);
            }
        }

    }
}