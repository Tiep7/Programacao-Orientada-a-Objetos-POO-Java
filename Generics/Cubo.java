/*Escreva a classe Cubo (pacote geometria) que implementa a interface Comparable. Métodos da classe Cubo:

Cubo(lado: double) - construtor da classe Cubo que recebe o comprimento do lado do cubo.
area(): double - retorna a área do cubo conforme a fórmula a seguir 6×lado2
compareTo(c: Cubo) - implementação do método compareTo da interface Comparable (mais detalhes de como implementar este método nos slides).
toString(): String - sobreposição do método toString() de Object. Retorna "cubo de area " + valor da área com uma casa decimal. 
Pode usar String.format("cubo de area %.1f", area());*/
package geometria;
public class Cubo implements Comparable<Cubo> {
    private double lado;
    public Cubo(double lado) {
        this.lado = lado;
    }
    public double area() {
        return 6 * (this.lado * this.lado);
    }
    @Override
    public int compareTo(Cubo c) {
        if (this.area() > c.area()) {
            return 1;
        } else if (c.area() > this.area()) {
            return -1;
        } else {
            return 0;
        }
    }
    @Override
    public String toString() {
        String res = String.format("cubo de area %.1f", area());
        return res; 
    }
}
