/*Classe abstrata ArquivoMultimidia:

Construtor: public ArquivoMultimidia(String nomeArquivo, int tamanho) - construtor que inicializa o nome do arquivo e o tamanho.
Métodos:
public final String getNomeArquivo() - retorna o nome do arquivo.
public final int getTamanhoArquivo() - retorna o tamanho do arquivo.
public final void setNomeArquivo(String nomeArquivo) - alterna o nome do arquivo.*/
package multimidia;
public abstract class ArquivoMultimidia {
    private String nomeArquivo;
    private int tamanho;
    public ArquivoMultimidia(String nomeArquivo, int tamanho) {
        this.nomeArquivo = nomeArquivo;
        this.tamanho = tamanho;
    }
    public final String getNomeArquivo() {
        return this.nomeArquivo;
    }
    public final int getTamanhoArquivo() {
        return this.tamanho;
    }
    public final void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }
    
}
