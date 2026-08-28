package chat;
public abstract class Mensagem {
    private int likes;
    private Mensagem resposta;
    public Mensagem() {
        likes = 0;
        resposta = null;
    }
    public int getLikes() {
        return likes;
    }
    public Mensagem getResposta() {
        return this.resposta;
    }
    public void like() {
        likes++;
    }
    public void responder(Mensagem resposta) {
        this.resposta = resposta;
    }
    public abstract String getRepresentacao();
    public abstract String getRepresentacaoSemLikes();
}
