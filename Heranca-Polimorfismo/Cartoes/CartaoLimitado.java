package cartoes;

public class CartaoLimitado extends CartaoCredito {
    
    public CartaoLimitado() {
        valorDevidoCredito = 0;
    }
    @Override
    public boolean pagarComCredito(double valor) {
        double limite = valorDevidoCredito + valor;
        if (limite > 200) {
            return false;
        } else {
            valorDevidoCredito += valor;
            return true;
        }
    }
}
