package aplicacao;

import sensor.Sensor;

// Classe de teste em um PACOTE DIFERENTE do Sensor.
// Repare que so conseguimos usar os membros publicos.

public class TesteSensor {

    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        sensor.setLeituraBruta(100.0);

        System.out.printf("Valor calibrado lido pelo sensor: %.2f%n", sensor.lerValor());

        // As linhas abaixo NAO compilam, justamente por causa do encapsulamento.
        // Descomente para ver o erro do compilador:
        //
        // System.out.println(sensor.leituraBruta); // leituraBruta tem acesso private
        // System.out.println(sensor.calibrar());   // calibrar() tem acesso private
    }
}
