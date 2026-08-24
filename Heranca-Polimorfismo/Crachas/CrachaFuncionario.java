/*Classe CrachaFuncionario (subclasse de Cracha):

public void setCargo(String cargo): armazena o cargo.
public void setDataAdmissao(int m, int a): armazena o mês (parâmetro m) e o ano (parâmetro a) de admissão.
public void imprimir(): sobrepõe o método imprimir da classe Cracha. Em CrachaFuncionario, a impressão deve ser de acordo com o seguinte formato:
FUNCIONARIO
Nome: <nome do funcionário>
Cargo: <cargo do funcionário>
Admissao: <mes/ano de admissão do funcionário>*/
public class CrachaFuncionario extends Cracha {
    String cargo;
    int m, a;
    public CrachaFuncionario() {
        
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public void setDataAdmissao(int m, int a) {
        this.m = m;
        this.a = a;
    }
    @Override
    public void imprimir() {
        Impressao.imprimirLinha("FUNCIONARIO");
        Impressao.imprimirLinha("Nome: " + nome);
        Impressao.imprimirLinha("Cargo: " + cargo);
        Impressao.imprimirLinha("Admissao: " + m + "/" + a);
    }
}
