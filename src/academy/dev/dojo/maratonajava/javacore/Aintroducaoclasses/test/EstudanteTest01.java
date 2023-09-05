package academy.dev.dojo.maratonajava.javacore.introducaoclasses.test;

import academy.dev.dojo.maratonajava.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante(); //Variavel e um Objeto Estudante.
        estudante.nome = "Itachi";
        estudante.sexo = 'M';
        estudante.idade = 33;
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println(estudante);
    }
}
