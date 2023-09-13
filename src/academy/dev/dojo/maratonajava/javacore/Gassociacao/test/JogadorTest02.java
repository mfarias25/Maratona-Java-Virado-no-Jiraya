package academy.dev.dojo.maratonajava.javacore.Gassociacao.test;

import academy.dev.dojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.dev.dojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Méssi");
        Time time = new Time("Barcelona");
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
