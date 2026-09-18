import java.util.Scanner;

// Exercicio 15 - Comparacao de Strings com == e com equals.
// Conceito: a String digitada no Scanner e um objeto NOVO, criado em tempo de
// execucao. Por isso o == costuma dar false mesmo com o texto correto:
// ele compara referencias, nao o conteudo. Para texto, use SEMPRE equals.

public class Exercicio15 {

    public static void main(String[] args) {
        Usuario usuario = new Usuario("ana.souza", "senha123");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a senha: ");
        String senhaDigitada = scanner.nextLine();

        usuario.autenticar(senhaDigitada);
        scanner.close();
    }
}

class Usuario {
    private String login;
    private String senha;

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public void autenticar(String senhaInformada) {
        boolean comparacaoComIgualIgual = (senha == senhaInformada);
        boolean comparacaoComEquals = senha.equals(senhaInformada);

        System.out.println("Resultado usando == : " + comparacaoComIgualIgual);
        System.out.println("Resultado usando equals: " + comparacaoComEquals);

        if (comparacaoComEquals) {
            System.out.println("Usuario " + login + " autenticado com sucesso.");
        } else {
            System.out.println("Senha incorreta.");
        }
    }
}
