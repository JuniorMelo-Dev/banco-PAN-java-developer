import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo até que o usuário informe um valor válido.
*/

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.print("Insira a nota: ");
        nota = scan.nextInt();

        while (nota < 0 | nota > 10){
            System.out.println("Nota Inválida.. Tente Novamente...");
            System.out.print("Insira a nota: ");
            nota = scan.nextInt();
        }
        
        scan.close();
        System.out.println("Fim do Programa...");
    }
}