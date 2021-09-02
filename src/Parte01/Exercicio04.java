package Parte01;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println( "Digite o total de Eleitores");
        double totalDeEleitores = scanner.nextDouble();
        System.out.println( "Digite o total de votos Brancos");
        double votosBrancos = scanner.nextDouble();
        System.out.println( "Digite o total de Votos Nulos");
        double votosNulos = scanner.nextDouble();

          double votosValidos = ( totalDeEleitores - votosBrancos - votosNulos);
        System.out.println( " O Total de Votos Validos é: " + votosValidos);

        System.out.println( "O percentual de Votos Brancos é:" + votosBrancos * 100 / totalDeEleitores + "%");
        System.out.println( "O percentual de Votos Nulos é:" + votosNulos * 100 / totalDeEleitores+ "%");
        System.out.println( "O percentual de Votos Validos é:" + votosValidos * 100 / totalDeEleitores+ "%");

        scanner.close();

    }
    }
