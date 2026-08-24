/*Classe CrachaEstudante (subclasse de Cracha):

public void setCurso(String curso): armazena o nome do curso.
public void imprimir(): sobrepõe o método imprimir da classe Cracha. Em CrachaEstudante, a impressão deve ser de acordo com o seguinte formato:
ESTUDANTE
Nome: <nome do estudante>
Curso: <nome do curso>*/
public class CrachaEstudante extends Cracha {
    String curso;
    public CrachaEstudante() {
        
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    @Override
    public void imprimir() {
        Impressao.imprimirLinha("ESTUDANTE");
        Impressao.imprimirLinha("Nome: " + nome);
        Impressao.imprimirLinha("Curso: " + curso);
    }
}
