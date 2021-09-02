package Diversos;

import java.util.Scanner;

public class Ex02 {
      public static void main(String[] args) {

                /*
         * Faça um programa para calcular a série de Fibonacci para um número informado pelo usuário,
         * sendo F(0) = 0, F(1) = 1 e F(n)= F(n-1)+F(n-2)  Por exemplo, caso o usuário informe o
         * número 9, o resultado seria: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
         * */

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o tamanho da série Fibonacci");
        int tamanhoDaSerie = in.nextInt();

        int n1 = 1;
        int n2;
        int fibonacci = 0;


        for (int i = 0; i <= tamanhoDaSerie; i++) {
            n2 = fibonacci;
            fibonacci = n1 + fibonacci;
            n1 = n2;
            System.out.print(n1 + " ");
        }

        in.close();
    }

}


