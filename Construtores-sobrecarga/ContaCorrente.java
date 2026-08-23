public class ContaCorrente {
    private double saldo;
    private static int QtdContas = 0;
    private String nome;
    public ContaCorrente(String nome) {
        this.nome = nome;
        this.saldo = 0.0;
        QtdContas++;
    }
    public ContaCorrente(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
        QtdContas++;
    }
    public double getSaldo() {
        return saldo;
    }
    public String getTitular() {
        return nome;
    }
    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }    
        return false;
    }
    public boolean sacar(double valor) {
        if ( valor < 0 || valor > saldo) {
            return false;
        } else {
            saldo -= valor;
            return true;
        }
    }
    public static boolean transferir(ContaCorrente de, ContaCorrente para, double valor) {
        if (valor > 0 && de.saldo >= valor) {
            de.saldo = de.saldo - valor;
            para.saldo = para.saldo + valor;
            return true;
        }
        return false;
    }
    public static int getQuantidadeContas() {
        return QtdContas;
    }
}
