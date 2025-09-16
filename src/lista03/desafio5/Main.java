package lista03.desafio5;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Valentina", "123.456.789-00", "001", "Banco X", "Rua A", 1000);
        ContaBancaria conta2 = new ContaBancaria("João", "987.654.321-00", "002", "Banco Y", "Rua B", 500);

        conta1.deposito(200);
        conta1.saque(150);
        conta1.pix(100);
        conta1.transferencia(conta2, 300);

        conta1.verificarSaldo();
        conta1.verificarInformacoes();
        conta1.alterarEndereco("Rua Nova, 123");

        conta1.taxaManutencaoMensal(20);
        conta1.calcularJuros(0.05);

        conta1.fecharConta();
        conta1.saque(50);
    }
}