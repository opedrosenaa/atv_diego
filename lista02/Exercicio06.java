// Exercicio 06 - Classe Retangulo com construtor.
// Conceito: o construtor garante que o objeto ja nasce valido e completo.
// Nao existe retangulo sem base e altura.

public class Exercicio06 {

    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(5.0, 3.0);
        Retangulo r2 = new Retangulo(10.0, 10.0);
        Retangulo r3 = new Retangulo(2.5, 7.4);

        exibir(r1);
        exibir(r2);
        exibir(r3);
    }

    private static void exibir(Retangulo r) {
        System.out.printf("Base %.2f x Altura %.2f -> area = %.2f | perimetro = %.2f%n",
                r.getBase(), r.getAltura(), r.calcularArea(), r.calcularPerimetro());
    }
}

class Retangulo {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
