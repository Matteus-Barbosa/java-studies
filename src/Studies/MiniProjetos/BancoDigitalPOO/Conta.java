package Studies.MiniProjetos.BancoDigitalPOO;

import java.util.ArrayList;
import java.util.List;

// Classe abstrata Conta
public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected List<String> historicoTransacoes;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.historicoTransacoes = new ArrayList<>();
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
        registrarTransacao("Saque de: " + valor);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        registrarTransacao("Depósito de: " + valor);
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
        registrarTransacao("Transferência de: " + valor + " para conta: " + contaDestino.getNumero());
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void imprimirExtrato() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println("Histórico de Transações: ");
        for (String transacao : historicoTransacoes) {
            System.out.println(transacao);
        }
    }

    protected void registrarTransacao(String transacao) {
        historicoTransacoes.add(transacao);
    }
}