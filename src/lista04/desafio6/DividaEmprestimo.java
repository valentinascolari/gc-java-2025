package lista04.desafio6;

// Dívida de empréstimo
public class DividaEmprestimo extends Divida {

    public DividaEmprestimo(String cliente, double valorOriginal) {
        super(cliente, valorOriginal);
    }

    @Override
    public double negociar() {
        //parcela com acrescimo de 10%
        return valorOriginal * 1.1;
    }
}
