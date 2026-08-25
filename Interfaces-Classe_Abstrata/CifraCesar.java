/*Nesse exercício, considere a interface Cifra (que já está implementada no sistema de correção). 
Essa interface define o mínimo que uma classe de criptografia deve ter: um método para receber uma mensagem e cifrá-la; 
e um método para receber uma mensagem cifrada e decifrá-la.

Sua tarefa será escrever a classe CifraCesar (que implementa a interface Cifra), uma forma simples de esconder o conteúdo de mensagens. 
Considere o alfabeto como uma lista de 26 elementos, cada elemento seria uma letra na ordem alfabética. 
Aplicar um shift positivo nessa lista implica em mover todos os elementos 1 índice para frente, 
e o último passa a ser o primeiro (um valor negativo implica em um shift na direção contrária, e n pode ser qualquer valor inteiro).*/
package criptografia;

public class CifraCesar implements Cifra {

    private int nShifts;

    public CifraCesar(int nShifts) {
        this.nShifts = nShifts % 26;
    }

    public String cifrar(String mensagem) {
        String resultado = "";

        for (int i = 0; i < mensagem.length(); i++) {
            char c = mensagem.charAt(i);

            if (c == ' ') {
                resultado += c;
            } else if (c >= 'A' && c <= 'Z') {
                resultado += (char) ('A' + (c - 'A' + nShifts) % 26);
            } else if (c >= 'a' && c <= 'z') {
                resultado += (char) ('a' + (c - 'a' + nShifts) % 26);
            }
        }

        return resultado;
    }

    public String decifrar(String mensagem) {
        String resultado = "";

        for (int i = 0; i < mensagem.length(); i++) {
            char c = mensagem.charAt(i);

            if (c == ' ') {
                resultado += c;
            } else if (c >= 'A' && c <= 'Z') {
                resultado += (char) ('A' + (c - 'A' - nShifts + 26) % 26);
            } else if (c >= 'a' && c <= 'z') {
                resultado += (char) ('a' + (c - 'a' - nShifts + 26) % 26);
            }
        }

        return resultado;
    }
}
