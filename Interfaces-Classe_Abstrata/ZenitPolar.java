/*Nesse exercício, considere a interface Cifra (que já está implementada no sistema de correção). Essa interface define o mínimo que uma classe de criptografia deve ter: um método para receber uma mensagem e cifrá-la; e um método para receber uma mensagem cifrada e decifrá-la. Considere o alfabeto como uma lista de 26 elementos, e que a mensagem é composta apenas de letras em mínusculo e espaço.

Sua tarefa será implementar uma classe ZENITPOLAR, uma forma simples de esconder o conteúdo de mensagens. */
package criptografia;
public class ZenitPolar implements Cifra {
    public ZenitPolar() {
        
    }
    @Override
    public String cifrar(String mensagem) {
        String resultado = "";
        for (int i = 0; i < mensagem.length(); i++) {
            char c = mensagem.charAt(i);
            switch (c) {
                case 'z': c = 'p'; break;
                case 'e': c = 'o'; break;
                case 'n': c = 'l'; break;
                case 'i': c = 'a'; break;
                case 't': c = 'r'; break;
                case 'p': c = 'z'; break;
                case 'o': c = 'e'; break;
                case 'l': c = 'n'; break;
                case 'a': c = 'i'; break;
                case 'r': c = 't'; break;
            }
            resultado += c;
        }
        return resultado;
    }
    @Override
    public String decifrar(String mensagem) {
        String res = "";
        for (int i = 0; i < mensagem.length(); i++) {
            char c = mensagem.charAt(i);
            switch(c) {
                case 'z': c = 'p'; break;
                case 'e': c = 'o'; break;
                case 'n': c = 'l'; break;
                case 'i': c = 'a'; break;
                case 't': c = 'r'; break;
                case 'p': c = 'z'; break;
                case 'o': c = 'e'; break;
                case 'l': c = 'n'; break;
                case 'a': c = 'i'; break;
                case 'r': c = 't'; break;
            }
            res += c;
        }
        return res;
    }
}
