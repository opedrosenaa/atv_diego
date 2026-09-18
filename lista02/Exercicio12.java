// Exercicio 12 - Classe Ponto com equals sobrescrito.
// Conceito: == compara REFERENCIAS (se sao o mesmo objeto na memoria);
// equals compara CONTEUDO, do jeito que a classe definir.

public class Exercicio12 {

    public static void main(String[] args) {
        Ponto p1 = new Ponto(3, 4);
        Ponto p2 = new Ponto(3, 4);
        Ponto p3 = p1; // p3 aponta para o MESMO objeto de p1

        System.out.println("p1 == p2: " + (p1 == p2));           // false: objetos diferentes
        System.out.println("p1.equals(p2): " + p1.equals(p2));   // true: mesmas coordenadas

        System.out.println("p1 == p3: " + (p1 == p3));           // true: mesma referencia
        System.out.println("p1.equals(p3): " + p1.equals(p3));   // true

        System.out.println("p2 == p3: " + (p2 == p3));           // false
        System.out.println("p2.equals(p3): " + p2.equals(p3));   // true
    }
}

class Ponto {
    private int x;
    private int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Ponto outro = (Ponto) obj;
        return this.x == outro.x && this.y == outro.y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
