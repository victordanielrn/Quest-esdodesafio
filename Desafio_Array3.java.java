package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Desafio3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt(); // Tamanho do array
            int k = scanner.nextInt(); // Valor alvo

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt(); // Elementos do array
            }

            int count = countPairs(arr, k);
            System.out.println("Número de pares: " + count);
        }

        private static int countPairs(int[] arr, int k) {
            Map<Integer, Integer> frequencyMap = new HashMap<>();
            int count = 0;

            for (int num : arr) {
                int complement = num - k;
                if (frequencyMap.containsKey(complement)) {
                    count += frequencyMap.get(complement);
                }

                int complement2 = num + k;
                if (frequencyMap.containsKey(complement2)) {
                    count += frequencyMap.get(complement2);
                }

                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }

            return count;
        }


}
