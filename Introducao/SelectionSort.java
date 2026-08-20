/*Escreva um programa que leia um vetor com n inteiros. 
O programa então irá imprimir o vetor lido. Após isso, 
o programa deve ordenar os elementos em ordem crescente utilizando o algoritmo de ordenação Selection sort. 
O vetor ordenado deve ser impresso, assim como a quantidade de trocas realizadas entre elementos diferentes do vetor durante a ordenação.*/
import java.util.Scanner;
public class SelectionSort {
    
    public static int ordenar(int[] v) {
        // Este método deve ordenar o vetor v em ordem crescente usando o algoritmo selection sort
        // O retorno do método é o número de trocas entre elementos realizadas no vetor
        int trocas = 0;
        for (int i = 0; i < v.length - 1; i++) {
            int indiceMenor = i;
            for (int k = i + 1; k < v.length; k++) {
                if (v[k] < v[indiceMenor]) {
                    indiceMenor = k;
                }
            }
            if (i != indiceMenor) {
                int temp = v[i];
                v[i] = v[indiceMenor];
                v[indiceMenor] = temp;
                trocas++;
            }
        }
        return trocas;
        
    }
    public static void imprimir(int [] v) {
        for (int i = 0; i < v.length - 1; i++) {
            System.out.print(v[i] + " ");
            
        }
        System.out.println(v[v.length - 1]);
    }
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = leitor.nextInt();
        }
        imprimir(a);
        int trocas = ordenar(a);
        imprimir(a);
        System.out.println(String.format("Trocas: %d", trocas));
        
    }
    
}
