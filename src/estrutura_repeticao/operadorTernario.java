package estrutura_repeticao;

import java.util.Scanner;

public class operadorTernario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua idade");
        int idade = sc.nextInt();

        String status = idade >=18 ? "Voce é de maior !!!" : "Voce é um criança vaza !!!"; // Esse seria um if else simplificado e mais simples e ocupa menas linhas
        System.out.println(status);
// ------------------------------------------------------------------------------------------------
        System.out.println("Informe sua nota:");
        int nota = sc.nextInt();

        String resultado = nota >=6 ? "Você esta aprovado !!!" : "Voce esta reprovado !!!";
        System.out.println(resultado);

    }
}
