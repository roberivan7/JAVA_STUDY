package numeros_calculo;

import java.util.Scanner;

public class numeros {
    public static void main() {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Informe um numero: ");
//        String numero = sc.nextLine();
//        System.out.println(numero);

        System.out.println("Informe a sua altura: ");
        double altura = Double.parseDouble(sc.nextLine()); // o parseInt converte tudo que está entre parentese em numero inteiro
        System.out.println("A sua altura é "+(altura+1.10)+"m");

        System.out.println("Informe um valor: ");
        int numeroint = sc.nextInt();
        double numerodou = (double) numeroint; // Nessa linha eu forcei um numero inteira ser convertido para numero decimal.
        System.out.print(numerodou);

    }
}
