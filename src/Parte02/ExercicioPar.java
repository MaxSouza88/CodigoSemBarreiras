package Parte02;

import java.util.Scanner;

public class ExercicioPar {

    public static void main (String [] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = in.nextInt();

        if (numero % 2 == 0) {
            System.out.println("É um numero par");}

        else{
                System.out.println("É um numero ímpar");

            }


        }
    }


