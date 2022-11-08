package br.com.exemplos;

import javax.swing.JOptionPane;

public class Divide {

    public static void main(String[] args) {

        int dividendo, divisor;

        while (true) {

            try {
                dividendo = Integer.parseInt(JOptionPane.showInputDialog("Digite o dividendo: "));
                divisor = Integer.parseInt(JOptionPane.showInputDialog("Digite o divisor: "));
                divide(dividendo,divisor);
                break;
            }
            catch (ArithmeticException e1) {
                JOptionPane.showMessageDialog(null, "Não pode dividir por zero!", "Erro", JOptionPane.WARNING_MESSAGE);
            }
            catch (NumberFormatException e2){
                JOptionPane.showMessageDialog(null, "Favor informar apenas números inteiros!", "Erro", JOptionPane.WARNING_MESSAGE);
            }

        }
    }
    public static void divide(int dividendo, int divisor){
        JOptionPane.showMessageDialog(null, "Divisão = " + (dividendo/divisor));
    }
}
