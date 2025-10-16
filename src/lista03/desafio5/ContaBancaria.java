package lista03.desafio5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ContaBancaria {
    private String nome;
    private String cpf;
    private String identificadorConta;
    private String banco;
    private String endereco;
    private double saldo;
    private LocalDateTime horarioAtual;
    private boolean ativa = true;

    public ContaBancaria(String nome, String cpf, String identificadorConta, String banco, String endereco, double saldoInicial) {
        this.nome = nome;
        this.cpf = cpf;
        this.identificadorConta = identificadorConta;
        this.banco = banco;
        this.endereco = endereco;
        this.saldo = saldoInicial;
        this.horarioAtual = LocalDateTime.now();
    }


    public void saque(double valor) {
        if (!ativa) {
            System.out.println("Conta está encerrada. Operação não permitida.");
            return;
        }
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
        } else {
            System.out.println("Erro: Saldo insuficiente ou valor inválido.");
        }
    }

    public void deposito(double valor) {
        if (!ativa) {
            System.out.println("Conta está encerrada. Operação não permitida.");
            return;
        }
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso. Novo saldo: " + saldo);
        } else {
            System.out.println("Erro: valor de depósito inválido.");
        }
    }

    public void pix(double valor) {
        if (!ativa) {
            System.out.println("Conta está encerrada. Operação não permitida.");
            return;
        }
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("PIX de R$" + valor + " realizado com sucesso. Saldo atual: " + saldo);
        } else {
            System.out.println("Erro: Saldo insuficiente ou valor inválido.");
        }
    }

    public void transferencia(ContaBancaria destino, double valor) {
        horarioAtual = LocalDateTime.now();
        int hora = horarioAtual.getHour();

        if (!ativa) {
            System.out.println("Conta está encerrada. Operação não permitida.");
            return;
        }
        if (hora < 8 || hora > 19) {
            System.out.println("Erro: Transferências só podem ser feitas entre 8h e 19h.");
            return;
        }
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            destino.deposito(valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso.");
        } else {
            System.out.println("Erro: saldo insuficiente ou valor inválido.");
        }
    }

    public void verificarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    public void verificarHorario() {
        horarioAtual = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Horário atual: " + horarioAtual.format(formato));
    }

    public void verificarInformacoes() {
        System.out.println("=== Informações da Conta ===");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Conta: " + identificadorConta);
        System.out.println("Banco: " + banco);
        System.out.println("Endereço: " + endereco);
        System.out.println("Saldo: " + saldo);
    }

    
    public void alterarEndereco(String novoEndereco) {
        this.endereco = novoEndereco;
        System.out.println("Endereço atualizado com sucesso!");
    }

    public void taxaManutencaoMensal(double taxa) {
        if (saldo >= taxa) {
            saldo -= taxa;
            System.out.println("Taxa de manutenção de R$" + taxa + " debitada. Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para cobrar taxa de manutenção.");
        }
    }

    public void calcularJuros(double taxa) {
        double juros = saldo * taxa;
        saldo += juros;
        System.out.println("Juros de R$" + juros + " aplicados. Novo saldo: " + saldo);
    }

    public void fecharConta() {
        ativa = false;
        saldo = 0;
        System.out.println("Conta encerrada com sucesso.");
    }
}