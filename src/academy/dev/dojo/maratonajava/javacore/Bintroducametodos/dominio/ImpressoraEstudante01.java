package academy.dev.dojo.maratonajava.javacore.Bintroducametodos.dominio;

public class ImpressoraEstudante01 {
    public void imprime(Estudante estudante) {
        System.out.println("------------------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        estudante.nome = "Naruto";

    }
}
