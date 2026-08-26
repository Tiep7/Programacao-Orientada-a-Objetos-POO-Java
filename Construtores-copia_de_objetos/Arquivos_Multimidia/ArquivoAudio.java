package multimidia;
public class ArquivoAudio extends ArquivoMultimidia {
    private String nomeArquivo;
    private boolean audioHD;
    public ArquivoAudio(String nomeArquivo, boolean audioHD) {
        super(nomeArquivo);
        this.nomeArquivo = nomeArquivo;
        this.audioHD = audioHD;
    }
    @Override
    public String toString() {
         return "Audio: " + nomeArquivo  + " (HD = " + audioHD + ")";
    }
}
