package vetores_array;

import java.util.ArrayList;
import java.util.Arrays;

public class array_list {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Google");
        lista.add("Facebook");
        lista.add("Youtube");
        lista.add("Linkedin");
        lista.add("Dell");
        lista.add("LG");
        lista.add(6,"Positivo");
        lista.add("Samsung");
        System.out.println(lista);
        System.out.println(lista.get(0));
        System.out.println(lista.set(3,"Tikotok"));
        System.out.println(lista);
        System.out.println(lista.remove(3));
        System.out.println(lista);
        System.out.println(lista.contains("Samsung"));
        System.out.println(lista.indexOf("Google")+" é indice da array acima.");
        System.out.println(lista.lastIndexOf("Google"));
        System.out.println(lista.size());
        System.out.println(lista.isEmpty());
        //lista.clear(); // Limpar todos os conteudos que contem na lista
        //lista.toArray();
        System.out.println(lista.subList(3,6));
        System.out.println(lista.addAll(Arrays.asList("NVigia","Nokia","Aston Martin")));
        System.out.println(lista);
    }
}
