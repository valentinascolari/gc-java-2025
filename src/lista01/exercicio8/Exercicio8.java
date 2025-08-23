package lista01.exercicio8;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

// considerando a data atual como o dia de votação

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diaNascimento = solicitarDiaNascimento(scanner);
        int mesNascimento = solicitarMesNascimento(scanner);
        int anoNascimento = solicitarAnoNascimento(scanner);
        int idade = idadePessoa(anoNascimento, mesNascimento, diaNascimento);
        verificarEleitor(idade);
        scanner.close();
    }

    public static int solicitarDiaNascimento(Scanner scanner) {
        System.out.println("Digite o dia em que você nasceu: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public static int solicitarMesNascimento(Scanner scanner) {
        System.out.println("Digite o mês em que você nasceu: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public static int solicitarAnoNascimento(Scanner scanner) {
        System.out.println("Digite o ano em que você nasceu: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public static int idadePessoa(int ano, int mes, int dia) {
        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        LocalDate hoje = LocalDate.now();
        Period idade = Period.between(dataNascimento, hoje);
        return idade.getYears();
    }

    public static void verificarEleitor(int idade) {
        if (idade >= 16) {
            System.out.println("Poderá votar esse ano");
        }
        else{
            System.out.println("Não poderá votar esse ano");
        }
    }
}