/* Uma empresa está desenvolvendo um programa para gerenciar dispositivos inteligentes. O programa vai gerenciar três tipos de dispositivos: lâmpada, tomada e interruptor.

Neste exercício, implemente as 5 classes a seguir (todas as classes devem estar no pacote dispositivos). As classes DispositivoInteligente, LampadaInteligente, TomadaInteligente e InterruptorInteligente tem acesso package. A classe Gerenciador tem acesso public.

Classe abstrata DispositivoInteligente: essa classe possui um atributo do tipo boolean para armazenar o estado, que indica se o dispositivo está ligado (true) ou desligado (false). Todo dispositivo criado inicia desligado (estado = false).

public void ligar(): liga o dispositivo (muda o estado para true).
public void desligar(): desliga o dispositivo (muda o estado para false).
public boolean getEstado(): retorna o valor do atributo estado.
Classe LampadaInteligente (subclasse de DispositivoInteligente): 

public void ligar(): liga o dispositivo (muda o estado para true).
public void desligar(): desliga o dispositivo (muda o estado para false).
public boolean getEstado(): retorna o valor do atributo estado.
Classe TomadaInteligente (subclasse de DispositivoInteligente):

public void ligar(): liga o dispositivo (muda o estado para true).
public void desligar(): desliga o dispositivo (muda o estado para false).
public boolean getEstado(): retorna o valor do atributo estado.
Classe InterruptorInteligente (subclasse de DispositivoInteligente):

public void ligar(): liga o dispositivo (muda o estado para true).
public void desligar(): desliga o dispositivo (muda o estado para false).
public boolean getEstado(): retorna o valor do atributo estado.
Classe Gerenciador: armazena uma lista de dispositivos inteligentes. A classe pode ter no máximo 10 dispositivos nesta lista.

public void adicionarDispositivo(DispositivoInteligente d): adiciona o dispositivo d (armazena uma referência ao dispositivo d) na lista de dispositivos armazenados no gerenciador.
public void ligarTodosDispositivos(): liga todos os dispositivos.
public void desligarTodosDispositivos(): desliga todos os dispositivos.
Observação: apenas a classe Gerenciador é pública. Todas as demais tem acesso package.*/

package dispositivos;

abstract class DispositivoInteligente {
    private boolean estado;
    public DispositivoInteligente() {
        estado = false;
    }
    public void ligar() {
        estado = true;
    }
    public void desligar() {
        estado = false;
    }
    public boolean getEstado() {
        return estado;
    }
}
class LampadaInteligente extends DispositivoInteligente {

}

class TomadaInteligente extends DispositivoInteligente {

}
class InterruptorInteligente extends DispositivoInteligente {

}

public class Gerenciador {
    DispositivoInteligente[] vetorDispositivos = new DispositivoInteligente[10];
    int qtd = 0;
    public void adicionarDispositivo(DispositivoInteligente d) {
        vetorDispositivos[qtd] = d;
        qtd++;
    }
    public void ligarTodosDispositivos() {
        for (int i = 0; i < qtd; i++) {
            vetorDispositivos[i].ligar();
        }
    }
    public void desligarTodosDispositivos() {
        for (int i = 0; i < qtd; i++) {
            vetorDispositivos[i].desligar();
        }
    }
}
