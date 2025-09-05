package lista02.exercicio2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palavra = pedirString(scanner);
        imprimirPrimeiraMetade(palavra);
        scanner.close();
    }

    public static String pedirString(Scanner scanner) {
        System.out.println("Digite uma palavra: ");
        return scanner.nextLine();
    }

    public static void imprimirPrimeiraMetade(String palavra) {
        int tamanho = palavra.length();
        int metade = tamanho / 2;

        System.out.println("A primeira metade da palavra é:");


        for (int i = 0; i < metade; i++) {
            System.out.print(palavra.charAt(i));
        }
        System.out.println();
    }
}