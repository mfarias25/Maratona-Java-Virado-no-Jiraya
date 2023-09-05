package academy.dev.dojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.dev.dojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Naruto";
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
