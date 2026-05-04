package vetores_array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class arrayList_exe {
    public static void main(String[] args) {
        // Questão 01
//        ArrayList<Integer> idade = new ArrayList<>();
//
//        idade.add(15);
//        idade.add(14);
//        idade.add(10);
//        idade.add(25);
//        System.out.println(idade);

        //Questão 02
//        String[] nome = new String[10];
//        nome[0] = "Ivan";
//        nome[1] = "Anderson";
//        nome[2] = "Livia";
//        nome[3] = "Ana";
//        nome[4] = "Bia";
//        nome[5] = "Lucia";
//        nome[6] = "Liliane";
//        nome[7] = "Marcos";
//        nome[8] = "Lucas";
//        nome[9] = "Matheus";
//        System.out.println("Bem vindo(a) "+nome[0]);
//        System.out.println("Bem vindo(a) "+nome[1]);
//        System.out.println("Bem vindo(a) "+nome[2]);
//        System.out.println("Bem vindo(a) "+nome[3]);
//        System.out.println("Bem vindo(a) "+nome[4]);
//        System.out.println("Bem vindo(a) "+nome[5]);
//        System.out.println("Bem vindo(a) "+nome[6]);
//        System.out.println("Bem vindo(a) "+nome[7]);
//        System.out.println("Bem vindo(a) "+nome[8]);
//        System.out.println("Bem vindo(a) "+nome[9]);

        //Questão 03
        String[] nome = {"Ivan","Anderson","Livia","Ana","Bia"};
        int[] idade = {25,19,20,14,18};

        for(int i = 0; i >= 11;i++){
            System.out.println("A pessoas "+nome[i]+" tem "+idade[i]+" anos.");
        }






    }
}
