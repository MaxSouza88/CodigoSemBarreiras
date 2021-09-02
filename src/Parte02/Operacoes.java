package Parte02;

import java.util.Scanner;

public class Operacoes {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int numA = in.nextInt();

        System.out.println("Digite outro valor: ");
        int numB = in.nextInt();

        System.out.println("Digite a operação desejada: 1 - Adição,2-Subtração, 3-Multiplicação, 4-Divisão. ");
        int escolha = in.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("A soma dos números é: " + (numA + numB));
                break;
            case 2:
                System.out.println("A subtração dos números é: " + (numA - numB));
                break;
            case 3:
                System.out.println("A Multiplicação dos números é: " + (numA * numB));
                break;
            case 4:
                System.out.println("A Divisão dos números é: " + (numA / numB));
                break;

        }

        in.close();
    }
}
