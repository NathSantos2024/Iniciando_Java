//tarefa_java4

//Jogo: Pedra, Papel e Tesoura

import java.util.Random;
import javax.swing.JOptionPane;


public class JogoPedraPapelTesoura_aula {

    public static void main(String[] args) {
        // declarar e inicializar um array para os guardar os simbolos do jogo
        String[] simbolos={"Pedra","Papel","Tesoura"};
        
        // solicitar ao utilizador o seu nome
        String nome=JOptionPane.showInputDialog(null,"Digite o seu nome");
        
        int score_jogador=0, score_computador=0;
        
        do{
        
            // mostrar a caixa de diálogo para a escolha do simbolo pelo jogador
            int jogador=JOptionPane.showOptionDialog(null, 
                    nome+", selecione o símbolo pretendido", 
                    "Jogo",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.PLAIN_MESSAGE, 
                    null, simbolos, null);

            // gerar o simbolo do computador
            // 0-Pedra / 1-Papel / 2-Tesoura
            Random R=new Random();
            int computador=R.nextInt(0, 3); // gerar um inteiro entre 0 e 2

            // mostrar as escolhas dos jogadores(utilizador e computador)

            JOptionPane.showMessageDialog(null,"A escolha do jogador foi "+simbolos[jogador]+"\n"+
                    "A escolha do computador foi "+simbolos[computador],
                    "Jogo Pedra, Papel, Tesoura",JOptionPane.INFORMATION_MESSAGE);

            // avaliar os resultados
            if((jogador==1) && (computador==0) ||
               (jogador==2) && (computador==1) ||
               (jogador==0) && (computador==2)){
                score_jogador++;
                JOptionPane.showMessageDialog(null, "O(A) "+nome+" ganhou.",
                        "Jogo Pedra, Papel, Tesoura",JOptionPane.INFORMATION_MESSAGE);
            }     
            else if(jogador==computador){
                JOptionPane.showMessageDialog(null, "O jogo está empatado",
                        "Jogo Pedra, Papel, Tesoura",JOptionPane.INFORMATION_MESSAGE);            
            }
            else{
                score_computador++;
                JOptionPane.showMessageDialog(null, "O computador ganhou.",
                        "Jogo Pedra, Papel, Tesoura",JOptionPane.INFORMATION_MESSAGE);            
            }
            
            JOptionPane.showMessageDialog(null, "Score\n"+
                    "Computador:"+score_computador+" Versus "+nome+":"+score_jogador,
                        "Jogo Pedra, Papel, Tesoura",JOptionPane.INFORMATION_MESSAGE);
            
        }while(JOptionPane.showConfirmDialog(null, "Clique em Yes para continuar",
                "Jogo Pedra, Papel, Tesoura",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION);    
    }

}
