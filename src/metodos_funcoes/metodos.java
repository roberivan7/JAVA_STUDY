package metodos_funcoes;

class upp {
        public void metodoPublico(){
            System.out.println("Todos pode chamar.");
        }

        public static void metodoEstatico() {
            System.out.println("Posso se chamado quando chame a minha class primeiro.");
        }

//        private void metodoPrivado() {
//            System.out.println("Somente a class que faço parte pode me chamar.");
//        }

        public static void helloworld() {
            System.out.println("Hello World");
        }

        public void metodoSemEstatico() {
            System.out.println("preciso de uma instancia para ser chamada.");
        }
}

public class metodos {
    static void main() {
        upp.metodoEstatico();

        upp i = new upp(); // instancia criada.
        i.metodoSemEstatico();
        i.metodoPublico();

//        i.metodoPrivado(); // Esse metodo somente na mesma class.
        upp.helloworld();

    }
}

