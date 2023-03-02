import java.util.Scanner;

/*
Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:

Tabuada do 5:
5 X 1 = 5
5 X 2 = 10
5 x ...
5 X 10 = 50
*/

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;

        System.out.print("Qual Tabuada deseja imprimir: ");
        num = scan.nextInt();
        System.out.println("OK.. Tabuada do " + num);
        System.out.println("");

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }


        scan.close();
        System.out.println("");
        System.out.println("Fim do Programa...");
        System.out.println("");
    }
}
