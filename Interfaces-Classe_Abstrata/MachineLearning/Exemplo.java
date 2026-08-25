package machinelearning;

public class Exemplo {
    private int[] atributos;
    private String classeVerdadeira;
    private String classePredita;

    public Exemplo(int[] a, String c, String p) {
        this.atributos = a;
        this.classeVerdadeira = c;
        this.classePredita = p;
    }

    public int[] getAtributos() {
        return this.atributos;
    }

    public String getClasseVerdadeira() {
        return this.classeVerdadeira;
    }

    public String getClassePredita() {
        return this.classePredita;
    }
}
