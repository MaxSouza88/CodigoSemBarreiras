package Parte01;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // comando para ler o que foi digitado
        Integer numero = scanner.nextInt();


        System.out.println( "O antecessor é:");
        System.out.println( numero - 1);

     scanner.close();
    }

    }

