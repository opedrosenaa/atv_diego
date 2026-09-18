import java.util.HashSet;
import java.util.Set;

// Exercicio 13 - equals e hashCode com base no RA.
// Conceito: o HashSet usa PRIMEIRO o hashCode (para achar o "balde") e
// DEPOIS o equals (para confirmar a igualdade). Se a classe nao sobrescreve
// os dois, o HashSet usa a identidade do objeto e aceita duplicatas logicas.

public class Exercicio13 {

    public static void main(String[] args) {
        // Com equals e hashCode sobrescritos
        Set<Aluno> comEquals = new HashSet<>();
        comEquals.add(new Aluno(1001, "Ana Souza"));
        comEquals.add(new Aluno(1001, "Ana S. Souza"));
        System.out.println("Com equals e hashCode -> elementos no conjunto: " + comEquals.size());

        // Sem equals e hashCode (equivale a deixar os dois metodos comentados)
        Set<AlunoSemEquals> semEquals = new HashSet<>();
        semEquals.add(new AlunoSemEquals(1001, "Ana Souza"));
        semEquals.add(new AlunoSemEquals(1001, "Ana S. Souza"));
        System.out.println("Sem equals e hashCode -> elementos no conjunto: " + semEquals.size());
    }
}

class Aluno {
    private int ra;
    private String nome;

    public Aluno(int ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Aluno outro = (Aluno) obj;
        return this.ra == outro.ra;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(ra);
    }
}

// Mesma classe, mas sem equals e sem hashCode.
class AlunoSemEquals {
    private int ra;
    private String nome;

    public AlunoSemEquals(int ra, String nome) {
        this.ra = ra;
        this.nome = nome;
    }
}
