package machinelearning;

public class DadosTesteDesbalanceado extends DadosTeste {
    private String fonte;
    
    public DadosTesteDesbalanceado() {
        this.fonte = "Nao informado";
    }
    
    public DadosTesteDesbalanceado(String fonte) {
        this.fonte = fonte;
    }
    
    private double calcularAcertoPorClasse(String c) {
        int acertos = 0;
        int qtd = 0;
        for (int i = 0; i < getQtdExemplos(); i++) {
            if (getExemplo(i).getClasseVerdadeira().equals(c)) {
                qtd++;
                if (getExemplo(i).getClassePredita().equals(c)) {
                    acertos++;
                }
            }
        }
        return acertos / (double) qtd;
    }
    
    @Override
    public double calcularAcuracia() {
        double total = 0;
        for (int i = 0; i < getClasses().length; i++) {
            String c = getClasses()[i];
            total += calcularAcertoPorClasse(c);
        }
        return total / getClasses().length;
    }
    
    public String getFonte() {
        return this.fonte;
    }
    
    public static boolean verificarFonte(DadosTesteDesbalanceado d) {
        return d.getFonte().equals("ABC");
    }
}
