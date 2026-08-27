package jogo;


class EstrategiaA implements EstrategiaJogo{
    @Override
    public int[] getProximaJogada(char[][] dadosTabuleiro, char jogador){
        // Retorna as coordenadas da proxima jogada
        // Vetor onde: Posição 0 = linha; Posição 1 = coluna
        
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if(dadosTabuleiro[i][j] == '.'){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}

class EstrategiaB implements EstrategiaJogo{
    private static final int[][] ORDEM = {
        {1, 1}, // 1
        {0, 0}, // 2
        {0, 2}, // 3
        {2, 0}, // 4
        {2, 2}, // 5
        {0, 1}, // 6
        {1, 0}, // 7
        {1, 2}, // 8
        {2, 1} // 9
    };
    
    @Override
    public int[] getProximaJogada(char[][] dadosTabuleiro, char jogador) {
    
        for (int[] pos : ORDEM) {
            int linha = pos[0];
            int coluna = pos[1];
        
            if (dadosTabuleiro[linha][coluna] == '.') {
                return new int[]{linha, coluna};
            }
        }
    
    return null; // ou {-1, -1}, dependendo da sua regra
    }
}
