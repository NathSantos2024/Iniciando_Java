//tarefa_java1.1

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Crie um programa que converta polegadas em milímetros. 
1 polegadas correspondem 25,4 mm. Formate com 2 decimais.
*/

public class converter_polegas_milimetros {

    public static void main(String[] args) {
        // Definir o formato desejado para a saída
        DecimalFormat df = new DecimalFormat("0.00 mm");

        // Criar um Scanner para receber a entrada do usuário
        Scanner teclado = new Scanner(System.in);

        // Solicitar o valor em polegadas
        System.out.print("Digite o valor em polegadas: ");
        double polegadas = teclado.nextDouble();

        // Converter polegadas para milímetros (1 polegada = 25,4 mm)
        double milimetros = polegadas*25.4;

        // Exibir o resultado convertido
        System.out.println("O valor em milímetros é: " + 
                df.format(milimetros));

    }
}

