/*Escreva as classes PerfilRedeSocial e PerfilAnonimo (pacote usuarios) conforme descrito a seguir:


Classe PerfilUsuario: 

Classe PerfilRedeSocial (subclasse de PerfilUsuario):

PerfilRedeSocial(String nome, String login): construtor que inicializa nome e login. Esses atributos devem ser atribuídos na superclasse PerfilUsuario. Além disso, a mensagem para a página inicial neste construtor deve ser "Sem mensagem".
PerfilRedeSocial(String nome, String login, String mensagemPaginaInicial): construtor que inicializa nome e login. Esses atributos devem ser atribuídos na superclasse PerfilUsuario. Esse construtor recebe também uma mensagem para a página inicial.
String getPerfil(): retorna uma string no formato: "<nome> <mensagemPaginaInicial>"
 
Classe PerfilAnonimo (subclasse de PerfilUsuario):
 
PerfilAnonimo(): construtor que inicializa o nome com a string "Anonimo". Esse atributo deve ser atribuído na superclasse PerfilUsuario.*/

package usuarios;

public class PerfilUsuario {
    private String nome, login;

    public PerfilUsuario(String nome) {
        this.nome = nome;
    }
    
    public PerfilUsuario(String nome, String login) {
        this(nome);
        this.login = login;
    }
    
    public final void imprimir() {
        System.out.println(String.format("Nome=%s Login=%s", nome, login));
    }
    
    public final String getNome() {
        return this.nome;
    }
}
