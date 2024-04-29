//tarefa_java7

/*Codifique em Java recorrendo ao JOptionPane um programa que coloque 5 perguntas a uma pessoa sobre um crime. 
O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. 
Se a pessoa responder positivamente a 2 questões deve ser classificada como "Suspeita", entre 3 e 4 como  "Cúmplice" 
e 5 como "Assassino". Caso contrário, será classificada como "Inocente".  */

import javax.swing.JOptionPane;


public class ClassificacaoCulpado {

    public static void main(String[] args) {
        int numPerguntas = 5;
        String[] perguntas = {
            "Telefonou para a vítima?",
            "Esteve no local do crime?",
            "Mora perto da vítima?",
            "Tinha dúvidas com a vítima?",
            "Já trabalhou com a vítima?"
        };

        while (true) {
            int respostasPositivas = 0;

            for (int i = 0; i < numPerguntas; i++) {
                int resposta = JOptionPane.showConfirmDialog(null, perguntas[i], "Pergunta " + (i + 1), JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                    respostasPositivas++;
                }
            }

            String classificacao;
            if (respostasPositivas == 5) {
                classificacao = "Assassino";
            } else if (respostasPositivas >= 3) {
                classificacao = "Cúmplice";
            } else if (respostasPositivas >= 2) {
                classificacao = "Suspeita";
            } else {
                classificacao = "Inocente";
            }

            JOptionPane.showMessageDialog(null, "Classificação: " + classificacao);

            int repetir = JOptionPane.showConfirmDialog(null, "Deseja repetir?", "Repetir", JOptionPane.YES_NO_OPTION);
            if (repetir != JOptionPane.YES_OPTION) {
                break;
            }
        }
    }
}