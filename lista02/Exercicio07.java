// Exercicio 07 - Classe Cliente com construtores encadeados por this().
// Conceito: this(...) chama outro construtor da MESMA classe. Isso evita
// repetir codigo: quem faz o trabalho de verdade e o construtor completo.

public class Exercicio07 {

    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente("Ana Souza");
        Cliente c3 = new Cliente("Carlos Lima", "carlos@email.com", "(65) 99999-0000");

        exibir(c1);
        exibir(c2);
        exibir(c3);
    }

    private static void exibir(Cliente c) {
        System.out.println("Nome: " + c.getNome()
                + " | E-mail: " + c.getEmail()
                + " | Telefone: " + c.getTelefone());
    }
}

class Cliente {
    private String nome;
    private String email;
    private String telefone;

    // Construtor sem parametros: chama o de um parametro.
    public Cliente() {
        this("Nao informado");
    }

    // Construtor com o nome: chama o construtor completo.
    public Cliente(String nome) {
        this(nome, "Nao informado", "Nao informado");
    }

    // Construtor completo: e o unico que realmente atribui os valores.
    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }
}
