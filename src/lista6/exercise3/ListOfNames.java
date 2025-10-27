package lista6.exercise3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ListOfNames {
    public static void main(String[] args) {
        Set<String> students = new HashSet<>();
        students.add("Ana");
        students.add("BruNo");
        students.add("Carla");
        students.add("Diego");

        Set<String> namesLowerCase = new HashSet<>();
        for (String name: students) {
            namesLowerCase.add(name.toLowerCase());
        }

        Scanner sc = new Scanner(System.in);
        String askName = askNameStudent(sc);

        if (namesLowerCase.contains(askName.toLowerCase())) { // Usa contains() para verificar a existência do elemento
            System.out.println("O nome " + askName + " está presente no conjunto.");
        } else {
            System.out.println("O nome " + askName + " não está presente no conjunto.");
        }

        sc.close();
    }

    public static String askNameStudent(Scanner sc) {
        System.out.println("Digite o nome do estudante:  ");
        return sc.nextLine();
    }
}
