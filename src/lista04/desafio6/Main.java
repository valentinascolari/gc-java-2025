package lista04.desafio6;

public class Main {
    public static void main(String[] args) {
        Divida d1 = new DividaCartao("João", 1000.0);
        Divida d2 = new DividaEmprestimo("Maria", 2000.0);

        NegociadorDeDividas negociador = new NegociadorDeDividas();

        negociador.aplicarNegociacao(d1);
        negociador.aplicarNegociacao(d2);
    }
}
