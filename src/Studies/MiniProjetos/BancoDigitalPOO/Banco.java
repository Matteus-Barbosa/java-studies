package Studies.MiniProjetos.BancoDigitalPOO;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void imprimirRelatorio() {
        System.out.println("=== Relatório do Banco " + nome + " ===");
        for (Conta conta : contas) {
            conta.imprimirExtrato();
        }
    }
}