package estrutura_condicional;

import java.util.Scanner;

public class switchCase {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um numero, de 1 a 7: ");
        int dia = sc.nextInt();
        switch(dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Informe um dia válido");
        }

    }
}