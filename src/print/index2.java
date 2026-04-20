package print;

import java.util.Scanner; // Esse é o jeito certo de importante uma biblioteca no JAVA.

public class index2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Questão 01
//        System.out.println("Qual é a sua nota final ?");
//        int nota = sc.nextInt();
//
//        if (nota>50) {
//            System.out.println("Voce foi aprovado, Parabéns !!!");
//        }else {
//            System.out.println("Voce foi reprovado infelizmente !!!");
//        }
        // Questão 02
//        System.out.println("Informe o seu salário: ");
//        int salario = sc.nextInt();
//
//        if (salario>=5000) {
//            System.out.println("Voce irá pagar IF, o valor seria R$ "+salario*0.05);
//        }else {
//            System.out.println("Voce não precisará pagar o IF !!!");
//        }

        // Questão 03
//        System.out.println("Informe o valor de vendas Empresa: ");
//        int venda_e = sc.nextInt();
//
//        if (venda_e >= 200000) {
//            System.out.println("Meta Atingida da Empresa !!!");
//            System.out.print("Agora Informe o valor de vendas do funcionario: ");
//            int vendas_f = sc.nextInt();
//            System.out.print("Informe o seu salario: ");
//            int salario = sc.nextInt();
//            if (vendas_f >= 15000) {
//                if (vendas_f >=  30000) {
//                    System.out.println("Voce ganhou 20%, o valor do seu salário mais o bonus é R$ "+((salario*0.2)+salario));
//                }else if (vendas_f >= 15000) {
//                    System.out.println("Voce ganhou 10%, o valor do seu salário mais o bonus é R$ "+((salario*0.1)+salario));
//                }
//            }else {
//                System.out.println("Voce não vai receber bonus somente o seu salario !!!");
//            }
//        } else if(venda_e < 200000) {
//            System.out.println("Meta não atingida tente novamente mês que vem !!!");
//        }else {
//            System.out.println("Não sei o que é isso !!!");
//        }
        // Questão 04
//
//        System.out.println("Informe a nota do aluno: ");
//        int nota = sc.nextInt();
//
//        if (nota >= 50 ){
//            System.out.println("Voce foi aprovado !!!");
//        }else if (nota < 50 && nota >=40){
//            System.out.println("Voce esta de recuperação 2");
//        }else if (nota < 40 && nota >= 20){
//            System.out.println("Voce esta de recuperação 1");
//        }else if (nota < 20){
//            System.out.println("Voce esta reprovado !!!");
//        }

        // Questão 05

        System.out.println("""
                Qual senai voce faz parte ?
                [1] - Senai Vila Alpina
                [2] - Senai Mooca
                """);
        int escolha = sc.nextInt();

        System.out.println("Informe a sua nota: "); //((30*100)/80)
        int nota = sc.nextInt();
        System.out.println("Informe a sua frequência em presença \n(total de presença é 80, se caso faltou 2 dias, total é 78: ");
        double frequencia = sc.nextInt();
        double aulas_total = 80;
        double media_frequencia = (frequencia*100)/aulas_total; // Esse resultado ira me retorna em porcentagem, porém não em valor decimal

        if (escolha == 1) { // Senai Vila Alpina
            if (nota >= 60 && media_frequencia >= 75.0) {
                System.out.println("Voce foi aprovado !!!");
            }else {
                System.out.println("Voce foi reprovado infelizmente !!!");
            }
        }else if (escolha == 2) { // Senai Mooca
            if (nota >= 50 && media_frequencia >= 75.0) {
                System.out.println("Voce foi aprovado !!!");
            }else {
                System.out.println("Voce foi reprovado infelizmente !!!");
            }
        }


    }
}

