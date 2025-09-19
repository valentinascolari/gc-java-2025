package lista04.desafio6;

public class DividaCartao extends Divida {

    public DividaCartao(String cliente, double valorOriginal) {
        super(cliente, valorOriginal);
    }

    @Override
    public double negociar() { // 20% de desconto pra negociar
        return valorOriginal * 0.8;
    }
}
