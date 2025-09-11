package lista03.exercicio3;

import lista03.exercicio2.Carro;
import java.util.Scanner;

public class Concessionaria {
    private Carro[] armazenarCarro = new Carro[10];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidade = 0;
        Carro carro = new Carro();
        String listaCarros = listarCarros(carro);


    }


    public void adicionarCarro(Carro carro, int quantidade){
        if(quantidade < armazenarCarro.length){
            armazenarCarro[quantidade] = carro;
            quantidade++;
        }

    }
    public static String listarCarros(Carro carro){
        return "teste";
    }
}
