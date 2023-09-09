package academy.dev.dojo.maratonajava.javacore.Dconstrutores.test;


import academy.dev.dojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Akira", "TV", 12, "Ação", "Sunrise");
        anime.imprime();
    }
}
