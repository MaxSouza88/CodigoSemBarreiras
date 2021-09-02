package Parte02;

import java.util.Scanner;

public class MenorNumero {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o Primeiro Numero: ");
        Integer numA = in.nextInt();

        System.out.println("Digite o Segundo Numero: ");
        Integer numB = in.nextInt();

        if (numA < numB){
            System.out.println( " O menor numero é: " + numA);
        }
        else if (numB < numA){
            System.out.println( " O menor numero é: " + numB);

        }
    in.close();

    }
}