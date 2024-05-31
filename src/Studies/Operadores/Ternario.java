package Operadores;

public class Ternario {
    public static void main(String[] args) {

        // classe Operadores.java

        int a, b;

        a = 5;
        b = 6;

        String resultado;
        // EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "false";


        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String valor = (a==b) ? "verdadeiro" : "false";

        System.out.println(resultado);
        System.out.println(valor);
    }
}
