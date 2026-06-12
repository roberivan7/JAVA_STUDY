package POO.Class_objetos.encapsulamento.atividade02;

import java.util.Scanner;

public class celular {

    private String valores;
    private int brilho;

    public void resultado (){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("""
                    Voce quer mecher nas configurações do celular:
                    [1] - Sim
                    [2] - Não
                    """);
            int choose = sc.nextInt();
            if (choose == 1){
                System.out.println("""
                        ========== Configurações ==========
                            Qual é a sua escolha:
                            
                            [1] - Brilho
                            [2] - Fazer uma Ligação
                        ===================================
                        """);
                int escConf = sc.nextInt();
                if (escConf == 1){
                    int nivelBrilho = 50;
                    while(true) {
                        System.out.println("Nivel do Brilho está " + nivelBrilho + "%");
                        System.out.println("""
                                ========= Brilho =========
                                [1] - Aumentar Brilho
                                [2] - Diminuir Brilho
                                [3] - Sair
                                ==========================
                                """);
                        int nivel = sc.nextInt();
                        if (nivel == 1 && nivelBrilho <= 90) {
                            nivelBrilho+=10;
                            brilho = nivelBrilho;
                            continue;
                        } else if (nivel == 2 && nivelBrilho > 0) {
                            nivelBrilho-=10;
                            brilho = nivelBrilho;
                            continue;
                        } else if (nivel == 1 && nivelBrilho > 90){
                            System.out.println("Voce não pode aumentar o brilho pois esta em "+nivelBrilho+"%");
                            continue;
                        }else if (nivel == 2 && nivelBrilho == 0) {
                            System.out.println("Você não pode mais diminuir pois o nível do Brilho está em "+nivelBrilho+"%");
                            continue;
                        }else if(nivel == 3) break;
                    }
                }else if (escConf == 2){
                    System.out.println("Informe o numero para realizar a ligação:");
                    int call = sc.nextInt();
                    System.out.println("Ligando para (11) "+call+"\n Aguarde ...");
                    System.out.println("Chamada Finalizada ...");
                    break;
                }
            }else if (choose == 2){
                System.out.println("Obrigado e até logo.");
                break;
            }else {
                System.out.println("Caracter incorreto, programa encerrado !!!");
            }
        }
    }
    public int setBrilho(){
        return brilho;
    }
}
