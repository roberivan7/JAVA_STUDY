package estrutura_de_repeticao;

import java.util.Scanner;

public class switchCase {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um numero, de 1 a 7: ");
        int dia = sc.nextInt();
        switch(dia) {
            case 1:
                System.out.println("Dom");
                break;
            case 2:
                System.out.println("Seg");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Qui");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sab");
                break;
            default:
                System.out.println("Informe um dia válido");
        }

    }
}