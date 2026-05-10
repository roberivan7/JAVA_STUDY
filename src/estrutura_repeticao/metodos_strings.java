package estrutura_repeticao;

import java.util.Scanner;

public class metodos_strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "ROBERIVAN";
        String sobrenome = " Santos ";
        System.out.println(nome.toLowerCase());
        System.out.println(sobrenome.toUpperCase());
        System.out.println(sobrenome.trim());
        System.out.println(sobrenome.substring(5));
        System.out.println(nome.substring(1,4));
        System.out.println(nome.replace("ROB","BOB"));
        System.out.println(nome.indexOf("A")); // Esse metodo serve para mostrar em qual posição esta o caracter
        System.out.println(nome.lastIndexOf(nome));
        System.out.println(nome.length()); // Esse metodo serve para contar e retornar o valor de todas as caracter de uma variavel string.
        System.out.println(nome.contains(sobrenome));
        System.out.println(nome.equals("ROBERIVAN"));
        System.out.println(nome.compareToIgnoreCase(nome));
    }
}