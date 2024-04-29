//tarefa_java1.2

import java.text.DecimalFormat;
import java.util.Scanner;

/*
Crie um programa que converta libras em euros à taxa de câmbio 
do dia 09-01-2024.
Formate com 2 decimais.
*/

public class converter_libras_euros {

    public static void main(String[] args) {
        // Definir o formato desejado para a saída
        DecimalFormat df = new DecimalFormat("0.00 Euros");

        // Criar um Scanner para receber a entrada do usu�rio
        Scanner teclado = new Scanner(System.in);

        // Solicitar o valor em libras
        System.out.print("Digite o valor em libras: ");
        double libras = teclado.nextDouble();

        // Inserir a taxa de câmbio do dia 09-01-2024
        double taxaCambio = 1.16; // Pode sempre atualizar

        // Converter e exibir o resultado
        System.out.println("O valor em euros é: " + 
                df.format(libras*taxaCambio));

    }
}
