package empresa;
public class Pedido {
    private int[] pedido = new int[5];
    private int qtdPedidos = 0;
    private boolean entregado = false;
    private boolean cancelado = false;
    public boolean adicionarProduto(int codProduto) {
        if (cancelado == true || entregado == true) {
            return false;
        }
        if (qtdPedidos == pedido.length) {
            return false;
        }
        pedido[qtdPedidos] = codProduto;
        qtdPedidos++;
        return true;
    }
    public int[] entregar() {
        if (cancelado == true || qtdPedidos <= 0) {
            return null;
        }
        int[] pedidoEntregue = new int[qtdPedidos];
        for (int k = 0; k < qtdPedidos; k++) {
            pedidoEntregue[k] = pedido[k];
        }
        entregado = true;
        qtdPedidos--;
        return pedidoEntregue;
    }
    public boolean cancelar() {
        if (entregado == true) {
            return false;
        } else {
            cancelado = true;
            qtdPedidos--;
            return true;
        }
        
    }
    public boolean somarPedido(Pedido p) {
    int total = qtdPedidos;

    for (int i = 0; i < p.qtdPedidos; i++) {
        boolean existe = false;

        for (int j = 0; j < qtdPedidos; j++) {
            if (pedido[j] == p.pedido[i]) {
                existe = true;
                break;
            }
        }

        if (!existe) {
            total++;
        }
    }

    if (total > 5) {
        return false;
    }

    for (int i = 0; i < p.qtdPedidos; i++) {
        boolean existe = false;

        for (int j = 0; j < qtdPedidos; j++) {
            if (pedido[j] == p.pedido[i]) {
                existe = true;
                break;
            }
        }

        if (!existe) {
            pedido[qtdPedidos] = p.pedido[i];
            qtdPedidos++;
        }
    }

    return true;
    }
}
