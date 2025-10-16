package timeattack1.desafio3;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = solicitarNome(scanner);
        String sobrenome = solicitarSobrenome(scanner);
        int idade = solicitarIdade(scanner);
        String frase = solicitarFrase(scanner);
        System.out.println(
                nome + "\n" +
                sobrenome  + "\n" +
                idade + "\n" +
                frase);
        scanner.close();
    }
    public static String solicitarNome(Scanner scanner){
        System.out.println("Qual é o seu primeiro nome?");
        String nome = new String(scanner.nextLine());
        return nome;
    }

    public static String solicitarSobrenome(Scanner scanner){
        System.out.println("Qual é o seu sobrenome?");
        String sobrenome = new String(scanner.nextLine());
        return sobrenome;
    }

    public static int solicitarIdade (Scanner scanner){
        System.out.println("Qual é o sua idade?");
        int idade = Integer.parseInt(scanner.nextLine());
        return idade;
    }

    public static String solicitarFrase(Scanner scanner){
        System.out.println("Qual é o sua frase favorita?");
        String frase = new String(scanner.nextLine());
        return frase;
    }
}