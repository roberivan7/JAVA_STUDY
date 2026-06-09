package metodos_funcoes;
import java.util.Scanner;

public class metodos_return {
    public int soma(int a, int b) {
        return a+b;
    }

    public int subtracao(int x, int y) {
        return x-y;
    }

    public int multiplicacao(int b, int c){
        return b*c;
    }

    public String nome() {
        return "Roberivan";
    }

    public void mensagem(){
        System.out.println("Hello Google"); // esse não iremos utilizar o return pois estamos inserido o modificador void no metodo, que isso significa que o metodo não retorna um valor.
    }

}

class up {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        metodos_return apk = new metodos_return();
        System.out.println(apk.soma(5,8));
        System.out.println(apk.nome());
        apk.mensagem();
        System.out.println(apk.subtracao(5,9));

        System.out.println("Informe um valor, para criar uma tabela:");
        int a = sc.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println(a+" x "+i+" = "+apk.multiplicacao(i,a));
        }
    }
}

class calculadora {
    public static void soma (int num1, int num2){
        int resultado = num1+num2;
        System.out.println(resultado);
    }

    public static void subtracao (int num1, int num2){
        int resultado = num1-num2;
        System.out.println(resultado);
    }

    public static void multiplicacao (int num1, int num2){
        int resultado = num1*num2;
        System.out.println(resultado);
    }

    public static void divisao (int num1, int num2){
        int resultado = num1/num2;
        System.out.println(resultado);
    }
}

class app {
    static void main(String[] args) {
        calculadora.soma(5,4);
        calculadora.divisao(5,4);
        calculadora.multiplicacao(5,4);
        calculadora.subtracao(5,4);
    }
}

