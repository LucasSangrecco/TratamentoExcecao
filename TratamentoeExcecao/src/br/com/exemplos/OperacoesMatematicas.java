package br.com.exemplos;

import javax.swing.*;

public class OperacoesMatematicas {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"Início do programa", "Início", JOptionPane.DEFAULT_OPTION);
        try{
            int a = Integer.parseInt(JOptionPane.showInputDialog("a: "));
            int b = Integer.parseInt(JOptionPane.showInputDialog("b: "));
            JOptionPane.showMessageDialog(null, "Divisão = " + (a/b));
            JOptionPane.showMessageDialog(null, "Multiplicação = " + (a*b));
            JOptionPane.showMessageDialog(null, "Soma = " + (a+b));
            JOptionPane.showMessageDialog(null, "Subtração = " + (a-b));
        }
        catch (ArithmeticException e1){
            JOptionPane.showMessageDialog(null, "Não pode dividir por zero!");
        }
        catch (NumberFormatException e2){
            JOptionPane.showMessageDialog(null, "Digite um número válido!");
        }
        JOptionPane.showMessageDialog(null, "Fim do Programa.");
    }
}
