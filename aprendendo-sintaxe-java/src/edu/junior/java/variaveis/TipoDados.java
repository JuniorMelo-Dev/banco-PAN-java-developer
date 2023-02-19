package edu.junior.java.variaveis;

public class TipoDados {
    public static void main(String[] args) {

        // criando tipos de dados básicos
        byte idade = 33;
        short ano = 2023;
        int cep = 61700000;
        long cpf = 14015612348L;
        float pi = 3.14F;
        double salario = 1302.55;

        System.out.println(idade);
        System.out.println(ano);
        System.out.println(cep);
        System.out.println(cpf);
        System.out.println(pi);
        System.out.println(salario);

        // criando tipo "CONSTANTE" usando "final"
        String meuNome = "Junior Melo"; //variável comum
        System.out.println(meuNome);

        final int MINHA_SENHA = 1223; //variável não pode mudar de valor
        //MINHA_SENHA = 1224;
        System.out.println(MINHA_SENHA);
    }
}