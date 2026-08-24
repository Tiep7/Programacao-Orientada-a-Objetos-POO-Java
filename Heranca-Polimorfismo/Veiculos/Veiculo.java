/*Crie uma superclasse Veiculo, que representa um veículo genérico, com o método getTipo que retorna uma String "Veiculo generico modelo <modelo>". 
Esse método será sobreposto pelas subclasses que herdam de Veiculo: Carro e Motocicleta, que retornam respectivamente "Carro modelo <modelo>" e 
"Motocicleta modelo <modelo>", onde <modelo> é uma String representando o modelo do veículo, passado no método setModelo. 
Adicionalmente, a classe Carro deve ter um atributo que guarde o número de portas, enquanto a classe Motocicleta tem um atributo informando se tem 
ou não um carro lateral acoplado.*/
package automotores;
 public class Veiculo {
    public String modelo;
    public Veiculo() {
        
    } 
    public String getTipo() {
        return "Veiculo generico modelo " + modelo;
    
    }
    public String setModelo(String modelo) {
        this.modelo = modelo;
        return modelo;
    }
    
 }
