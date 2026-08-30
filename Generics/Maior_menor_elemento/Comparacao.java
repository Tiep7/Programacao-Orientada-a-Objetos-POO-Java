/*Escreva a classe Comparacao (pacote geometria) que possui dois métodos static para retornar o maior e o menor elemento do vetor v:

public static <T extends Comparable<T>> T maiorElemento(T[] v) 
public static <T extends Comparable<T>> T menorElemento(T[] v) */

package geometria;
public class Comparacao {
    public static <T extends Comparable<T>> T maiorElemento(T[] v) {
        if (v == null || v.length == 0) {
            return null;
        }
        T elem = v[0];
        for (int i = 1; i < v.length; i++) {
            if (elem.compareTo(v[i]) < 0) {
                elem = v[i];
            }
        }
        return elem;
    }
    public static <T extends Comparable<T>> T menorElemento(T[] v) {
        if (v == null || v.length == 0) {
            return null;
        }
        T elem = v[0];
        for (int i = 1; i < v.length; i++) {
            if (elem.compareTo(v[i]) > 0) {
                elem = v[i];
            }
        }
        return elem;
    }
}
