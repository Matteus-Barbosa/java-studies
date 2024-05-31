package Studies.stdinJava.Scanner;

import java.util.Scanner; // Importando do pacote java.util a classe Scanner

public class StdinJava {
    public static void main(String[] args) {
        // Criando o objeto scanner:
        Scanner scanner = new Scanner(System.in);

        // Coletando dados do usuário:
        System.out.println("Digite o seu nome: ");
        String nome = (scanner.next());
        System.out.println("Digite seu Sobrenome: ");
        String sobrenome = (scanner.next());
        System.out.println("Digite a sua idade: ");
        int idade = (scanner.nextInt());
        System.out.println("Por fim, digite a sua altura: ");
        double altura = (scanner.nextDouble());

        // Imprimindo os resultados obtidos:
        System.out.println("Ola, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + "cm ");

    }
}