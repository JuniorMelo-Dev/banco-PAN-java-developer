
/*
Faça um Programa que leia um vetor de 5 números inteiros
e mostre-os na ordem inversa.
*/

public class OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {1, -8, -59, 526, 12, 3201};

        int count = 0;
        System.out.print("Vetor posição normal: ");
        while(count < (vetor.length)){
            System.out.print(vetor[count] + " ");
            count++;
        }
        System.out.println("");
        System.out.print("Vetor posição inversa: ");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

    }
}
