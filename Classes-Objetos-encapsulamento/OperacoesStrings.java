public class OperacoesStrings {
    private String texto;
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public String getTexto() {
        return this.texto;
    }
    public int contaPalavras() {
        if (texto == null || texto.trim().isEmpty()) {
            return 0;
        }
    
        int contador = 0;
        boolean dentroPalavra = false;
    
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
    
            if (Character.isLetter(c)) {
                if (!dentroPalavra) {
                    contador++;
                    dentroPalavra = true;
                }
            } else {
                dentroPalavra = false;
            }
        }
        return contador;
    }
    public double comprimentoMedioPalavras() {
        if (texto == null || texto.trim().isEmpty()) {
            return 0.0;
        }
        String palavra = "";
        int total = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (Character.isLetter(c)) {
                palavra += c;
            } else {
                if (!palavra.isEmpty()) {
                    total += palavra.length();
                    palavra = "";
                }    
            }
        }
        if (!palavra.isEmpty()) {
            total += palavra.length();
        }
        int divisor = contaPalavras();
        return (double) total / divisor;
    }
    public String maiorPalavra() {
        if (texto == null || texto.trim().isEmpty()) {
            return "";
        }
        
        String maior = "";
        String atual = "";
        
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            
            if(Character.isLetter(c)) {
                atual += c;
            } else  {
                if (atual.length() > maior.length()) {
                    maior = atual;
                }
                atual = "";
            }
        }    
        if (atual.length() > maior.length()) {
            maior = atual;
        }
        return maior;
    }    
    public int comprimentoMaiorPalavra() {
        String MP = maiorPalavra();
        int comp = MP.length();
        return comp;
    }
}
