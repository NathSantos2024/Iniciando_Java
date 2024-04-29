//tarefa_java6

import javax.swing.JOptionPane;

public class TestandoCalculadora {
    public static void main(String[] args) {
        // Instanciar um objeto da classe Calculadora
        calculadora calc = new calculadora();

        // Solicitar ao usuário os valores
        String input1 = JOptionPane.showInputDialog("Digite o primeiro número:");
        String input2 = JOptionPane.showInputDialog("Digite o segundo número:");

        // Converter a entrada do usuário para double
        double numero1 = Double.parseDouble(input1);
        double numero2 = Double.parseDouble(input2);

        // Definir os números na calculadora usando os setters
        calc.setNumero1(numero1);
        calc.setNumero2(numero2);

        // Realizar operações e exibir resultados
        JOptionPane.showMessageDialog(null, "Soma: " + calc.soma());
        JOptionPane.showMessageDialog(null, "Subtração: " + calc.subtracao());
        JOptionPane.showMessageDialog(null, "Multiplicação: " + calc.multiplicacao());
        JOptionPane.showMessageDialog(null, "Divisão: " + calc.divisao());
    }
}