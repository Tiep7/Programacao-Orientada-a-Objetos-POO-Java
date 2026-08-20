#Escreva um programa que leia uma matriz que contém o mapa de um campo minado. 
#Nesta matriz, o valor 1 indica que há uma bomba na célula e o valor 0 indica que não há uma bomba na célula. 
#A matriz é composta apenas pelos valores 0 e 1.
import java.util.Scanner;
public class CampoMinado {
public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int n_linhas = leitor.nextInt();
    int n_colunas = leitor.nextInt();
    int[][] matriz = new int[n_linhas][n_colunas];
    
    for (int linha = 0; linha < n_linhas; linha++) {
        for (int coluna = 0; coluna < n_colunas; coluna++) {
            matriz[linha][coluna] = leitor.nextInt();
        }    
    }
    int Bombas = 0;
    
    int LinhaConsultada = leitor.nextInt();
    int ColunaConsultada = leitor.nextInt();
    for (int linha = LinhaConsultada - 1; linha <= LinhaConsultada + 1; linha++) {
        for (int coluna = ColunaConsultada - 1; coluna <= ColunaConsultada + 1; coluna++) {
            if (linha >= 0 && linha < n_linhas && coluna >= 0 && coluna < n_colunas) {
                if (matriz[linha][coluna] == 1) {
                    Bombas++;
                }
            }    
        }
    }
    System.out.print(Bombas);
    }
}
