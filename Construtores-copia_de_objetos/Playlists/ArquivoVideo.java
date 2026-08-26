package multimidia;
public class ArquivoVideo extends ArquivoMultimidia {
    private int largura, altura;
    public ArquivoVideo(String nomeArquivo, int largura, int altura) {
        super(nomeArquivo);
        this.largura = largura;
        this.altura = altura;
    }
    @Override
    public String toString() {
        String video = String.format("Video: %s (%d x %d)", getNomeArquivo(), largura, altura);
        return video;
    }
}
