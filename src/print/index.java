package print;
import java.util.Scanner; // Esse é o jeito certo de importante uma biblioteca no JAVA.


public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Essa linha serve para voce chamar um funcionalidade "Scanner" porém tal funcionalidade não tem no java, existi em uma biblioteca nesse caso voce terá importa, se percebe acima desse codigo tem o jeito certo de importar uma biblioteca.
        // Acima nos conseguimos inserir um "apelido" para a funcionalidade Scanner que seria nesse caso o "sc", etnão sempre que chamarmos o "sc" teremos utilizamos o Scanner, pois essa funcionalidade serve para coletar as informações do usuario.

        System.out.println("Hello world");
        System.out.println("Qual é o seu nome ?"); // Esse linha serve para printar algo na tela.
        String nome = sc.next(); // Essa linha serve para o java realizar um input para o cliente e assim escrever uma informações nela.
        System.out.println("Bom dia "+nome+" !!!"); // Esse irá imprimir algo na tela porém e juntamente dentro de parenteses tem o jeito de certo de concatenar um variavel com uma string.
        System.out.println(25+10); //soma
        System.out.println(30-10); //subtração
        System.out.println(30/2); //divisão
        System.out.println(10*2); //multiplicação

        //Questão 01
        System.out.println("Qual é o seu nome ?");
        String nome5 = sc.next();
        System.out.println("Bom dia Sr(a) "+nome5+", Tudo bem ?");

        //Questão 02
        System.out.println("Qual é a sua idade? ");
        int idade = sc.nextInt();
        System.out.println("Voce tem "+idade+" anos e falta "+(100-idade)+" anos para completar 100 anos");

        //Questão 03
        System.out.println("Me informe outro nome !?");
        String nome2 = sc.next();
        System.out.println(nome+" e "+nome2+" comparecerão na festa");

        //Questão 04
        System.out.println("Sistema de Orçamento");
        System.out.println("Me informe o valor do item 1");
        int item1 = sc.nextInt();
        System.out.println("Me informe o valor do item 2");
        int item2 = sc.nextInt();
        System.out.println("Me informe o valor do item 3");
        int item3 = sc.nextInt();
        System.out.println("Me informe o valor do item 4");
        int item4 = sc.nextInt();
        System.out.println("Me informe o valor do item 5");
        int item5 = sc.nextInt();
        System.out.println("O valor total do Orçamento é R$ "+(item1+item2+item3+item4+item5)+",00");

        //Questão 05
        int num1=1, num2=6, num3=85, num4=564, num5=90, num6=23, num7=65, num8=233, num9=94, num10=100;
        System.out.print(num1+"\n"+num2+"\n"+num3+"\n"+num4+"\n"+num5+"\n"+num6+"\n"+num7+"\n"+num8+"\n"+num9+"\n"+num10+"\n");

        // Questão 06
        System.out.println("Qual é o seu nome ?");
        String nome6 = sc.next();
        System.out.println("Qual é a sua idade ?");
        int idade7 = sc.nextInt();
        System.out.println("Qual seria o seu salario ?");
        int salario = sc.nextInt();
        System.out.println("Informe o valor total das suas dispesas: ");
        int despesas = sc.nextInt();
        int despesas_total = salario-despesas;
        System.out.println("O "+nome6+" recebe "+salario+" tendo "+idade7+" anos e tem "+despesas_total+" disponível ao fim do mês");

    }
}
