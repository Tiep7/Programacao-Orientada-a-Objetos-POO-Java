package universidade;

public class Disciplina {
    
    private String nomeDisciplina;
    private int qtdCreditos;
    public void setNome(String nomeDisciplina) {
       this.nomeDisciplina = nomeDisciplina;
        
    }
    public String getNome() {
        return this.nomeDisciplina;
    }
    public void setQtdCreditos(int qtdCreditos) {
        this.qtdCreditos = qtdCreditos;
    }
    public int getQtdCreditos() {
        return this.qtdCreditos;
    }
    public String getTextoDisciplina() {
        return String.format("%s: %d", this.nomeDisciplina, this.qtdCreditos);
    }
}
