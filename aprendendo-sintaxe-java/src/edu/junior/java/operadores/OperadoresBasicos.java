package edu.junior.java.operadores;

import java.util.function.DoubleToIntFunction;

public class OperadoresBasicos {
    public static void main(String[] args) {
        // Atribuição (=)
        String nome = "JuniorMelo";
        System.out.println(nome);
        // Date dataNascimento = new Date(); //atribuindo novo objeto

        // Aritmético
        double soma = 10.5 + 15.8;
        int subtracao = 2005 - 56;
        int multiplicacao = 15 * 9;
        int divisao = 91 / 7;
        int modulo = 5 % 2;
        double resultado = (10 * 8) + (15 / 6);

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);
        System.out.println(modulo);
        System.out.println(resultado);

        // Unário
        int numero = 10;
        boolean var = true;

        System.out.println(++numero);
        System.out.println(--numero);
        System.out.println(!var);
    }

}
