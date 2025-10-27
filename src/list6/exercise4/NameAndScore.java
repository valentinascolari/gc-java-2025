package list6.exercise4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NameAndScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Double> listNamesAndScores = new HashMap<>();

        System.out.print("Quantos alunos deseja inserir? ");
        int numberOfStudents = sc.nextInt();
        sc.nextLine();

        System.out.println("Insira o nome e a nota de cada aluno no formato 'Nome - Nota':");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Aluno " + (i + 1) + ": ");
            String inputLine = sc.nextLine();

            String[] parts = inputLine.split(" - ");
            if (parts.length == 2) {
                String name = parts[0].trim().toLowerCase();
                double score = Double.parseDouble(parts[1].trim());

                listNamesAndScores.put(name, score);
            } else {
                System.out.println("Formato inválido. Use 'Nome - Nota'.");
                i--;
            }
        }

        System.out.println("\n--- Consulta de notas ---");
        System.out.print("Digite o nome do aluno para ver a nota (ou 'sair' para encerrar): ");
        String askName = sc.nextLine();

        while (!askName.equalsIgnoreCase("sair")) {
            String searchName = askName.toLowerCase().trim();

            if (listNamesAndScores.containsKey(searchName)) {
                Double score = listNamesAndScores.get(searchName);
                System.out.println("Nota de " + askName + ": " + score);
            } else {
                System.out.println("Aluno '" + askName + "' não encontrado.");
            }

            System.out.print("Digite outro nome ou 'sair': ");
            askName = sc.nextLine();
        }
        System.out.println("Programa encerrado.");
        sc.close();
    }
}