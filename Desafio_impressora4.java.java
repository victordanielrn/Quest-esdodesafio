package org.example;
import java.util.Scanner;

public class Desafio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Número de casos de teste
        scanner.nextLine(); // Consumir a quebra de linha

        for (int i = 0; i < n; i++) {
            String linha = scanner.nextLine().trim();
            String linhaDecifrada = desembaralharLinha(linha);
            System.out.println(linhaDecifrada);
        }

        scanner.close(); // Fechar o scanner após a leitura
    }

    public static String desembaralharLinha(String linha) {
        int tamanho = linha.length();
        int metade = tamanho / 2;
        String parteEsquerda = new StringBuilder(linha.substring(0, metade)).reverse().toString();
        String parteDireita = new StringBuilder(linha.substring(metade)).reverse().toString();
        return parteEsquerda + parteDireita;
    }
}





