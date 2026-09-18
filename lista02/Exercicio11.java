import java.util.ArrayList;
import java.util.List;

// Exercicio 11 - Classe Musica com toString sobrescrito.
// Conceito: toString define como o objeto se apresenta em texto. Sem ele,
// o println mostraria algo como "Musica@1b6d3586" (classe + hashcode).

public class Exercicio11 {

    public static void main(String[] args) {
        Musica musica1 = new Musica("Construcao", "Chico Buarque", "6:23");
        Musica musica2 = new Musica("Garota de Ipanema", "Tom Jobim", "5:14");
        Musica musica3 = new Musica("Tropicalia", "Caetano Veloso", "3:39");

        // 1) objeto direto no println
        System.out.println(musica1);

        // 2) objeto dentro de uma concatenacao de texto
        System.out.println("Tocando agora: " + musica2);

        // 3) objeto dentro de uma lista
        List<Musica> playlist = new ArrayList<>();
        playlist.add(musica1);
        playlist.add(musica2);
        playlist.add(musica3);
        System.out.println(playlist);
    }
}

class Musica {
    private String titulo;
    private String artista;
    private String duracao;

    public Musica(String titulo, String artista, String duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return titulo + " - " + artista + " (" + duracao + ")";
    }
}
