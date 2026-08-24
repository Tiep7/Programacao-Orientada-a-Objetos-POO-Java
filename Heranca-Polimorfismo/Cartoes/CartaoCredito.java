package cartoes;

public class CartaoCredito extends CartaoDebito{
    double valorDevidoCredito;
    public CartaoCredito() {
        valorDevidoCredito = 0;
    }
    public boolean pagarComCredito(double valor) {
        valorDevidoCredito += valor;
        return true;
    }
    public void quitarCredito(double valor) {
        valorDevidoCredito -= valor;
    }
    public double verificarExtrato() {
        return valorDevidoCredito;
    }
}
