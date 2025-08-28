package lista01.desafioLista1;
import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float salario = solicitarSalario(scanner);
        String nivel = solicitarNivel(scanner);
        calcularSalario(nivel, salario);
        scanner.close();
    }

    public static float solicitarSalario(Scanner scanner) {
        System.out.println("Digite o seu salário: ");
        float salario = scanner.nextFloat();
        scanner.nextLine(); // pra consumir o enter do buffer
        return salario;
    }

    public static String solicitarNivel(Scanner scanner) {
        System.out.println("Digite se o seu nível é ouro, platina ou diamante: ");
        return scanner.nextLine();
    }

    public static void calcularSalario(String nivel, float salario) {
        switch (nivel.toLowerCase()) {
            case "ouro":
                float salarioOuro = (float) ((salario * 0.10) + salario);
                System.out.println("Seu salário recalculado é: " + salarioOuro);
                break;
            case "platina":
                float salarioPlatina = (float) ((salario * 0.25) + salario);
                System.out.println("Seu salário recalculado é: " + salarioPlatina);
                break;
            case "diamante":
                float salarioDiamante = (float) ((salario * 0.30) + salario);
                System.out.println("Seu salário recalculado é: " + salarioDiamante);
                break;
            default:
                System.out.println("Nível inválido.");
        }
    }
}