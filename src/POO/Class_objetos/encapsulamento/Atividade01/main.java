package POO.Class_objetos.encapsulamento.Atividade01;

public class main {
    private String nome;
    private int cpf;

    public void setNome(String nome){
        if(nome.length() >=3 && nome.matches(".*[aeiou].*"))    this.nome = nome;
        else System.out.println("Erro.");
    }

    public String getNome(){
        return nome;
    }

    public static class encapulamento {
        public static void main(String[] args) {
    //        pessoa p1 = new pessoa();
    //        p1.setNome("Romero");
    //        System.out.println(p1.getNome());


        }

    }
}
