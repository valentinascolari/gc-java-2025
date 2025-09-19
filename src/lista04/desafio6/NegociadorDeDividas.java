package lista04.desafio6;

public class NegociadorDeDividas {

    public void aplicarNegociacao(Divida divida) {
        double valorNegociado = divida.negociar();
        System.out.println("Cliente: " + divida.getCliente());
        System.out.println("Valor original: R$ " + divida.getValorOriginal());
        System.out.println("Valor negociado: R$ " + valorNegociado);
        System.out.println("---------------------------");
    }
}
