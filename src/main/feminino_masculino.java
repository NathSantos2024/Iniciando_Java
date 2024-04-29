//tarefa_java3

import javax.swing.JOptionPane;

/*
Crie um programa que verifique se uma dada letra digitada é "F" ou "M". Conforme o resultado
escrever: F - Feminino, M - Masculino, Gênero Inválido.
 */
public class feminino_masculino {

    public static void main(String[] args) {
        int resposta;
        do {
        String genero=JOptionPane.showInputDialog(null,
                "Digite F para Feminino ou M para Masculino");
        if(genero.toUpperCase().equals("F")){
                JOptionPane.showMessageDialog(null,"Feminino",
                        "Exercício 3", JOptionPane.INFORMATION_MESSAGE);
    }
        else if(genero.toUpperCase().equals("M")){
                JOptionPane.showMessageDialog(null,"Masculino",
                        "Exercício 3", JOptionPane.INFORMATION_MESSAGE);
            
        }
        else{
            JOptionPane.showMessageDialog(null,"ERRO",
                        "Exercício 3", JOptionPane.ERROR_MESSAGE);
        }   
        
            resposta = JOptionPane.showConfirmDialog(null,
                    "Clique em Yes para continuar", "Exercicio 3",
                    JOptionPane.YES_NO_OPTION);
        } while (resposta == JOptionPane.YES_OPTION);
    }
}
