// Exercicio 08 - Classe Data com dois construtores.
// Conceito: o construtor mais simples delega para o mais completo usando this(),
// assumindo valores padrao (dia 1 e mes 1).

public class Exercicio08 {

    public static void main(String[] args) {
        Data data1 = new Data(14, 9, 2026);
        Data data2 = new Data(2030);

        System.out.println("Data completa: " + data1.formatar());
        System.out.println("Data so com o ano: " + data2.formatar());
    }
}

class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Assume dia 1 e mes 1 e repassa para o construtor completo.
    public Data(int ano) {
        this(1, 1, ano);
    }

    public String formatar() {
        return dia + "/" + mes + "/" + ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }
}
