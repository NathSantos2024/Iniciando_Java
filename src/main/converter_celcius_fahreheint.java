//tarefa_java1.4

/*
Crie um programa que converta graus Celsius em Fahrenheit.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class converter_celcius_fahreheint {
    
    public static void main(String[] args) {
        // Definir o formato desejado para a saída
        DecimalFormat df = new DecimalFormat("0.0 ºF");

        // Criar um Scanner para receber a entrada do usu�rio
        Scanner teclado = new Scanner(System.in);

        // Solicitar a temperatura em graus Celsius
        System.out.print("Digite a temperatura em graus Celsius(ºC): ");
        double celsius = teclado.nextDouble();

        // Converter graus Celsius para Fahrenheit (F = C×1.8+32)
        double fahrenheit = celsius*1.8+32;

        // Exibir o resultado convertido
        System.out.println("A temperatura em Fahrenheit é: " + 
                df.format(fahrenheit));

    }
}