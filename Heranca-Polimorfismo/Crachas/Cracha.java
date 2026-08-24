/*Classe abstrata Cracha:

public void setNome(String nome): armazena o nome.
public abstract void imprimir(): método abstrato que será implementado pelas subclasses.*/
public abstract class Cracha {
    String nome;
    public Cracha() {
        
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public abstract void imprimir();
}
