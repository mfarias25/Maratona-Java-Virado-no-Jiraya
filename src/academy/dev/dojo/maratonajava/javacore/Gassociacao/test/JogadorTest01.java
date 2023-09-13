package academy.dev.dojo.maratonajava.javacore.Gassociacao.test;

import academy.dev.dojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
    Jogador player1 = new Jogador("Pelé");
    Jogador player2 = new Jogador("Méssi");
    Jogador player3 = new Jogador("Ronaldo");
    Jogador[] players = {player1, player2, player3};

        for (Jogador player:players) {
            player.imprime();
        }
    }

}
