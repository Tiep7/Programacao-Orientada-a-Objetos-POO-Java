package automotores;

public class Motocicleta extends Veiculo{
    private boolean TemCarroLateral;
    public Motocicleta() {
        
    }
    public boolean setTemCarroLateral(boolean temCarroLateral) {
        if (!temCarroLateral) {
            TemCarroLateral = false;
            return false;
        } else {
            TemCarroLateral = true;
            return true;
        }
        
    }
    @Override
    public String getTipo() {
        return "Motocicleta modelo " + modelo;
        
    }
    public boolean getTemCarroLateral() {
        return TemCarroLateral;
    }
}
