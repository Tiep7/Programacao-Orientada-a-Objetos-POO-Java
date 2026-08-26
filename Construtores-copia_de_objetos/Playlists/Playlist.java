package multimidia;
public class Playlist implements Cloneable {
    private ArquivoMultimidia[] VetorArquivo;
    private int indice = 0;
    public Playlist() {
        VetorArquivo = new ArquivoMultimidia[100];
    }
    public void adicionarItem(ArquivoMultimidia arquivo) {
        VetorArquivo[indice] = arquivo;
        indice++;
    }
    public void renomearItem(int indiceArquivo, String novoNomeArquivo) {
        VetorArquivo[indiceArquivo].setNomeArquivo(novoNomeArquivo);
    }
    public void moverParaInicio(int indiceArquivo) {
        ArquivoMultimidia aux = VetorArquivo[indiceArquivo];
        for (int i = indiceArquivo; i > 0; i--) {
            VetorArquivo[i] = VetorArquivo[i - 1];
        }
        VetorArquivo[0] = aux;
    }
    public String[] listarArquivos() {
        String[] arq = new String[indice];
        for (int i = 0; i < indice; i++) {
            arq[i] = VetorArquivo[i].getNomeArquivo();
        }
        return arq;
    }
    @Override
    public Playlist clone() throws CloneNotSupportedException {
        Playlist novaPlaylist = (Playlist)super.clone();
        novaPlaylist.VetorArquivo = this.VetorArquivo.clone(); 
        for (int i = 0; i <= this.indice; i++) {
            if (this.VetorArquivo[i] != null) {
                novaPlaylist.VetorArquivo[i] = this.VetorArquivo[i].clone();
            }
        }
        return novaPlaylist;
    }
}
