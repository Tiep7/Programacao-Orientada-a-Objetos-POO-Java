/*Escreva um programa (pacote arquivos) para guardar arquivos de texto e de imagem em pastas compactadas. 
O programa deverá guardar duas pastas compactadas, uma para guardar apenas arquivos de texto e outra para guardar apenas arquivos de imagem.

Uma pasta compactada é representada por uma instância da classe PastaCompactada<T>. 
  A classe PastaCompactada<T> já está implementada e possui um parâmetro de tipo T. Portanto, para instancar uma pasta compactada que armazenará apenas arquivos de Texto:*/
package arquivos;

import java.util.Scanner;

public class CompactaArquivos {
    public static void main(String[] args) {
        PastaCompactada<Texto> pastaTextos = new PastaCompactada<Texto>();
        PastaCompactada<Imagem> pastaImagens = new PastaCompactada<Imagem>();
        Scanner Leitor = new Scanner(System.in);
        int n = Leitor.nextInt();
        for (int i = 0; i < n; i++) {
            String tipo = Leitor.next();
        
            switch (tipo) {
                case "Texto":
                    pastaTextos.adicionar(new Texto());
                    break;
        
                case "TextoTXT":
                    pastaTextos.adicionar(new TextoTXT());
                    break;
        
                case "TextoDOCX":
                    pastaTextos.adicionar(new TextoDOCX());
                    break;
        
                case "Imagem":
                    pastaImagens.adicionar(new Imagem());
                    break;
        
                case "ImagemJPEG":
                    pastaImagens.adicionar(new ImagemJPEG());
                    break;
        
                case "ImagemPNG":
                    pastaImagens.adicionar(new ImagemPNG());
                    break;
            }
        }
        pastaTextos.imprimir();
        pastaImagens.imprimir();
    }
}
