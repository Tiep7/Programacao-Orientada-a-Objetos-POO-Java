package automotores;

public class Carro extends Veiculo{
    private int numPortas;
    public Carro() {
        
    }
    public int setNumeroPortas(int nPortas) {
        numPortas = nPortas;
        return numPortas;
        
    }
    @Override
    public String getTipo() {
        return "Carro modelo " + modelo;
        
    }
    public int getNumeroPortas() {
        return numPortas;
    }
    
}
