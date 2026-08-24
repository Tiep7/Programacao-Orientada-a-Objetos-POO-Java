/*Escreva uma classe com o nome Fracao (a classe deve estar no pacote matematica) para representar um número racional conforme especificado a seguir (numerador e denominador são números inteiros, mas o denominador não pode ser zero).

Construtores da classe Fracao (todos os construtores são públicos):

Fracao()
construtor sem parâmetros, inicializa o numerador e o denominador como 1.
Fracao(int numerador)
construtor que recebe apenas o valor do numerador (o denominador é definido como 1).
Fracao(int numerador, int denominador)
construtor que recebe os valores do numerador e do denominador, simplifica a fração e então armazena o valores de numerador e denominador após a simplificação.
Métodos da classe Fracao:

public String getRepresentacao()
retorna uma String com a fração no formato "numerador/denominador".
public Fracao somar(Fracao f2)
retorna uma nova instância de Fracao, que é resultado da soma da instância atual (this) com a fração f2.
public static Fracao somar(Fracao f1, Fracao f2)
recebe duas frações e retorna uma nova instância de Fracao correspondendo à soma das frações;
public static Fracao somar(Fracao[] fracoes)
recebe um vetor de frações e retona uma nova instância de Fracao com o resultado do somatório de todas as frações no vetor.
public static Fracao multiplicar(Fracao f1, Fracao f2)
recebe duas frações e retorna uma nova instância de Fracao correspondendo ao produto das frações.*/

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
