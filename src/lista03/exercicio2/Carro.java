package lista03.exercicio2;

public class Carro {
    String cor;
    float nivelCombustivel;
    String placa;
    boolean ligado;

    public Carro(String corParametro, float nivelCombParametro, String placaParametro, boolean ligadoParametro) {
        cor = corParametro;
        nivelCombustivel = nivelCombParametro;
        placa = placaParametro;
        ligado = ligadoParametro;
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro(
                "preto",
                50.5f,
                "ABC-1234",
                true
        );

        System.out.println("A cor do carro é: " + carro1.cor);
        System.out.println("O nível de combustível do carro é: " + carro1.nivelCombustivel);
        System.out.println("A placa do carro é: " + carro1.placa);
        System.out.println("O carro está ligado? " + carro1.ligado);
    }
}