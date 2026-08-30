/*Escreva a classe FilaArquivos (pacote arquivos) que gerencia uma fila de arquivos e possui um parâmetro de tipo T. Nessa fila, os arquivos são organizados pela ordem que foram enfileirados. Quem é enfileirado primeiro é desenfileirado primeiro também (FIFO - first in first out).

A classe FilaArquivos deve implementar a interface Fila<T>.*/
package arquivos;
import java.util.ArrayList;
public class FilaArquivos<T> implements Fila<T> {
    private ArrayList<T> fila;
    private int tamanho;
    public FilaArquivos(int n) {
        fila = new ArrayList<>(n);
        tamanho = n;
    }
    
    public boolean enfileirar(T arquivo) {
        if (fila.size() == tamanho) {
            return false;
        }
        fila.add(arquivo);
        return true;
    }
    public T desenfileirar() {
        if (fila.size() == 0) {
            return null;
        }
        T arquivo = fila.get(0);
        fila.remove(0);
        return arquivo;
    }
}
