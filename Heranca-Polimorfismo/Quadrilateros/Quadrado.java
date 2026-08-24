/*Quadrado (subclasse de Retangulo), em que os lados opostos são paralelos, todos os lados possuem um ângulo de 90° entre eles, e todos os lados possuem o mesmo tamanho. 
Nesse caso, deve possuir uma sobrecarga do método setLados que recebe apenas um argumento (um lado).
O método getPropriedades() deve ser sobreposto para retornar as propriedades da superclasse Retangulo concatenada com "Todos os lados tem o mesmo tamanho.".*/
package quadrilateros;

public class Quadrado extends Retangulo {
    public void setLados(double lado) {
        super.setLados(lado, lado);
    }
    @Override
    public String getPropriedades() {
        return super.getPropriedades() + " Todos os lados tem o mesmo tamanho.";
    }
} 
