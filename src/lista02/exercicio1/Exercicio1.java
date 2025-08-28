package lista02.exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inicio = inicioIntervalo(scanner);
        int termino = finalIntervalo(scanner);
        calcularPrimos(inicio, termino);
        scanner.close();
    }

    public static int inicioIntervalo(Scanner scanner) {
        System.out.println("Digite o início do intervalo: ");
        int inicio = scanner.nextInt();
        return inicio;
    }

    public static int finalIntervalo(Scanner scanner) {
        System.out.println("Digite o final do intervalo: ");
        int termino = scanner.nextInt();
        return termino;
    }

    public static void calcularPrimos(int inicio, int termino) {
        if (inicio < 2) {
            inicio = 2;
        }

        if (termino < 2 || inicio > termino) {
            System.out.println("Não há números primos neste intervalo.");
            return;
        }

        System.out.println("Números primos no intervalo de " + inicio + " a " + termino + ":");
        for (int i = inicio; i <= termino; i++) {
            boolean isPrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimo = false;
                    break;
                }
            }
            if (isPrimo) {
                System.out.println(i);
            }
        }
    }
}
