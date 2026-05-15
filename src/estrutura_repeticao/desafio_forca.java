package estrutura_repeticao;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class desafio_forca {
    public static void main(String[] args) {
        Random gerador = new Random();
        Scanner sc = new Scanner(System.in);

        String[] nomes = {"ana","golias","davi","matias"};
        int aleatorio = gerador.nextInt(nomes.length); // gerador de index aleatorio dentro do array nomes
//        StringBuilder nome = new StringBuilder(nomes[aleatorio]); // variavel contendo o valor da array nomes
        String nome = nomes[aleatorio];// gerador do nome da array nome

        StringBuilder linhas = new StringBuilder("");

        ArrayList<String> letras = new ArrayList<String>(nome.length());

        for (int j = 0; j < nome.length(); j++) { // esse estrutura repete os underline na quantidade da palavra da força
            linhas.append("_");
        }

        for (int i = 0; i < nome.length(); i++) {
            System.out.println("Informe uma letra:");
            System.out.println(linhas);
            String resposta = sc.next();

            if (nome.contains(resposta)) {
                letras.add(resposta);
                System.out.println("A palavra secreta tem a letra "+ resposta);
                for (int j = 0; j <nome.length() ; j++){
                    if (nome.charAt(j) == resposta.charAt(0)) {
                        linhas.setCharAt(j,resposta.charAt(0));
                    }
                }
                System.out.println(linhas);
                if (nome.contentEquals(linhas)){
                    System.out.println("@@@ Parabéns voce acerto @@@");
                    break;
                }
            }
            else System.out.println("A palavra secreta não tem a letra "+resposta);
        }
    }
}