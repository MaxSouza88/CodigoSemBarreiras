package Parte01;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        //calcular a área de um retângulo, A área do retângulo corresponde ao produto (multiplicação) da medida da base pela altura, sendo expressa pela fórmula:
        //
        //A = b x h

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o valor da base");
        double base = scanner.nextDouble();

        System.out.println(" Digite o valor da Altura");
        double altura = scanner.nextDouble();

        System.out.println("O Calculo da Área é:");  //ou System.out.println("O Calculo da Área é:" + base * altura);
        System.out.println( base * altura);

        scanner.close();

    }
    }
