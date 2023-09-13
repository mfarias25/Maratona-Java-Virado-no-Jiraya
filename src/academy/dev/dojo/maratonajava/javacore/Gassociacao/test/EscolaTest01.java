package academy.dev.dojo.maratonajava.javacore.Gassociacao.test;

import academy.dev.dojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.dev.dojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Kakashi Sensei");
        Professor professor2 = new Professor("Jiraya Sensei");
        Professor professor3 = new Professor("Kame Sensei");
        Professor[] professores = {professor1, professor2, professor3};
        Escola escola = new Escola("Escola de Konoha", professores);

        escola.imprime();
    }
}
