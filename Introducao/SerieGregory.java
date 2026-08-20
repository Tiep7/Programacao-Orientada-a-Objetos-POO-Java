#Escreva um programa que calcule o valor de Π usando a série de Gregory
import java.util.Scanner;
import java.lang.Math;

public class SerieGregory {
    public static double ValorPi(int n) {
        double somatorio = 0;
        for (int i = 0; i < n; i++) {
            somatorio = somatorio + (Math.pow(-1, i)/(2*i+1)) * 4;
        }
        return somatorio;
    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        double numero = 0;
        if (n < 50) {
            for (int aux = 0; aux < n; aux++) {
            numero = (Math.pow(-1, aux)/(2*aux+1));
            System.out.print(String.format("%.5f ", numero));
            }
        } else {
            for (int aux = 0; aux < 50; aux++) {
            numero = (Math.pow(-1, aux)/(2*aux+1));
            System.out.print(String.format("%.5f ", numero));
            }
        }
        System.out.println();
        System.out.println(String.format("%.5f", ValorPi(n)));
        }
        
    }
