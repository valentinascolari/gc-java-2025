package lista01.exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        System.out.println(nome);
        System.out.println(somaDoisNumeros(1, 2));
    }
    public static int somaDoisNumeros(int a, int b){
        return a + b;
    }
    public static int subtracao(int a, int b){
        return a - b;
    }
}



