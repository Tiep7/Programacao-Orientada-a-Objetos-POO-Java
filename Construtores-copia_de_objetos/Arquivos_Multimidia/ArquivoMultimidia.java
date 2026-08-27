/*Portanto, neste exercício, devem ser implementadas a superclasse ArquivoMultimidia e as subclasses ArquivoVideo e ArquivoAudio, 
conforme definido a seguir (todas as classes devem estar no pacote multimidia):

Classe ArquivoVideo (subclasse de ArquivoMultimidia):

Construtor: public ArquivoVideo(String nomeArquivo, int largura, int altura) - instancia um ArquivoVideo especificando o nome do arquivo e a resolução (largura e altura).
Método: public String toString() - sobrescreve o método toString() de Object. O retorno do método deve ser no formato "Video: %s (%d x %d)" (observe que não há acento), em que %s é o nome do arquivo e os dois inteiros indicados com %d são respectivamente largura e altura do vídeo.
 
Classe ArquivoAudio (subclasse de ArquivoMultimidia):

Construtor: public ArquivoAudio(String nomeArquivo, boolean audioHD) - instancia um ArquivoAudio especificando o nome do arquivo e se este arquivo tem áudio HD ou não.
Método: public String toString() - sobrescreve o método toString() de Object. O retorno do método deve ser no formato "Audio: %s (HD = %s)" (obseve que não há acento), 
em que o primeiro %s é o nome do arquivo e o segundo %s pode assumir o valor "true" ou "false" (true se o arquivo tem áudio HD e false caso contrário).*/

package multimidia;

public abstract class ArquivoMultimidia {
    private String nomeArquivo;

    public ArquivoMultimidia(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }
    
    public final String getNomeArquivo() {
        return this.nomeArquivo;
    }
}
