package lista04.desafio6;

public abstract class Divida {
    protected String cliente;
    protected double valorOriginal;

    public Divida(String cliente, double valorOriginal) {
        this.cliente = cliente;
        this.valorOriginal = valorOriginal;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValorOriginal() {
        return valorOriginal;
    }

    public abstract double negociar();
}
