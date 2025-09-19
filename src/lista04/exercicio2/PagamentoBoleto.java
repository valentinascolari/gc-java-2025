package lista04.exercicio2;

public class PagamentoBoleto implements Pagamento {
    private int codigoBoleto;

    public PagamentoBoleto(int codigoBoleto) {
        this.codigoBoleto = codigoBoleto;
    }

    @Override
    public int processarPagamento() {
        System.out.println("Processando pagamento do boleto com código: " + codigoBoleto);
        return 1;
    }
}
