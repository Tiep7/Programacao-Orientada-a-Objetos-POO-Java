/*Classe Playlist:

Construtor: esta classe deve possuir apenas o construtor sem parâmetros, que inicializa a playlist sem nenhum arquivo. Uma playlist pode ter no máximo 10 arquivos.
Métodos:
public void adicionarItem(ArquivoMultimidia arquivo) - adiciona um arquivo mulmídia no final da lista de arquivos. Se, ao adicionar um arquivo, a playlist já estava com 10 arquivos (limite máximo), deve ser lançada a exceção QuantidadeLimiteArquivos e o arquivo não é adicionado. A exceção QuantidadeLimiteArquivos é subclasse de Exception (mas não de RuntimeException) e seu construtor deve chamar o construtor da superclasse Exception com a mensagem "Quantidade limite de arquivos foi atingida.".
public void renomearItem(int indiceArquivo, String novoNomeArquivo) - altera o nome de um arquivo na lista de arquivos da playlist. Se o índice especificado não for válido (não há arquivo no índice especificado), deve ser lançada a exceção IndiceArquivoInvalido. A exceção IndiceArquivoInvalido é subclasse de Exception (mas não de RuntimeException) e seu construtor deve chamar o construtor da superclasse Exception com a mensagem "Indice de arquivo invalido = %d" (observe que não há acento na mensagem), em que o inteiro representado por %d é o valor do índice inválido que foi passado como argumento no método.
public void moverParaInicio(int indiceArquivo) - move o arquivo especificado para o início da lista. Se o índice especificado não for válido (não há arquivo no índice especificado), deve ser lançada a exceção IndiceArquivoInvalido. A exceção IndiceArquivoInvalido é a mesma que o método renomearItem pode lançar e que foi descrita anteriormente.
public String[] listarArquivos() - retorna um vetor de String com os retornos do método toString() dos arquivos na playlist. O comprimento desse vetor é a quantidade de arquivos adicionados na playlist.
public void ordenarArquivos(int tipo) - ordena os arquivos da playlist de acordo com o tipo de ordenação especificado no parâmetro tipo.
tipo=1 - Ordena os arquivos em ordem alfabética (lexicográfica) de nome. Caso a lista tenha mais de um arquivo com o mesmo nome, use a ordem crescente do tamanho do arquivo para desempate.
tipo=2 - Ordena os arquivos em ordem crescente de tamanho do arquivo. Caso a lista tenha mais de um arquivo com o mesmo tamanho, use a ordem alfabética (lexicográfica) para desempate.*/
package multimidia;
class QuantidadeLimiteArquivos extends Exception {
    public QuantidadeLimiteArquivos() {
        super("Quantidade limite de arquivos foi atingida.");
    }
}
class IndiceArquivoInvalido extends Exception {
    public IndiceArquivoInvalido(int indiceArquivo) {
        super("Indice de arquivo invalido = " + indiceArquivo);
    }
}
public class Playlist {
    private ArquivoMultimidia[] vetorArquivos;
    private int indice = 0;
    public Playlist() {
        vetorArquivos = new ArquivoMultimidia[10];
    }
    public void adicionarItem(ArquivoMultimidia arquivo) throws QuantidadeLimiteArquivos {
        if (indice == 10) {
            throw new QuantidadeLimiteArquivos();
        }
        vetorArquivos[indice] = arquivo;
        indice++;
    }
    public void renomearItem(int indiceArquivo, String nomeArquivo) throws IndiceArquivoInvalido {
        if (indiceArquivo >= vetorArquivos.length || indiceArquivo < 0 || vetorArquivos[indiceArquivo] == null) {
            throw new IndiceArquivoInvalido(indiceArquivo);
        }
        vetorArquivos[indiceArquivo].setNomeArquivo(nomeArquivo);
    }
    public void moverParaInicio(int indiceArquivo) throws IndiceArquivoInvalido {
        if (indiceArquivo >= vetorArquivos.length || indiceArquivo < 0 || vetorArquivos[indiceArquivo] == null) {
            throw new IndiceArquivoInvalido(indiceArquivo);
        }
        ArquivoMultimidia aux = vetorArquivos[indiceArquivo];
        for (int i = indiceArquivo; i > 0; i--) {
            vetorArquivos[i] = vetorArquivos[i - 1];
        }
        vetorArquivos[0] = aux;
    }
    public String[] listarArquivos() {
        String[] resultado = new String[indice];
    
        for (int i = 0; i < indice; i++) {
    
            if (vetorArquivos[i] instanceof ArquivoVideo) {
                resultado[i] = "Video: " 
                        + vetorArquivos[i].getNomeArquivo()
                        + " (" 
                        + vetorArquivos[i].getTamanhoArquivo()
                        + ")";
    
            } else if (vetorArquivos[i] instanceof ArquivoAudio) {
                resultado[i] = "Audio: "
                        + vetorArquivos[i].getNomeArquivo()
                        + " (" 
                        + vetorArquivos[i].getTamanhoArquivo()
                        + ")";
            }
        }
    
        return resultado;
    }
    public void ordenarArquivos(int tipo) {
        int n = indice;
    
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
    
                boolean trocar = false;
    
                if (tipo == 1) {
                    // Primeiro compara pelo nome
                    int comparacaoNome = vetorArquivos[j].getNomeArquivo()
                            .compareTo(vetorArquivos[j + 1].getNomeArquivo());
    
                    if (comparacaoNome > 0) {
                        trocar = true;
                    } 
                    // Nomes iguais: compara pelo tamanho
                    else if (comparacaoNome == 0 &&
                             vetorArquivos[j].getTamanhoArquivo() > vetorArquivos[j + 1].getTamanhoArquivo()) {
                        trocar = true;
                    }
    
                } else if (tipo == 2) {
                    // Primeiro compara pelo tamanho
                    if (vetorArquivos[j].getTamanhoArquivo() > vetorArquivos[j + 1].getTamanhoArquivo()) {
                        trocar = true;
                    }
                    // Tamanhos iguais: compara pelo nome
                    else if (vetorArquivos[j].getTamanhoArquivo() == vetorArquivos[j + 1].getTamanhoArquivo() &&
                             vetorArquivos[j].getNomeArquivo()
                             .compareTo(vetorArquivos[j + 1].getNomeArquivo()) > 0) {
                        trocar = true;
                    }
                }
    
                // Realiza a troca dos arquivos
                if (trocar) {
                    ArquivoMultimidia auxiliar = vetorArquivos[j];
                    vetorArquivos[j] = vetorArquivos[j + 1];
                    vetorArquivos[j + 1] = auxiliar;
                }
            }
        }
    }
    
}
