package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        double valorInserido = entrada.nextDouble() * 100;
        int[] notas = {10000, 5000, 2000, 1000, 500, 200};
        int[] moedas = {100, 50, 25, 10, 5, 1};

        System.out.println("NOTAS:");
        for (int nota : notas) {
            int quantidadeNotas = (int) (valorInserido / nota);
            System.out.printf("%d nota(s) de R$%.2f%n", quantidadeNotas, nota / 100.0);
            valorInserido %= nota;
        }

        System.out.println("MOEDAS:");
        for (int moeda : moedas) {
            int quantidadeMoedas = (int) (valorInserido / moeda);
            System.out.printf("%d moeda(s) de R$%.2f%n", quantidadeMoedas, moeda / 100.0);
            valorInserido %= moeda;
        }

        entrada.close();
    }
}
