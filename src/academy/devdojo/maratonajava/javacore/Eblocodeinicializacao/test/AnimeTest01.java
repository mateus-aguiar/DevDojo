package academy.devdojo.maratonajava.javacore.Eblocodeinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocodeinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        Anime anime1 = new Anime("One Piece");

        System.out.println("For");
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }
    }
}
