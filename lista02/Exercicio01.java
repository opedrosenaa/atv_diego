// Exercicio 01 - Classe Livro com atributos privados, get e set.
// Conceito: encapsulamento. Os atributos sao "private", entao o mundo de fora
// so consegue tocar neles atraves dos metodos publicos get (ler) e set (escrever).

public class Exercicio01 {

    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.setTitulo("Dom Casmurro");
        livro1.setAutor("Machado de Assis");
        livro1.setAnoPublicacao(1899);
        livro1.setPreco(39.90);

        Livro livro2 = new Livro();
        livro2.setTitulo("Vidas Secas");
        livro2.setAutor("Graciliano Ramos");
        livro2.setAnoPublicacao(1938);
        livro2.setPreco(45.50);

        Livro livro3 = new Livro();
        livro3.setTitulo("Grande Sertao: Veredas");
        livro3.setAutor("Guimaraes Rosa");
        livro3.setAnoPublicacao(1956);
        livro3.setPreco(89.00);

        exibir(livro1);
        exibir(livro2);
        exibir(livro3);
    }

    private static void exibir(Livro livro) {
        System.out.println("Titulo: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Ano de publicacao: " + livro.getAnoPublicacao());
        System.out.printf("Preco: R$ %.2f%n", livro.getPreco());
        System.out.println("------------------------------");
    }
}

class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private double preco;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
