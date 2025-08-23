package lista01.exercicio6;

import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float valorNota = pedirNota(scanner);
        verificarNota(valorNota);
        scanner.close();
    }

    public static float pedirNota(Scanner scanner) {
        System.out.println("Digite sua nota: ");
        return scanner.nextFloat();
    }
    public static void verificarNota(float nota){
        if (nota < 6 && nota > 0) {
            System.out.println("Reprovado!");

        } else if (nota >= 6 && nota <= 10) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Nota inválida");

        }
    }
}