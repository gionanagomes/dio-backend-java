package edu.giovanna.aula01;

public class Exemplo004 {
    public static void main (String [] args) {
        String primeiroNome = "Giovanna";
        String segundoNome = "Rodrigues";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
