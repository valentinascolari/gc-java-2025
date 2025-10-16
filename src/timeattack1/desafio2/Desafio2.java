package timeattack1.desafio2;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = solicitarPrimeiroNumero(scanner);
        int b = solicitarSegundoNumero(scanner);
        System.out.println(somarDoisNumeros(a, b));
        scanner.close();
    }

    public static int solicitarPrimeiroNumero(Scanner scanner) {
        int a = Integer.parseInt(scanner.nextLine());
        return a;
    }

    public static int solicitarSegundoNumero(Scanner scanner) {
        int b = Integer.parseInt(scanner.nextLine());
        return b;
    }

    public static int somarDoisNumeros(int a, int b){
            return a + b;
        }
    }