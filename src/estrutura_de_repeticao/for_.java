package estrutura_de_repeticao;

import java.util.Scanner;
import java.util.Arrays;

public class for_ {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                // Questão 01
//            String[] nome = {"nome1","nome2","nome3","nome4","nome5","nome6","nome7","nome8","nome9","nome10"};
//
//            for(int i=0;i<=9;i++){
//                System.out.println("Bem-Vindo "+nome[i]);
//            }

                // Questão 02
//            String[] nome = new String[5];
//            for(int i=0;i<5;i++){
//                System.out.println("Informe um nome:");
//                nome[i] = sc.next();
//                System.out.println("Bem-Vindo "+nome[i]);
//            }

                // Questão 05
//            String[]  produtos = new String[5];
//            int[]  preco = new int[5];
//            for (int i=0;i<produtos.length;i++){
//                System.out.println("Informa um produto:");
//                produtos[i] = sc.next();
//                System.out.println("Informa o preço do produto:");
//                preco[i] = sc.nextInt();
//            }
//            for (int i=0;i< produtos.length;i++){
//                System.out.println("ID: "+(i+1)+" - Produto: "+produtos[i]+" - R$ "+preco[i]+",00");
//            }

                //Questão 05
//            String[] sabor = {"Mussarela","Peperoni","Baianinha","Portuguesa","Pernil","","","","",""};
//            double[] preco = {49.00,50.00,45.00,41.00,49.00,0,0,0,0,0};
//
//            for (int i=5;i<10;i++){
//                System.out.println("Informe um novo sabor, para futuras pizzas:");
//                sabor[i] = sc.next();
//                System.out.println("Informe um valor da pizza acima:");
//                preco[i] = sc.nextDouble();
//            }
//            for (int i=0;i<10;i++){
//                System.out.println((i+1)+" - Pizza: "+sabor[i]+" - Valor: R$ "+preco[i]);
//            }
////            System.out.println(Arrays.asList(sabor));
//
//            double media = (preco[0]+preco[1]+preco[2]+preco[3]+preco[4]+preco[5]+preco[6]+preco[7]+preco[8]+preco[9])/10;
//            System.out.printf("O Valor Média do em cada pizza é R$ %.2f%n",media);
//
//            double maior = preco[0];
//            double menor = preco[0];
//
//            for(int i=0;i<10;i++) {
//                double atual = preco[i];
//                if(maior<atual) maior = atual;
//                if(menor>atual) menor = atual;
//            }
//            System.out.printf("A pizza mais cara é no valor de R$ %.2f%n",maior);
//            System.out.printf("A pizza mais barata é no valor de R$ %.2f%n",menor);
        // Questão 06
//            System.out.println("Informe um numero de inicio:");
//            int num1 = sc.nextInt();
//            System.out.println("Informe um numero de termino:");
//            int num2 = sc.nextInt();
//            for(int i = num1;i<=num2;i++){
//                if(i%3==0){
//                    if(i%43==0) {
//                        System.out.println("N° "+i);
//                        System.out.println("Jeckbot !!!");
//                        break;
//                    }else {
//                        System.out.println("N° "+i);
//                    }
//                }else if(i%3>=1){
//                    if(i%43==0) {
//                        System.out.println(i+" não é divisivel por 3.");
//                        System.out.println("Jeckbot !!!");
//                        break;
//                    }else {
//                        System.out.println(i+" não é divisivel por 3.");
//                    }
//                }else {
//                    System.out.println("voce fez alguma coisa de errado, concerte !!!");
//                }
//            }
        //Questão 07
//        for(int i=0;i<=14;i++){
//            System.out.println("N°"+i+" Informe um numero:");
//            num[i] = sc.nextInt();
//        }
//
//        int max=num[0];
//        int min=num[0];
//
//        for(int i=0;i<=14;i++){
//            int atual = num[i];
//            if(atual>max) max = atual;
//            if(atual<min) min = atual;
//        }
//
//        System.out.println("O numero maior é "+max);
//        System.out.println("O numero menor é "+min);



    }
}
