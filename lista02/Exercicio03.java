// Exercicio 03 - Classe Funcionario com atributo derivado.
// Conceito: salarioTotal NAO e atributo. Ele e calculado na hora em que
// alguem pergunta. Guardar o total como atributo criaria risco de o objeto
// ficar inconsistente quando o bonus mudasse.

public class Exercicio03 {

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Ana Souza");
        funcionario1.setSalarioBase(3200.00);
        funcionario1.setBonus(450.00);

        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome("Carlos Lima");
        funcionario2.setSalarioBase(5100.00);
        funcionario2.setBonus(1200.00);

        System.out.printf("%s -> salario total: R$ %.2f%n",
                funcionario1.getNome(), funcionario1.getSalarioTotal());
        System.out.printf("%s -> salario total: R$ %.2f%n",
                funcionario2.getNome(), funcionario2.getSalarioTotal());
    }
}

class Funcionario {
    private String nome;
    private double salarioBase;
    private double bonus;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Atributo derivado: calculado, nunca armazenado.
    public double getSalarioTotal() {
        return salarioBase + bonus;
    }
}
