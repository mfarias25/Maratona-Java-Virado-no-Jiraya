package academy.dev.dojo.maratonajava.javacore.Gassociacao.test;

import academy.dev.dojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.dev.dojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Ronaldo");
        Time time = new Time("Corinthians");
        Jogador[] jogadores = {jogador};


        jogador.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");
        jogador.imprime();
        System.out.println("--- Time ---");
        time.imprime();
    }
}
