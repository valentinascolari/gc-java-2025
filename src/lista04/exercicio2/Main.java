package lista04.exercicio2;

public class Main {
    public static void main(String[] args) {
        Pagamento pagamento1 = new PagamentoCartao("Valentina Scolari");
        Pagamento pagamento2 = new PagamentoBoleto(123456);


        pagamento1.processarPagamento();
        pagamento2.processarPagamento();
    }
}
