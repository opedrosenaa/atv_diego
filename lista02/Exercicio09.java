// Exercicio 09 - Classe Calculadora com o metodo somar sobrecarregado.
// Conceito: sobrecarga (overload) e ter varios metodos com o MESMO nome e
// listas de parametros diferentes. O compilador escolhe a versao certa.

public class Exercicio09 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("somar(int, int) = " + calculadora.somar(7, 3));
        System.out.println("somar(int, int, int) = " + calculadora.somar(7, 3, 10));
        System.out.println("somar(double, double) = " + calculadora.somar(2.5, 4.75));

        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("somar(int[]) = " + calculadora.somar(numeros));
    }
}

class Calculadora {

    // Versao 1: dois inteiros.
    public int somar(int a, int b) {
        return a + b;
    }

    // Versao 2: tres inteiros.
    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    // Versao 3: dois numeros reais.
    public double somar(double a, double b) {
        return a + b;
    }

    // Versao 4: um vetor de inteiros.
    public int somar(int[] numeros) {
        int total = 0;
        for (int numero : numeros) {
            total += numero;
        }
        return total;
    }
}
