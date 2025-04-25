package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Anime;

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