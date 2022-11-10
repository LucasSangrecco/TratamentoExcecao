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
        int opcao=0;
        String buscar;

        Conta c = new Conta();
        Agencia ag1;

        do {
            try {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opcão:" +
                    "\n1 - Cadastrar contas." +
                    "\n2 - Consultar conta." +
                    "\n3 - Sair."));

            ag1 = new Agencia("Banco!!!");

                switch (opcao) {
                    case 1:
                        nome = JOptionPane.showInputDialog("Digite o seu nome: ");
                        cpf = JOptionPane.showInputDialog("Digite o seu CPF: ");
                        numConta=Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da conta: "));
                        telefone = JOptionPane.showInputDialog("Digite o seu telefone: ");
                        email = JOptionPane.showInputDialog("Digite o seu e-mail: ");

                        if (numConta==c.getNumConta()) {
                            throw new Exception("Conta já existente.");

                        }
                        else {
                            c = new Conta(nome, cpf, numConta, telefone, email);
                            ag1.inserirConta(c);

                            JOptionPane.showMessageDialog(null, "Conta Cadastrada!\n" +
                                    "\nAgencia: " + ag1.getNomeAgencia() +
                                    "\nConta: " + numConta +
                                    "\nNome: " + nome +
                                    "\nCPF: " + cpf +
                                    "\nTelefone: " + telefone +
                                    "\nE-mail: " + email);
                        }

                        break;


                    case 2:

                        buscar=JOptionPane.showInputDialog("Digite o número da conta que deseja buscar: ");

                        if (ag1.buscarConta().equals(buscar)) {
                            JOptionPane.showMessageDialog(null, ag1.buscarConta());
                        }

                }
            }
            catch (InputMismatchException excecaoDadoInvalido) {
                JOptionPane.showMessageDialog(null, "O dado inserido é inválido.", "Erro", JOptionPane.WARNING_MESSAGE);
            }
            catch (ArrayIndexOutOfBoundsException excecaoRepositorio) {
                JOptionPane.showMessageDialog(null, "Não é possivel inserir mais contas.", "Erro", JOptionPane.WARNING_MESSAGE);
            }
            catch (NullPointerException excecaoElementoInexistente) {
                JOptionPane.showMessageDialog(null, "Conta inexistente.", "Erro", JOptionPane.WARNING_MESSAGE);
            }
            catch (Exception excecaoElementoJaExistente) {
                JOptionPane.showMessageDialog(null, excecaoElementoJaExistente.getMessage(), "Erro", JOptionPane.WARNING_MESSAGE);
            }
        }
        while (opcao != 3);

    }

}
