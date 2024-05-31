package Studies.MiniProjetos.ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroConta;
        String agencia, nomeCliente;
        final double SALDO = 10476.89;

        //Exibir mensagens para o Usuário:
        System.out.println("Olá! Por favor digite o seu nome : ");
        nomeCliente = (scanner.next());
        System.out.println("Oi "+ nomeCliente + ", por gentileza digite o número da sua conta: ");
        numeroConta = (scanner.nextInt());
        System.out.println("Ótimo, agora o número digite sua Agência (ex:067-8): ");
        agencia = (scanner.next());

        //Exibir mensagem final:
        System.out.println("Olá " + nomeCliente + "! Obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + " conta " + numeroConta + " e seu saldo de " + SALDO + " já está disponível para saque.");
        System.out.println("Aproveite o seu dia ;)");
    }
}