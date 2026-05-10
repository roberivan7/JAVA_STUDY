package estrutura_repeticao;

public class expressao_condicional {
    boolean verificarAcesso(int idade, boolean temCadastro, boolean isConvidado) {
        boolean acessoLiberado = (idade >=18) && (temCadastro || isConvidado);
        return acessoLiberado;
    }
}
