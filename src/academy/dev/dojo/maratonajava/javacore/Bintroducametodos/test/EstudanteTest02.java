package academy.dev.dojo.maratonajava.javacore.Bintroducametodos.test;

import academy.dev.dojo.maratonajava.javacore.Bintroducametodos.dominio.Estudante;
import academy.dev.dojo.maratonajava.javacore.Bintroducametodos.dominio.ImpressoraEstudante01;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Itachi";
        estudante1.idade = 33;
        estudante1.sexo = 'M';

        estudante2.nome = "Hinata";
        estudante2.idade = 22;
        estudante2.sexo = 'F';

        estudante1.imprime();
        estudante2.imprime();

    }
}
