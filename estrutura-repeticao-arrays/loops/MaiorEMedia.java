import java.util.Scanner;

/*
Faça um programa que leia 5 números e informe o maior número e a média desses números.
*/

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int max = 0;
        int count = 0;
        int somar = 0;
        
        do {
            System.out.print("Digite um número: ");
            num = scan.nextInt();
            somar = somar + num;

            if(num > max) max = num;

            count++;

        } while(count < 5);
        System.out.println("------------------------");
        System.out.println("O Maior número digitado foi: " + max);
        System.out.println("A Média desses números é: " + (somar/5));

        scan.close();
        System.out.println("------------------");
        System.out.println("Fim do Programa...");
        System.out.println("------------------");
    }
}