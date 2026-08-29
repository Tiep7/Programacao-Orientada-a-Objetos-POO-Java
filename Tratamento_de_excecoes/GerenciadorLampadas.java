/*Para este aplicativo, é necessário implementar a classe GerenciadorLampadas, que gerencia instâncias de lâmpadas inteligentes 
(ou seja, instâncias da classe LampadaInteligente). A seguir são apresentados os métodos necessários na classe GerenciadorLampadas. 
Esses métodos podem ser usados pelo sistema de correção e por isso devem seguir a especificação apresentada no enunciado. 
Você pode incluir atributos e métodos auxiliares adicionais que considerar necessários durante a implementação.*/

import dispositivos.LampadaInteligente;
class LampadaEstaLigada extends Exception {
    public LampadaEstaLigada() {
        super("A lampada ja esta ligada.");
    }
}
class LampadaEstaDesligada extends Exception {
    public LampadaEstaDesligada() {
        super("A lampada ja esta desligada.");
    }
}
public class GerenciadorLampadas {
    private LampadaInteligente[] vetor;
    private int qtdLampadas = 0;

    public GerenciadorLampadas() {
        vetor = new LampadaInteligente[10];
    }
    public void adicionarLampada() {
        if (qtdLampadas < 10) {
            vetor[qtdLampadas] = new LampadaInteligente();
            qtdLampadas++;
        }
        
    }

    public void ligarLampada(int indiceLampada) throws LampadaEstaLigada {
        if (!vetor[indiceLampada].getEstado()) {
            vetor[indiceLampada].ligar();
        } else {
            throw new LampadaEstaLigada();
        }
    }

    public void desligarLampada(int indiceLampada) throws LampadaEstaDesligada {
        if (vetor[indiceLampada].getEstado()) {
            vetor[indiceLampada].desligar();
        } else {
            throw new LampadaEstaDesligada();
        }
    }

}
