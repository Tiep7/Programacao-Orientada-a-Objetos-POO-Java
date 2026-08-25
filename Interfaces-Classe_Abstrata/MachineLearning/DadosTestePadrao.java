package machinelearning;

public class DadosTestePadrao extends DadosTeste {
    @Override
    public double calcularAcuracia() {
        int acertos = 0;
        for (int i = 0; i < super.getQtdExemplos(); i++) {
            String v = getExemplo(i).getClasseVerdadeira();
            String p = getExemplo(i).getClassePredita();
            if (v.equals(p)) {
                acertos++;
            }
        }
        return acertos / (double) getQtdExemplos();
    }
}
