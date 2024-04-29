//tarefa_java2.1

import javax.swing.JOptionPane;

/*
Desenvolver um programa que solicite ao utilizador uma palavra-passe; na sequência, o utilizador 
digita dois números do tipo double, e é calculada a divisão do primeiro pelo segundo. O programa irá 
pedir ao utilizador que confirme a password indicada anteriormente. Se estiver correta, mostra o 
resultado da divisão senão surge uma mensagem de erro. */
public class password_calculo {

    public static void main(String[] args) {
        String password=JOptionPane.showInputDialog(null, 
                "Digite a password");
        double n1=Double.parseDouble(JOptionPane.showInputDialog(null, 
                "Digite o 1º número"));
        double n2=Double.parseDouble(JOptionPane.showInputDialog(null, 
                "Digite o 2º número"));  
        double resultado=n1/n2;
        String password1=JOptionPane.showInputDialog(null, 
                "Confirme a password");
        if(password.equals(password1)){
            JOptionPane.showMessageDialog(null,
                    "A divisão do 1º número pelo 2º é " +resultado,
                    "Exercício 1",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "As passwords não coicidem "+resultado,
                    "Exercício 1", JOptionPane.ERROR_MESSAGE);
        }
    }    
}
