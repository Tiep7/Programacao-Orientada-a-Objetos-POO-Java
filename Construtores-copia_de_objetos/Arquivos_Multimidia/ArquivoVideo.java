package multimidia;
public class ArquivoVideo extends ArquivoMultimidia {
    private String arquivo;
    int largura, altura;
    public ArquivoVideo(String nomeArquivo, int largura, int altura) {
        super(nomeArquivo);
        arquivo = nomeArquivo;
        this.largura = largura;
        this.altura = altura;
    }
    @Override
    public String toString() {
        return "Video: " + arquivo  + " (" + largura + " x " + altura + ")";
    }
    
}
