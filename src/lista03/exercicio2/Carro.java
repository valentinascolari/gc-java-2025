package lista03.exercicio2;

public class Carro {
    String cor;
    float nivelCombustivel;
    String placa;
    boolean ligado;

    public Carro(){

    }

    public Carro(String corParametro, float nivelCombParametro, String placaParametro, boolean ligadoParametro) {
        cor = corParametro;
        nivelCombustivel = nivelCombParametro;
        placa = placaParametro;
        ligado = ligadoParametro;
    }

    public void exibirDados() {
        System.out.println("A cor do carro é: " + this.cor);
        System.out.println("O nível de combustível do carro é: " + this.nivelCombustivel);
        System.out.println("A placa do carro é: " + this.placa);
        System.out.println("O carro está ligado? " + this.ligado);
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro(
                "preto",
                50.5f,
                "ABC-1234",
                true
        );

        carro1.exibirDados();
    }
}