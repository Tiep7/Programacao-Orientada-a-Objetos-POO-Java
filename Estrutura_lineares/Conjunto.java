/*Escreva a classe Conjunto que implementa a interface Lista, 
conforme indicado no diagrama a seguir (a classe deve estar no pacote estruturas, a interface Lista está no mesmo pacote).*/

package estruturas;
public class Conjunto implements Lista {
    private int[] c = new int[100];
    private int qtd = 0;
    
    @Override
    public int getQtd() {
        return qtd;
    }
    @Override
    public void adicionar(int numero) {
        if (buscar(numero) == -1) {
            c[qtd] = numero;
            qtd++;
        }
    }
    @Override
    public void remover(int numero) {
        int posicao = buscar(numero);

        if (posicao != -1) {
            for (int i = posicao; i < qtd - 1; i++) {
                c[i] = c[i + 1];
            }
            qtd--;
        }
    }
    @Override
    public int buscar(int numero) {
        for (int i = 0; i < qtd; i++) {
            if (c[i] == numero) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public String toString() {
        String res = "";
    
        for (int i = 0; i < qtd; i++) {
            if (i > 0) {
                res += " ";
            }
            res += c[i];
        }
    
        return res;
        
    }
    public Conjunto uniao(Conjunto outro) {
        Conjunto res = new Conjunto();
        for (int i = 0; i < qtd; i++) {
            res.adicionar(c[i]);
        }
        for (int i = 0; i < outro.getQtd(); i++) {
            res.adicionar(outro.c[i]);
        }
        return res;
    }
    public static Conjunto uniao(Conjunto a, Conjunto b) {
        Conjunto res = new Conjunto();
        for (int i = 0; i < a.getQtd(); i++) {
            res.adicionar(a.c[i]);
        }
        for (int i = 0; i < b.getQtd(); i++) {
            res.adicionar(b.c[i]);
        }
        return res;
    }
    public Conjunto intersecao(Conjunto outro) {
        Conjunto res = new Conjunto();
        for (int i = 0; i < qtd; i++) {
            if (outro.buscar(c[i]) != -1) {
                res.adicionar(c[i]);
            }
        }
        return res;
    }
    public static Conjunto intersecao(Conjunto a, Conjunto b) {
        Conjunto res = new Conjunto();
        for (int i = 0; i < a.getQtd(); i++) {
            if (b.buscar(a.c[i]) != -1) {
                res.adicionar(a.c[i]);
            }
        }
        return res;
    }
}
