package lista01.exercicio3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        final double SALARIO_BASE = 2000.00; // constante para o salário base
        final double VALOR_HORA_EXTRA = 50.00; // constante para o valor da hora extra

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de horas extras trabalhadas: ");
        int horasExtras = scanner.nextInt();

        double salarioTotal = SALARIO_BASE + (horasExtras * VALOR_HORA_EXTRA);

        System.out.println("O salário total do funcionário é: R$ " + salarioTotal);

        scanner.close();
    }
}