package lista02.exercicio2;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = pedirString(scanner);

    }

    public static String pedirString(Scanner scanner){
        System.out.println("Digite uma palavra: ");
        return scanner.nextLine();
    }


}