package vetores_array;
import java.util.LinkedList;

public class linkedlist {
     public static void main(String[] args) {

            LinkedList<String> nomes = new LinkedList<>();
            nomes.add("Roberivan");
            nomes.add("Maicon");
            nomes.add("Adriano");
            nomes.addFirst("Adriano");
            nomes.addLast("Lais");

            System.out.println(nomes);

            nomes.removeLast();
            nomes.removeFirst();

            System.out.println(nomes);
     }
}
