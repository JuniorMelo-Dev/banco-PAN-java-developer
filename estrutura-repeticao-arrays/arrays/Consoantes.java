import java.util.Scanner;

/*
Faça um Programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*String[] consoantes = new String[6];
        int quantConsoantes = 0;

        String vogais = "a, e, i, o, u";
        int count = 0;

        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if(!(letra.equalsIgnoreCase(vogais)) ){
                consoantes[count] = letra;
                quantConsoantes++;
            }
            count++;
        } while (count < consoantes.length);

        System.out.println("Quantidade de Consoantes: " + quantConsoantes);
        System.out.println("Consoantes: ");
        for (String consoante : consoantes) {
            if(consoante != null)
            System.out.println(consoante + "");
        }*/

        String[] consoantes = new String[6];
        int quantConsoantes = 0;
        int count = 0;

        do {
            System.out.println("Insira Letras: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u")) 
            ) {
                consoantes[count] = letra;
                quantConsoantes++;
            }
            count++;

        } while (count < consoantes.length);

        for (String consoante : consoantes) {
            System.out.println(consoante);
        }

        scan.close();
        System.out.println("");
        System.out.println("Fim do Programa...");
        System.out.println("");
    }
}
