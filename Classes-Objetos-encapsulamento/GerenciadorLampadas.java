import dispositivos.LampadaInteligente;

public class GerenciadorLampadas {
    
    private LampadaInteligente[] vetorLampadaInteligente;
    private int qtdLampadas = 0;
    
    public GerenciadorLampadas() {
        vetorLampadaInteligente = new LampadaInteligente[10];
    }
    
    
    public void adicionarLampada() {
        if (qtdLampadas < 10) {
            vetorLampadaInteligente[qtdLampadas] = new LampadaInteligente();
            qtdLampadas++;
        }
    }
    
    public void ligarLampada(int indiceLampada) {
        if (indiceLampada >= 0 && indiceLampada < qtdLampadas) {
            if (!vetorLampadaInteligente[indiceLampada].getEstado()) {
                vetorLampadaInteligente[indiceLampada].ligar();
            }
        }
    }
    
    public void desligarLampada(int indiceLampada) {
        if (indiceLampada >= 0 && indiceLampada < qtdLampadas) {
            if (vetorLampadaInteligente[indiceLampada].getEstado()) {
                vetorLampadaInteligente[indiceLampada].desligar();
            }
        }
    }
    public void ligarTodasLampadas() {
        for (int i = 0; i < qtdLampadas; i++) {
            if (!vetorLampadaInteligente[i].getEstado()) {
                vetorLampadaInteligente[i].ligar();
            }
        }
    }
    public void desligarTodasLampadas() {
        for (int j = 0; j < qtdLampadas; j++) {
            if (vetorLampadaInteligente[j].getEstado()) {
                vetorLampadaInteligente[j].desligar();
            }
        }
    }
}
