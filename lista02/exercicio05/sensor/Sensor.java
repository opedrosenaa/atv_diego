package sensor;

// Exercicio 05 - Classe Sensor.
// Conceito: niveis de acesso. "public" e visivel de qualquer pacote;
// "private" so existe dentro da propria classe. calibrar() e um detalhe
// interno do sensor e nao deve ser chamado de fora.

public class Sensor {

    private double leituraBruta;

    public void setLeituraBruta(double leituraBruta) {
        this.leituraBruta = leituraBruta;
    }

    // Metodo publico: e a unica porta de entrada do objeto.
    public double lerValor() {
        return calibrar();
    }

    // Metodo privado: chamado apenas internamente, por lerValor().
    private double calibrar() {
        return (leituraBruta * 1.02) - 0.5;
    }
}
