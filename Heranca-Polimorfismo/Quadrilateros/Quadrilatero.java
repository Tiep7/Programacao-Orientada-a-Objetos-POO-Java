/*Nesse exercício você criará classes pertencentes ao pacote quadrilateros: Quadrilatero, Paralelogramo, Retangulo, Quadrado. Um quadrilátero é qualquer figura geométrica com quatro lados.

A classe Quadrilatero armazena os tamanhos dos quatro lados da figura. Essa classe deve ter três métodos:

setLados(ladoAB: double, ladoBC: double, ladoCD: double, ladoDA: double) : armazena os tamanhos dos lados do quadrilátero;
getPerimetro(): double : retorna o perímetro de um quadrilátero convexo genérico;
getPropriedades(): String : retorna uma string com propriedades da figura. No caso da superclasse Quadrilátero, o retorno é "Figura de quatro lados.".*/
package quadrilateros;

public class Quadrilatero {
    private double LadoAB;
    private double LadoBC;
    private double LadoCD;
    private double LadoDA;
    public void setLados(double ladoAB, double ladoBC, double ladoCD, double ladoDA) {
        this.LadoAB = ladoAB;
        this.LadoBC = ladoBC;
        this.LadoCD = ladoCD;
        this.LadoDA = ladoDA;
        
    }
    public double getPerimetro() {
        return LadoAB + LadoBC + LadoCD + LadoDA;
    }
    public String getPropriedades() {
        return "Figura de quatro lados.";
    }
}
