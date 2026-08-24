/*Paralelogramo (subclasse de Quadrilatero), em que os lados opostos são paralelos. 
  Nesse caso, deve possuir uma sobrecarga do método setLados que recebe apenas dois argumentos (dois lados). 
  O método getPropriedades() da superclasse imediata deve ser sobreposto para retornar uma string com as propriedades de um quadrilátero 
  concatenada com "Lados opostos paralelos.". Ou seja, o retorno será "Figura de quatro lados. Lados opostos paralelos.".*/
package quadrilateros;

public class Paralelogramo extends Quadrilatero {
    
    public void setLados(double ladoAB, double ladoBA) {
        super.setLados(ladoAB, ladoBA, ladoAB, ladoBA);
    }
    @Override
    public String getPropriedades() {
        return super.getPropriedades() + " Lados opostos paralelos.";
    }
}
