package academy.dev.dojo.maratonajava.javacore.Bintroducametodos.test;

import academy.dev.dojo.maratonajava.javacore.Bintroducametodos.dominio.Estudante;
import academy.dev.dojo.maratonajava.javacore.Bintroducametodos.dominio.ImpressoraEstudante01;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante01 impressora = new ImpressoraEstudante01();

        estudante1.nome = "Itachi";
        estudante1.idade = 33;
        estudante1.sexo = 'M';

        estudante2.nome = "Hinata";
        estudante2.idade = 22;
        estudante2.sexo = 'F';

        System.out.println(estudante1.nome);
        System.out.println(estudante1.idade);
        System.out.println(estudante1.sexo);

        System.out.println("------------------------");

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
        System.out.println("------------------------");
        impressora.imprime(estudante1);
        impressora.imprime(estudante2);

        System.out.println("------------------------");

        impressora.imprime(estudante1);
        impressora.imprime(estudante2);
    }
}
