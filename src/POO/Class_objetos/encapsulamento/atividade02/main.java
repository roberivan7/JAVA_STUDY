package POO.Class_objetos.encapsulamento.atividade02;

public class main {

    public static void main(String[] args) {
        celular cel = new celular();
        cel.resultado();
        System.out.println("Nivel de Brilho: "+cel.setBrilho()+"%");
    }

}
