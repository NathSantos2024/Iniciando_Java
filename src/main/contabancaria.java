//tarefa_java3

import javax.swing.JOptionPane;

/*
Elabore um programa em Java que permita efetuar operações de crédito ou débito numa conta bancária. 
O programa deverá perguntar qual o saldo inicial da conta e  qual a operação que o utilizador pretende 
efetuar (débito ou crédito), assim como o  montante a debitar, atualizando o saldo da conta sempre que s
e efetue uma  operação. No final deverá devolver o saldo da conta.  */


public class contabancaria {

    public static void main(String[] args) {

        double saldo = Double.parseDouble(JOptionPane.showInputDialog
        ("Qual o saldo inicial da conta? "));

        int escolha;
        do {
            String[] opcoes = {"Crédito", "Débito", "Sair"};
            escolha = JOptionPane.showOptionDialog(
                    null,
                    "Qual operação pretende efetuar?","Conta Bancária",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]);

            switch (escolha) {
                case 0:
                    double credito = Double.parseDouble
                    (JOptionPane.showInputDialog
                    ("Qual o montante a creditar? "));
                    saldo = realizarCredito(saldo, credito);
                    break;
                case 1:
                    double debito = Double.parseDouble
                    (JOptionPane.showInputDialog
                    ("Qual o montante a debitar? "));
                    saldo = realizarDebito(saldo, debito);
                    break;
                case 2:
                    JOptionPane.showMessageDialog
                    (null, "O saldo final da conta é: " + 
                    saldo + "Euros", "Conta Bancária", 
                    JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    JOptionPane.showMessageDialog
                    (null, "Opção inválida. "
                    + "Tente novamente.", "Conta Bancária", 
                    JOptionPane.WARNING_MESSAGE);
            }

        } while (escolha != 2);
    }

    private static double realizarCredito(double saldo, double montante) {
        saldo += montante;
        JOptionPane.showMessageDialog(null, 
        "Crédito realizado com sucesso.\n O novo saldo é: " + 
        saldo + "Euros", "Conta Bancária", JOptionPane.INFORMATION_MESSAGE);
        return saldo;
    }

    private static double realizarDebito(double saldo, double montante) {
        if (montante <= saldo) {
            saldo -= montante;
            JOptionPane.showMessageDialog(null, 
            "Débito realizada com sucesso.\n O novo saldo: " + 
            saldo + "Euros", "Conta Bancária", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, 
            "O saldo é insuficiente para realizar a operação de débito.", 
            "Conta Bancária", JOptionPane.WARNING_MESSAGE);
        }
        return saldo;
    }
}