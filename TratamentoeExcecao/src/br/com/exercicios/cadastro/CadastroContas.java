package br.com.exercicios.cadastro;

import javax.swing.*;
import java.util.InputMismatchException;

public class CadastroContas {
    public static void main(String[] args) {


        String nome;
        String cpf;
        int numConta;
        String telefone;
        String email;
        int opcao = 0;
        String buscar;

        Conta c = new Conta();
        Agencia ag1;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opcão:" +
                    "\n1 - Cadastrar contas." +
                    "\n2 - Consultar conta." +
                    "\n3 - Sair."));

            ag1 = new Agencia("AAAA");


            switch (opcao) {
                case 1:
                    try {
                        nome = JOptionPane.showInputDialog("Digite o seu nome: ");
                        cpf = JOptionPane.showInputDialog("Digite o seu CPF: ");
                        numConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta: "));
                        telefone = JOptionPane.showInputDialog("Digite o seu telefone: ");
                        email = JOptionPane.showInputDialog("Digite o seu e-mail: ");

                        if (numConta != c.getNumConta()) {
                            c = new Conta(nome, cpf, numConta, telefone, email);
                            ag1.inserirConta(c);

                            JOptionPane.showMessageDialog(null, "Cadastro Realizado!\n" +
                                    "\nAgencia: " + ag1.getNomeAgencia() +
                                    "\nConta: " + numConta +
                                    "\nNome: " + nome +
                                    "\nCPF: " + cpf +
                                    "\nTelefone: " + telefone +
                                    "\nE-mail: " + email);
                        }
                        else{
                            throw new Exception();
                        }
                    }
                    catch (NumberFormatException excecaoDadoInvalido) {
                        JOptionPane.showMessageDialog(null, "O dado inserido é inválido.", "Erro", JOptionPane.WARNING_MESSAGE);
                    }
                    catch (ArrayIndexOutOfBoundsException excecaoRepositorio) {
                        JOptionPane.showMessageDialog(null, "Não é possível adicionar mais contas", "Erro", JOptionPane.WARNING_MESSAGE);
                    }
                    catch (Exception excecaoElementoJaExistente) {
                        JOptionPane.showMessageDialog(null, "Conta já existente.", "Erro", JOptionPane.WARNING_MESSAGE);
                    }
                    break;

                case 2:
                    try {
                        buscar = JOptionPane.showInputDialog("Digite o número da conta que deseja buscar: ");

                        if (buscar==ag1.buscarConta()) {
                            JOptionPane.showMessageDialog(null, ag1.buscarConta());
                        } else {
                            throw new Exception();
                        }
                    }
                    catch (Exception excecaoElementoInexistente) {
                        JOptionPane.showMessageDialog(null, "Conta Inexistente", "Erro", JOptionPane.WARNING_MESSAGE);
                    }
                    break;

                case 3:
                    JOptionPane.showMessageDialog(null, "O Banco " + ag1.getNomeAgencia() + " te deseja um ótimo dia!");
                    break;
            }

        }
        while (opcao != 3);

    }

}