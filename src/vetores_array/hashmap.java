package vetores_array;
import java.util.HashMap;

public class hashmap {
     public static void main(String[] args) {

            HashMap<String, Integer> idade = new HashMap<>();

            idade.put("Roberivan",35);
            idade.put("Ana",25);
            idade.put("Thiago",12);

            System.out.println(idade);
            System.out.println("Ana tem "+idade.get("Ana")+" anos de idade");
            atividade();
     }
// -----------------------------------------------------------------
    public static void atividade() {
         //Questão 01
         HashMap<String, Integer> idade = new HashMap<>();

         idade.put("Luis",25);
         idade.put("Arnaldo",12);
         idade.put("Matias",18);

         System.out.println(idade);

         //Questão 02
         System.out.println(idade.get("Matias"));

         //Questão 03
         System.out.println(idade.containsKey("Arnaldo"));

         //Questão 04
         idade.replace("Arnaldo",150);
         System.out.println(idade);

         //Questão 05
         idade.remove("Arnaldo",150);
         System.out.println(idade);

         //Questão 06
         System.out.println(idade.entrySet());

         //Questão 07
         idade.remove("Matias",18);
         System.out.println(idade);

         //Questão 08
         idade.remove("Arnaldo",150);
         System.out.println(idade);
     }
}