package lista6.exercise1;

import java.util.Scanner;

public class TesteNivelAcesso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nível de acesso: ");
        String entrada = sc.nextLine().toUpperCase();
        sc.close();
        try {
            NivelAcesso nivel = NivelAcesso.valueOf(entrada);
            imprimirNivelAcesso(nivel);
        } catch (IllegalArgumentException e) {
            System.out.println("Entrada inválida");
        }

    }
        static void imprimirNivelAcesso (NivelAcesso nivel){
            if (nivel == NivelAcesso.ADMIN) {
                System.out.println("O administrador pode acessar todos os recursos");
            } else if (nivel == NivelAcesso.USUARIO) {
                System.out.println("O usuario pode acessar somente a interface");
            } else if (nivel == NivelAcesso.MODERADOR) {
                System.out.println("O nivel de acesso é moderado");
            } else {
                System.out.println("Entrada inválida");
            }
        }
    }

