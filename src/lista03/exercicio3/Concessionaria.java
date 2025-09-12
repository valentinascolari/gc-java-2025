package lista03.exercicio3;

import lista03.exercicio2.Carro;

public class Concessionaria {
    private Carro[] carros = new Carro[10];
    private int quantidade = 0;

    public void adicionarCarro(Carro carro) {
        if (quantidade < carros.length) {
            carros[quantidade] = carro;
            quantidade++;
            System.out.println("Carro adicionado com sucesso!");
        } else {
            System.out.println("Não é possível adicionar mais carros. Capacidade máxima atingida.");
        }
    }
    
    public void listarCarros() {
        if (quantidade == 0) {
            System.out.println("Nenhum carro cadastrado.");
        } else {
            for (int i = 0; i < quantidade; i++) {
                System.out.println("Carro " + (i + 1) + ":");
                carros[i].exibirDados();
                System.out.println("--------------------");
            }
        }
    }

    public static void main(String[] args) {
        Concessionaria concessionaria = new Concessionaria();

        Carro carro1 = new Carro("Vermelho", 30.5f, "XYZ-9876", true);
        Carro carro2 = new Carro("Preto", 60.0f, "ABC-1234", false);

        concessionaria.adicionarCarro(carro1);
        concessionaria.adicionarCarro(carro2);

        System.out.println("\nLista de carros cadastrados:");
        concessionaria.listarCarros();
    }
}