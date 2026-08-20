#Os dados de discos voadores são organizados em uma matriz, 
#em que cada linha é um disco voador e cada coluna é o resultado do teste. 
#Um grupo de alienígenas gostaria de analisar esses dados, mas precisa de um programa para ordenar esses dados.

#Escreva um programa que leia uma matriz de inteiros (com os dados dos discos voadores) e então ordene a matriz por linhas (ordem crescente lexicográfica) e depois por colunas (ordem crescente lexicográfica), 
#conforme descrito a seguir:

#1) Leia dois valores inteiros com dimensões da matriz: n_linhas e n_colunas

#2) Leia os dados da matriz

#3) Ordene a matriz por linhas de acordo com a ordem crescente lexicográfica.

import java.util.Scanner;

public class TestesDiscosVoadores {

    public static int compararLinhas(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < b[i]) return -1;
            if (a[i] > b[i]) return 1;
        }
        return 0;
    }

    public static int compararColunas(int[][] matriz, int c1, int c2) {
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][c1] < matriz[i][c2]) return -1;
            if (matriz[i][c1] > matriz[i][c2]) return 1;
        }
        return 0;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (j > 0) System.out.print(" ");
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }

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

        
        for (int i = 0; i < n_linhas - 1; i++) {
            for (int j = 0; j < n_linhas - 1 - i; j++) {
                if (compararLinhas(matriz[j], matriz[j + 1]) > 0) {

                    int[] aux = matriz[j];
                    matriz[j] = matriz[j + 1];
                    matriz[j + 1] = aux;
                }
            }
        }

        imprimirMatriz(matriz);
        System.out.println();

        
        for (int i = 0; i < n_colunas - 1; i++) {
            for (int j = 0; j < n_colunas - 1 - i; j++) {

                if (compararColunas(matriz, j, j + 1) > 0) {

                    for (int k = 0; k < n_linhas; k++) {
                        int aux = matriz[k][j];
                        matriz[k][j] = matriz[k][j + 1];
                        matriz[k][j + 1] = aux;
                    }
                }
            }
        }

        imprimirMatriz(matriz);

        leitor.close();
    }
}
