package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Megalo Box", "TV", 12);
        anime.imprime();
        anime.init("Hajime No Ippo", "TV", 100, "boxe");
        anime.imprime();
    }
}
