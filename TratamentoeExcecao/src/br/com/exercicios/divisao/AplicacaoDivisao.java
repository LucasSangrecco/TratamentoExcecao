package br.com.exercicios.divisao;

import javax.swing.JOptionPane;

public class AplicacaoDivisao {
    public static void main(String[] args) {

        Divisao d = new Divisao();

        try {
            int a = Integer.parseInt(JOptionPane.showInputDialog("A: "));
            int b = Integer.parseInt(JOptionPane.showInputDialog("B: "));
            JOptionPane.showMessageDialog(null, "O resultado da  divisão de A por B é: " + d.calcula(a,b));
        }
        catch(ArithmeticException excecaoDivisaoPorZero){
            JOptionPane.showMessageDialog(null, "Não é possível dividir por zero!", "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }
}
