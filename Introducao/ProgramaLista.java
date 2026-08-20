#Escreva um programa que leia uma lista com n inteiros. 
#O programa então irá imprimir os elementos da lista. 
#Essa lista de valores está ordenada (em ordem crescente). 
#As posições livres (final da lista) receberão o valor -1.
import java.util.Scanner;
public class ProgramaLista {
    
    public static boolean inserir(int numero, int[] v) {
        int livre = -2;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == -1) {
                livre = i;
                break;
            }
        }
        if (livre == -2) {
            return false;
        }
        int pos = 0;
        while (pos < livre && v[pos] < numero) {
            pos++;
        }
        for (int i = livre; i > pos; i--) {
            v[i] = v[i - 1];
        }
        v[pos] = numero;
        return true;
    }
    
    public static boolean remover(int numero, int[] v) {
        int pos =  -1;
        if (v.length == 0) {
            return false;
        }
        for (int i = 0; i < v.length; i++) {
            if(v[i] == numero) {
                pos = i;
                break;
            }
        }
        if (pos == -1) {
            return false;
        }
        int i = pos;
        while (i < v.length - 1 && v[i + 1] != -1) {
            v[i] = v[i + 1];
            i++;
        }
        v[i] = -1;
        return true;
    }
    
    public static void imprimir(int[] v) {
        for (int i = 0; i < v.length; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(v[i]);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }

        int codigo = sc.nextInt();
        int valor = sc.nextInt();

        boolean resultado;
        imprimir(v);
        if (codigo == 1) {
            resultado = inserir(valor, v);
            System.out.println("Inserir: " + resultado);
        } else if (codigo == 2) {
            resultado = remover(valor, v);
            System.out.println("Remover: " + resultado);
        }

        imprimir(v);

        sc.close();
        
    }
    
}
