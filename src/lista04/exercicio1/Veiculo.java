package lista04.exercicio1;

public abstract class Veiculo {
    String marca;
    String modelo;
    int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public abstract String getInformacoes();
}

class Carro extends Veiculo {
    int numeroDePortas;

    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public String getInformacoes() {
        return "Carro:\nMarca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano + "\nPortas: " + numeroDePortas;
    }
}

class Moto extends Veiculo {
    String tipoDeGuidao;

    public Moto(String marca, String modelo, int ano, String tipoDeGuidao) {
        super(marca, modelo, ano);
        this.tipoDeGuidao = tipoDeGuidao;
    }

    @Override
    public String getInformacoes() {
        return "Moto:\nMarca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano + "\nGuidão: " + tipoDeGuidao;
    }
}
