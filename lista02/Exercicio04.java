// Exercicio 04 - Classe ContaBancaria com saldo somente leitura.
// Conceito: saldo tem get e NAO tem set. A unica forma de alterar o saldo
// e passando pelas regras de negocio (depositar / sacar).

public class Exercicio04 {

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setNumero("12345-6");
        conta.setTitular("Ana Souza");

        System.out.printf("Saldo inicial: R$ %.2f%n", conta.getSaldo());

        conta.depositar(1000.00);
        System.out.printf("Apos deposito de R$ 1000,00: R$ %.2f%n", conta.getSaldo());

        conta.sacar(400.00);
        System.out.printf("Apos saque de R$ 400,00: R$ %.2f%n", conta.getSaldo());

        conta.sacar(5000.00);
        System.out.printf("Apos tentativa de saque de R$ 5000,00: R$ %.2f%n", conta.getSaldo());
    }
}

class ContaBancaria {
    private String numero;
    private String titular;
    private double saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Apenas get: nao existe setSaldo.
    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: o valor do deposito deve ser positivo.");
            return;
        }
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: o valor do saque deve ser positivo.");
            return;
        }
        if (valor > saldo) {
            System.out.println("Erro: saldo insuficiente para sacar R$ " + valor);
            return;
        }
        saldo -= valor;
    }
}
