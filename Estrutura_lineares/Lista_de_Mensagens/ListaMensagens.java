/*O professor ABC está desenvolvendo um programa de chat, mas falta implementar algumas classes. 
Neste exercício, implemente as classes ListaMensagens, Mensagem, MensagemTexto e MensagemImagem (todas as classes são do pacote chat).*/
package chat;
public class ListaMensagens {
    private Mensagem[] mensagem;
    private int qtd;
    public ListaMensagens() {
        this.mensagem = new Mensagem[10];
        qtd = 0;
    }
    public void adicionarMensagem(Mensagem mensagem) {
        this.mensagem[qtd] = mensagem;
        qtd++;
    }
    public void responderMensagem(int indiceMensagemOriginal, Mensagem resposta) {
        resposta.responder(this.mensagem[indiceMensagemOriginal]);
        adicionarMensagem(resposta);
    }
    public Mensagem[] getMensagens() {
        Mensagem[] resultado = new Mensagem[qtd];

        for (int i = 0; i < qtd; i++) {
            resultado[i] = mensagem[i];
        }
    
        return resultado;
    }
    public String[] getMensagensString() {
        String[] texto = new String[qtd];
        for (int i = 0; i < qtd; i++) {
            texto[i] = this.mensagem[i].getRepresentacao();
        }
        return texto;
    }
    public void like(int indiceMensagem) {
        this.mensagem[indiceMensagem].like();
    }

}
class MensagemTexto extends Mensagem {
    private String texto;
    public MensagemTexto(String texto) {
        this.texto = texto;
    }
    @Override
    public String getRepresentacao() {
        if (getResposta() == null) {
            return texto + " (likes=" + getLikes() + ")";
        }
    
        return texto + " RESPOSTA A [" 
               + getResposta().getRepresentacaoSemLikes() 
               + "] (likes=" + getLikes() + ")";
    }
    @Override
    public String getRepresentacaoSemLikes() {
        if (getResposta() == null) {
            return texto;
        }

        return texto + " RESPOSTA A ["
            + getResposta().getRepresentacaoSemLikes()
            + "]";
    }    
}
class MensagemImagem extends Mensagem {
    private String arquivoImagem;
    private int largura;
    private int altura;
    public MensagemImagem(String arquivoImagem, int largura, int altura) {
        this.arquivoImagem = arquivoImagem;
        this.largura = largura;
        this.altura = altura;
    }
    @Override
    public String getRepresentacao() {
        String resultado = arquivoImagem + " " + largura + "x" + altura;
    
        if (getResposta() != null) {
            resultado += " RESPOSTA A [" 
                      + getResposta().getRepresentacaoSemLikes() 
                      + "]";
        }
    
        resultado += " (likes=" + getLikes() + ")";
    
        return resultado;
    }
    
    @Override
    public String getRepresentacaoSemLikes() {
        String descricao = arquivoImagem + " " + largura + "x" + altura;

        if (getResposta() == null) {
            return descricao;
        }

        return descricao + " RESPOSTA A ["
                + getResposta().getRepresentacaoSemLikes()
                + "]";
        }
}
