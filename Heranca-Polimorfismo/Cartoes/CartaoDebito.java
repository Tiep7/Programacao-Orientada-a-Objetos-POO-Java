package cartoes;

public class CartaoDebito {
    double saldo;
    String titular;
    public CartaoDebito() {
        saldo = 0;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void adicionarSaldoDebito(double valor) {
        saldo += valor;
    }
    public double verificarSaldoDebito() {
        return saldo;
        
    }
    public boolean pagarComDebito(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        } 
        return false;
    }
}
