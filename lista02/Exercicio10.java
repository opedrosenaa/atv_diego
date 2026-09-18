// Exercicio 10 - Classe Ingresso com aplicarDesconto sobrecarregado.
// Conceito: a versao mais especifica reaproveita a versao mais simples,
// em vez de repetir a conta do desconto.

public class Exercicio10 {

    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso("Inteira", 200.00);
        System.out.printf("Valor original: R$ %.2f%n", ingresso.getValor());

        double valorComDesconto = ingresso.aplicarDesconto(30.0);
        System.out.printf("Desconto de 30%%: R$ %.2f%n", valorComDesconto);

        double valorComTeto = ingresso.aplicarDesconto(30.0, 40.00);
        System.out.printf("Desconto de 30%% limitado a R$ 40,00: R$ %.2f%n", valorComTeto);
    }
}

class Ingresso {
    private String tipo;
    private double valor;

    public Ingresso(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    // Versao 1: aplica o percentual e devolve o valor final.
    public double aplicarDesconto(double percentual) {
        double desconto = valor * (percentual / 100.0);
        return valor - desconto;
    }

    // Versao 2: chama a versao 1 e, se o desconto passar do teto, usa o teto.
    public double aplicarDesconto(double percentual, double descontoMaximo) {
        double valorFinal = aplicarDesconto(percentual);
        double descontoAplicado = valor - valorFinal;

        if (descontoAplicado > descontoMaximo) {
            return valor - descontoMaximo;
        }
        return valorFinal;
    }
}
