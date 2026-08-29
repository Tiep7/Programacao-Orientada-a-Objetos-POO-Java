/*Escreva um programa para autenticar usuários com login e senha que use a classe Usuario, conforme descrito a seguir (o programa deverá ser implementado na classe AutenticacaoUsuario):

 

Lê um inteiro n, que é a quantidade de usuários a serem cadastrados.
Depois o programa receberá uma sequência de n pares "login senha". 
O programa deve instanciar a classe Usuario uma vez para cada usuário. 
O construtor de Usuario recebe o login e senha como argumentos, por exemplo: new Usuario("login", "senha");
Após instanciar todos os usuários, o programa recebe mais um inteiro (k), que representa a quantidade de tentativas de autenticação a serem realizadas.
Depois o programa receberá uma sequência de k pares "login senha". Desta vez, o programa deverá chamar o método autenticar do usuário correspondente ao login e, para esse usuário, passar a senha lida como argumento (assuma que sempre será passado um login de um usuário que existe). Após chamar o método autenticar, o programa deverá imprimir o resultado usando a classe Impressao de acordo com o caso (os três métodos são static na classe Impressao):
Impressao.imprimirUsuarioAutenticado(login: String): quando o método autenticar não lança exceção
Impressao.imprimirSenhaInvalida(login: String): quando o método autenticar lançar a exceção SenhaInvalida (ocorre se a senha passada é incorreta)
Impressao.imprimirUsuarioBloqueado(login: String): quando o método autenticar lançar a exceção UsuarioBloqueado (essa exceção é lançada se a senha é incorreta 3 ou mais vezes seguidas)*/

import java.util.Scanner;
import acesso.Usuario;
import acesso.Impressao;
import acesso.UsuarioBloqueado;
import acesso.SenhaInvalida;

public class AutenticacaoUsuario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        Usuario[] usuarios = new Usuario[n];
        for (int i = 0; i < n; i++) {
            String login = leitor.next();
            String senha = leitor.next();
            usuarios[i] = new Usuario(login, senha);
        }
        int k = leitor.nextInt();
        for (int i = 0; i < k; i++) {
            String login = leitor.next();
            String senha = leitor.next();
            for (int j = 0; j < n; j++) {
                if (usuarios[j].getLogin().equals(login)) {
                    try {
                        usuarios[j].autenticar(senha);
                        Impressao.imprimirUsuarioAutenticado(login);
                    } catch (SenhaInvalida e) {
                        Impressao.imprimirSenhaInvalida(e.getLogin());
                    } catch (UsuarioBloqueado e) {
                        Impressao.imprimirUsuarioBloqueado(e.getLogin());
                    }
                    break; 
                }
            }
        }
        leitor.close(); 
    }
}
