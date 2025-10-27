package list6.challenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase:");

        String frase = sc.nextLine();

        frase = frase.toLowerCase();

        String[] palavras = frase.split("\\s+");

        Map<String, Integer> contador = new HashMap<>();

        for (String palavra : palavras) {
            contador.put(palavra, contador.getOrDefault(palavra, 0) + 1);
        }

        System.out.println(contador);

        sc.close();
    }
}
