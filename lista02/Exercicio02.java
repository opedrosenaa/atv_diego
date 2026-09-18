// Exercicio 02 - Classe Produto com validacao dentro dos setters.
// Conceito: o set nao e uma "porta aberta". Ele e o lugar onde a classe
// protege o proprio estado, recusando valores invalidos.

public class Exercicio02 {

    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Teclado mecanico");
        produto.setPreco(250.00);
        produto.setQuantidade(10);

        System.out.println("Estado inicial:");
        exibir(produto);

        System.out.println("\nTentando atribuir valores invalidos:");
        produto.setPreco(-99.90);
        produto.setQuantidade(-5);

        System.out.println("\nEstado final (os valores invalidos foram recusados):");
        exibir(produto);
    }

    private static void exibir(Produto produto) {
        System.out.println("Nome: " + produto.getNome());
        System.out.printf("Preco: R$ %.2f%n", produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());
    }
}

class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Erro: o preco nao pode ser negativo. Valor recusado: " + preco);
            return;
        }
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            System.out.println("Erro: a quantidade nao pode ser menor que zero. Valor recusado: " + quantidade);
            return;
        }
        this.quantidade = quantidade;
    }
}
