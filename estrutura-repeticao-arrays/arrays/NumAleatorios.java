import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

public class NumAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numAleatorios = new int[20];

        for(int i = 0; i < numAleatorios.length; i++) {
            int num = random.nextInt(100);
            numAleatorios[i] = num;
        }

        System.out.println("Gerando números aleatórios: ");
        for (int num : numAleatorios) {
            System.out.print(num + " ");
        }

        System.out.println(" ");

        System.out.println("\nAntecessor dos números aleatórios: ");
        for (int num : numAleatorios) {
            System.out.print((num - 1) + " ");
        }

        System.out.println(" ");
        
        System.out.println("\nSucessores dos números aleatórios: ");
        for (int num : numAleatorios) {
            System.out.print((num + 1) + " ");
        }
    }
}