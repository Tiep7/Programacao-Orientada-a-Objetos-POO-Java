/*O funcionário de uma empresa escreveu um programa para o Jogo da Velha, mas gostaria de adicionar algumas estratégias de jogo automáticas. 
Para isso, outro funcionário sugeriu utilizar o padrão de projeto Strategy, de forma que a classe com o tabuleiro utilize um algoritmo por meio de uma 
interface que pode ser implementada de diversas formas diferentes. Cada implementação representaria uma estratégia de jogo.
Duas estratégias que devem ser implementadas são: Estratégia A e Estratégia B (há também uma Estratégia C que já está implementada no sistema de correção automática). 
As estratégias seguem a ideia de percorrer a matriz e retornam como próxima jogada a primeira célula que encontram livre. */

package jogo;

public class TabuleiroEstrategia extends Tabuleiro{
    private EstrategiaJogo jogador1;
    private EstrategiaJogo jogador2;
    
    public void setStrategyJogador1(EstrategiaJogo jogador1){
        this.jogador1 = jogador1;
    }
    
    public void setStrategyJogador2(EstrategiaJogo jogador2){
        this.jogador2 = jogador2;
    }
    
    public void jogarPartida(){
        int[] coord;

        while(super.getJogadorVencedor() == '.'){
            coord = jogador1.getProximaJogada(super.getTabuleiro(), 'X');
            super.jogar('X', coord[0], coord[1]);
        
            if (super.getJogadorVencedor() != '.') {
                return;
            }
        
            coord = jogador2.getProximaJogada(super.getTabuleiro(), 'O');
            super.jogar('O', coord[0], coord[1]);

    }
    }

}
