package lista01.exercicio7;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float n1 = solicitarPrimeiroNumero(scanner);
        float n2 = solicitarSegundoNumero(scanner);
        float n3 = solicitarTerceiroNumero(scanner);
        Float[] numeros = {n1, n2, n3};
        System.out.println("O maior número é " + maiorNumero(n1, n2, n3));
        System.out.println("O menor número é " + menorNumero(n1, n2, n3));
        System.out.println("A média aritmética é " + mediaAritmetica(n1, n2, n3));
    }

    public static float solicitarPrimeiroNumero(Scanner scanner){
        System.out.println("Digite o primeiro número: ");
        return scanner.nextFloat();
    }

    public static float solicitarSegundoNumero(Scanner scanner){
        System.out.println("Digite o segundo número: ");
        return scanner.nextFloat();
    }

    public static float solicitarTerceiroNumero(Scanner scanner){
        System.out.println("Digite o terceiro número: ");
        return scanner.nextFloat();
    }

    public static float maiorNumero(float n1, float n2, float n3){
        return Math.max(n1, Math.max(n2, n3));
    }

    public static float menorNumero(float n1, float n2, float n3){
        return Math.min(n1, Math.min(n2,n3));
    }

    public static float mediaAritmetica(float n1, float n2, float n3){
        return ((n1 + n2 + n3) / 3);
    }
}