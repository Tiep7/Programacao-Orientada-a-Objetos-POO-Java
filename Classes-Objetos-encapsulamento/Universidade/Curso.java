package universidade;

public class Curso {
    private String nomeCurso;
    private Disciplina[] vetorDisciplinas; 
    private int qtd = 0;
    public void setNome(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    public String getNome() {
        return this.nomeCurso;
    }
    public void setMaxDisciplinas(int maxDisciplinas) {
        this.vetorDisciplinas = new Disciplina[maxDisciplinas];
    }
    public boolean adicionarDisciplina(Disciplina d) {
        if (qtd < this.vetorDisciplinas.length) {
            this.vetorDisciplinas[this.qtd++] = d;
            return true;
        } else {
            return false;
        }
    }
    public String[] getListaDisciplinasStr() {
        if (qtd == 0) return null;
        String[] lista = new String[qtd];
        for (int i = 0; i < qtd; i++) {
            lista[i] = this.vetorDisciplinas[i].getTextoDisciplina();
        }
        return lista;
    }
}
