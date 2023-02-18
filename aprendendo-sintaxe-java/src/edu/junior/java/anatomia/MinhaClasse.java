package edu.junior.java.anatomia;

public class MinhaClasse {
    public static void main(String[] args) {
        
        //criando métodos
        String primeiroNome = "Junior";
        String segundoNome = "Melo";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
