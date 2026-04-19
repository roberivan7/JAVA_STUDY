package estudojava.firstprogram.learnedmore;

import java.security.spec.RSAOtherPrimeInfo;

public class Aula2Primitivos {
    static void main(String[] args) {
        //int, float, char, byte, short, long, boolean, double, são escrita em letra minuscula.
        int age = (int) 10L;
        long numeroGrande  = (long) 250.89d;
        double salarioDouble = 150.5;
        float salariofloat = 125.0f;
        byte ageByte = (byte) 129   ;
        short valorShort = 300;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Roberivan";
        System.out.println("A idade seria "+age+" anos !!!");
        System.out.println("long = "+numeroGrande);
        System.out.println("double = "+salarioDouble);
        System.out.println("float = "+salariofloat);
        System.out.println("byte = "+ageByte);
        System.out.println("short = "+valorShort);
        System.out.println("boolean 1 = "+verdadeiro);
        System.out.println("boolean 2 = "+falso);
        System.out.println("char = "+caractere);
        System.out.println("Meu nome é "+nome);

    }
}
