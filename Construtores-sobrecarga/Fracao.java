package matematica;

public class Fracao {
    private int numerador;
    private int denominador;
    public Fracao() {
        this.numerador = 1;
        this.denominador = 1;
    }
    public Fracao(int numerador) {
        this.numerador = numerador;
        this.denominador = 1;
    }
    public Fracao(int numerador, int denominador) {
        int mdc = mdc(numerador, denominador);
        numerador /= mdc;
        denominador /= mdc;
        if (denominador < 0) {
            numerador *= -1;
            denominador *= -1;
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public String getRepresentacao() {
        return numerador + "/" + denominador;
    }
    public Fracao somar(Fracao f2) {
        int novoNumerador = (this.numerador * f2.denominador) + (this.denominador * f2.numerador);
        int novoDenominador = this.denominador * f2.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }
    public static Fracao somar(Fracao f1, Fracao f2) {
        int novoNumerador = (f1.numerador * f2.denominador) + (f1.denominador * f2.numerador);
        int novoDenominador = f1.denominador * f2.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }
    public static Fracao somar(Fracao[] fracoes) {
        Fracao resultado = new Fracao(0);
        for (Fracao f : fracoes) {
            resultado = Fracao.somar(resultado, f);
        }
        return resultado;
    }
    public static Fracao multiplicar(Fracao f1, Fracao f2) {
        int novoNumerador = f1.numerador * f2.numerador;
        int novoDenominador = f1.denominador * f2.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }
    private static int mdc(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return (a == 0) ? 1 : a;
    }
    
}
