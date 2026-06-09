package vetores_array;
import java.util.HashSet;

public class hashset {
        public static void main(String[] args) {

            HashSet<String> nomes = new HashSet<>();
            nomes.add("Roberivan");
            nomes.add("Ana");
            nomes.add("Matheus");
            nomes.add("Lucas");
            nomes.add("Lucas"); // o hashset impede que inserir alguma informação duplicada

            System.out.println(nomes);

        }
    }