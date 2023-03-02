import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.

Ex.: 5! = 5.4.3.2.1 = 120
*/


public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número e veja o Fatorial: ");
        int numFatorial =  scan.nextInt();
        System.out.println("OK... Exibindo Fatorial de " + numFatorial);

        int mult = 1;
        for (int i = numFatorial; i >= 1; i--) {
            mult = mult * i;
        }
        System.out.println("");
        System.out.println(numFatorial + "! = " + mult);

        scan.close();
        System.out.println("");
        System.out.println("Fim do Programa...");
        System.out.println("");
    }
}
