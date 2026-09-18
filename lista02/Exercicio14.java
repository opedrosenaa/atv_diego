// Exercicio 14 - Passagem de parametro em Java.
// Conceito: Java passa a REFERENCIA POR VALOR. O metodo recebe uma copia da
// referencia. Alterar o objeto apontado afeta o original; trocar o que a
// copia aponta (new) NAO afeta a variavel de fora.

public class Exercicio14 {

    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();
        veiculo.setPlaca("XYZ1A23");

        System.out.println("Placa inicial: " + veiculo.getPlaca());

        alterarPlaca(veiculo);
        System.out.println("Depois de alterarPlaca: " + veiculo.getPlaca());

        trocarObjeto(veiculo);
        System.out.println("Depois de trocarObjeto: " + veiculo.getPlaca());
    }

    // Altera o ESTADO do objeto que veio de fora -> a mudanca aparece na main.
    private static void alterarPlaca(Veiculo veiculo) {
        veiculo.setPlaca("AAA0A11");
    }

    // Aponta a copia local para um objeto NOVO -> a variavel da main nao muda.
    private static void trocarObjeto(Veiculo veiculo) {
        Veiculo novo = new Veiculo();
        novo.setPlaca("BBB0B22");
        veiculo = novo;
    }
}

class Veiculo {
    private String placa;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
