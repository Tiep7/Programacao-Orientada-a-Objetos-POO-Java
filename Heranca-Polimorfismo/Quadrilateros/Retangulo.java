/*Retangulo (subclasse de Paralelogramo), em que os lados opostos são paralelos e todos os lados possuem um ângulo de 90° entre eles. 
  O método getPropriedades() deve ser sobreposto, retornando a string obtida com getPropriedades() da superclasse Paralelogramo concatenada 
  com "Angulo de 90 graus em todos os vertices.";*/
package quadrilateros;

public class Retangulo extends Paralelogramo {
    public void setLados(double ladoAB, double ladoBA) {
        super.setLados(ladoAB, ladoBA, ladoAB, ladoBA);
    }
    
    @Override
    public String getPropriedades() {
        return super.getPropriedades() + " Angulo de 90 graus em todos os vertices.";
    }
}
