package metodos_funcoes;

import java.sql.SQLOutput;
import java.util.Scanner;

class metodo {
    public static void olamundo() {
        System.out.println("Olá Mundo");
    }

    public static void niver() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o seu nome: ");
        System.out.println("Feliz Aniversario "+sc.nextLine());
    }

    public static void soma() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um valor:");
        int num1 = sc.nextInt();
        System.out.println("Informe outro valor:");
        int num2 = sc.nextInt();
        System.out.println(num2+num1);
    }
    public static void niver2(String nome) {
        System.out.println("Feliz Aniversario "+nome);
    }

    public static void soma2(int num1, int num2) {
        System.out.println(num1+num2);
    }

    public double multiplicacao(double num1, double num2) {
        return num1*num2;
    }

    public static void calculador() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um valor:");
        int num1 = sc.nextInt();
        System.out.println("Informe outro valor:");
        int num2 = sc.nextInt();

        System.out.println("Informe em sinal da operação que voe quer realizar o calculo ? (+-*/):");
        String sinal = sc.next();
        if (sinal.equals("+")) System.out.println(num1+"+"+num2+"="+(num1+num2));
        else if (sinal.equals("-")) System.out.println(num1+"-"+num2+"="+(num1-num2));
        else if (sinal.equals("*")) System.out.println(num1+"x"+num2+"="+num1*num2);
        else if (sinal.equals("/")) System.out.println(num1+"/"+num2+"="+num1/num2);
        else System.out.println("Sinal errado, por favor tente novamente !!!");
    }
}

public class exercicios {
    static void main(String[] args) {
        metodo ex = new metodo();
//        ex.olamundo();
//        ex.niver();
//        ex.soma();
//        ex.soma2(70,20);
//        ex.niver2("Luan Nascimeto");
//        System.out.println(ex.multiplicacao(5,8));
        ex.calculador();

    }
}