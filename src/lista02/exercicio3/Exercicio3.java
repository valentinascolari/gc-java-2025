package lista02.exercicio3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua comida favorita: ");
        String input = scanner.nextLine();
        scanner.close();
        System.out.println(palavraAoContrario(input));
    }

    public static String palavraAoContrario(String comida) {
        char[] comidaAoContrario = new char[comida.length()];

        int contador = 0;
        for (int i = comida.length() - 1; i >= 0; i--) {
            comidaAoContrario[contador] = comida.charAt(i);
            contador++;
        }
        return new String(comidaAoContrario);
    }
}