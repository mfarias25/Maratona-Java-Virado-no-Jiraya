package academy.dev.dojo.maratonajava.javacore.Csobrecargamedotos.test;

import academy.dev.dojo.maratonajava.javacore.Csobrecargamedotos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto", "TV", 12, "Ação");

        anime.imprime();
    }
}
