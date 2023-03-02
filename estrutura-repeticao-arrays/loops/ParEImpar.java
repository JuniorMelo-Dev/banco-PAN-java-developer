import java.util.Scanner;

/*
 Faça um programa que peça N números inteiros. Calcule e mostre a quantidade de números pares e a quantidade de números impares.
 */

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variáveis do mesmo tipo
        int quantNum, num, count = 0, par = 0, impar = 0;

        System.out.print("Quantidade de Números: ");
        quantNum = scan.nextInt();

        do {
            System.out.print("Número: ");
            num = scan.nextInt();

            if (num % 2 == 0) par++;
            else impar++;

            count++;
        } while(count < quantNum);

        System.out.println(" ");
        System.out.println("Números Pares: " + par);
        System.out.println(" ");
        System.out.println("Números Ímpares: " + impar);

        scan.close();
        System.out.println(" ");
        System.out.println("Fim do Programa...");
        System.out.println(" ");
    }
}
