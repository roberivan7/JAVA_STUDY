package metodos_funcao;
import java.util.Scanner;

public class metodos {

    static class app {
        public void calcularMedia(double a, double b, double c, double d){
            double media = (a+b+c+d)/2;
            System.out.println("Media: "+media);
        }
    }

    class upp {
        public static void main(String[] args) {
            app apk = new app();
            apk.calcularMedia(5,8,6,4);
        }
    }

    static class ifood {
        public int soma(int a, int b) {
            return a+b;
        }

        public int subtracao(int x, int y) {
            return x-y;
        }

        public static int multiplicacao(int b, int c){
            return b*c;
        }

        public String nome() {
            return "Roberivan";
        }

        public void mensagem(){
            System.out.println("Hello Google"); // esse não iremos utilizar o return pois estamos inserido o modificador void no metodo, que isso significa que o metodo não retorna um valor.
        }

    }

    class ok {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            ifood api = new ifood();
            System.out.println(api.soma(5,8));
            System.out.println(api.nome());
            api.mensagem();
            System.out.println(api.subtracao(5,9));

            System.out.println("Informe um valor, para criar uma tabela:");
            int a = sc.nextInt();
            for(int i=0;i<=10;i++){
                System.out.println(a+" x "+i+" = "+ifood.multiplicacao(i,a));
            }
        }
    }
}
