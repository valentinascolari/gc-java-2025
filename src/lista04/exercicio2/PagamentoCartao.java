package lista04.exercicio2;

public class PagamentoCartao implements Pagamento {
    private String nomeDoTitular;

    public PagamentoCartao(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }

    @Override
    public int processarPagamento() {
        System.out.println("Processando pagamento com cartão do titular: " + nomeDoTitular);
        return 1; // só para indicar sucesso
    }
}
