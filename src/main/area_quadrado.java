//tarefa_java1.3

/*
Crie um programa para calcular a área de um quadrado. 
O tamanho do lado deve ser informado pelo utilizador. 
Formate com 1 casa decimal e sigla m².
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class area_quadrado {

    public static void main(String[] args) {
        // Definir o formato desejado para a saída
        DecimalFormat df = new DecimalFormat("0.0 m²");

        // Criar um Scanner para receber a entrada do usuário
        Scanner teclado = new Scanner(System.in);

        // Solicitar o tamanho do lado do quadrado
        System.out.print("Digite o tamanho do lado do quadrado (em metros): ");
        float lado = teclado.nextFloat();

        // Calcular e exibir o resultado da área (área = lado*lado)
        System.out.println("A área do quadrado é: " + 
                df.format(lado*lado));

    }
}