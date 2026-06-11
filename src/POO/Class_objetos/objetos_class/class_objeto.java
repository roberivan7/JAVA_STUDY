package POO.Class_objetos.objetos_class;


class carro {
    String modelo;
    String cor;
    String marca;

    public static void acao(){
        System.out.println("Vruuuuum");
    }
}

class bicicleta {
    String marca;
    String velocidadeAtual;

    public static void acelerar(){
        System.out.println("Acelerandoooo ...");
    }

    public static void frear(){
        System.out.println("Freandoooooo ...");
    }
}

public class class_objeto {

    static void main(String[] args) {
        carro car = new carro();
        car.modelo = "SUV";
        car.cor = "Roxo";
        car.marca = "Masserati";

        car.acao();

        bicicleta bike = new bicicleta();
        bike.marca = "caloi";
        bike.velocidadeAtual = "10km/h";

        bike.acelerar();
        bike.frear();
    }
}
