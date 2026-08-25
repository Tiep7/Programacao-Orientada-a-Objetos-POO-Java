package machinelearning;

public abstract class DadosTeste {
    private Exemplo[] exemplos = new Exemplo[100];
    private String[] classes;
    private int qtdExemplos = 0;

    public void setClasses(String[] classes) {
        this.classes = classes;
    }

    public void adicionarExemplo(DadosTeste d) {
        for (int i = 0; i < d.getQtdExemplos(); i++)
            adicionarExemplo(d.getExemplo(i));
    }

    public boolean adicionarExemplo(Exemplo e) {
        if (qtdExemplos == exemplos.length) return false;
        exemplos[qtdExemplos++] = e;
        return true;
    }

    public String[] getClasses() {
        return this.classes;
    }

    public Exemplo getExemplo(int indice) {
        return this.exemplos[indice];
    }

    public int getQtdExemplos() {
        return this.qtdExemplos;
    }

    public abstract double calcularAcuracia();
}
