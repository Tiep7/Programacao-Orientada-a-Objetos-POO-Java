public class Operacoes {
    private int a;
    private int b;
    private int c;
    private Integer min = null;
    private Integer max = null;
    
    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public void setC(int c) {
        this.c = c;
    }
    
    private void atualizaMinMax(int resultado) {
        if (min == null || resultado < min) {
            min = resultado;
        }
        if (max == null || resultado > max) {
            max = resultado;
        }
        
    }
    public int soma2() {
        int resultado = a + b;
        atualizaMinMax(resultado);
        return resultado;
    }
    public int soma3() {
        int resultado = a + b + c;
        atualizaMinMax(resultado);
        return resultado;
    }
    public int multiplica() {
        int resultado = a * b;
        atualizaMinMax(resultado);
        return resultado;
    }
    public int getMin() {
        return min;
        
    }
    public int getMax() {
        return max;
    }
}
