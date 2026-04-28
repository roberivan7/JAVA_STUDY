package estrutura_condicional;

import java.util.Scanner;

public class metodos_strings_ex {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        //questão 01
//        System.out.println("Informe seu nome:");
//        System.out.println(sc.next().toUpperCase());

        //Questão 02
//        String senha = "SENAI102";
//        System.out.print("Informe a senha: ");
//        String tentativa = sc.next().toUpperCase();
//
//        if(tentativa.equals(senha)) {
//            System.out.print("Acesso Permitido !!!");
//        }else {
//            System.out.print("Senha Incorreta !!!");
//        }

        // Questão 03
//        System.out.println("Informe seu CPF, com pontos e traços:");
//        System.out.println(sc.next().replace(".","").replace("-","").length() == 11 ? "CPF confirmado !!!" : "CPF invalidado !!!"); // Esse linha serve como expressão logico utilizando operador ternario

        //Questão 04
        System.out.println("Informe seu nome:");
        String nome = sc.nextLine();
        int space = nome.indexOf(" ");
        int fim = nome.lastIndexOf(nome);

//        System.out.println(nome.substring(10));
        System.out.println(nome.substring(0,space));
        System.out.println(nome.substring(space+1));
        System.out.println(nome);




    }
}
