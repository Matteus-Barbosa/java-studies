package Studies.MiniProjetos.BancoDigitalPOO;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Mateus");

        Banco banco = new Banco("Banco Exemplo");

        Conta cc = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupanca(cliente1);
        Conta salario = new ContaSalario(cliente1);

        banco.adicionarConta(cc);
        banco.adicionarConta(poupanca);
        banco.adicionarConta(salario);

        cc.depositar(100);
        cc.transferir(50, poupanca);
        cc.transferir(20, salario);

        banco.imprimirRelatorio();
    }
}
