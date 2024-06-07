package Studies.MiniProjetos.BancoDigitalPOO;

public class ContaSalario extends Conta {
    public ContaSalario(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Salário ===");
        super.imprimirExtrato();
    }
}