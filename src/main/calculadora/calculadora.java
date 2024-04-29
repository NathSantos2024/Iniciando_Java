//tarefa_java6

/*->Crie uma classe em Java com o nome Calculadora. Esta classe possui 2 variáveis
membro do tipo double.
->Crie os Setters e os Getters para as variáveis referidas.
->Crie 4 métodos que retornem respetivamente a soma, a subtração, a multiplicação e a divisão.
->Crie uma Classe do tipo Java Main Class que solicite ao utilizador 2 valores do tipo 
double e invoce os métodos da Classe.
->Use as caixas de diálogo para introdução e visualização dos dados. */

import javax.swing.JOptionPane;

// Classe Calculadora
public class calculadora {
    private double numero1;
    private double numero2;

    // Setters
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    // Getters
    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    // Métodos de operações
    public double soma() {
        return numero1 + numero2;
    }

    public double subtracao() {
        return numero1 - numero2;
    }

    public double multiplicacao() {
        return numero1 * numero2;
    }
    
    // Verifica se o segundo número é diferente de zero para evitar divisão por zero
    public double divisao() {
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            // Exibe uma mensagem de erro caso haja divisão por zero
            JOptionPane.showMessageDialog(null, "Erro: divisão por zero!");
            return Double.NaN; 
        }
    }
}