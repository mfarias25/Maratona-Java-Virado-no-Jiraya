package academy.dev.dojo.maratonajava.javacore.Bintroducametodos.test;

import academy.dev.dojo.maratonajava.javacore.Bintroducametodos.dominio.Funcionario;

public class FuncionarioTestExercise01 {
    public static void main(String... args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Pedro";
        funcionario.idade = 25;
        funcionario.salarios = new double[] {2000, 550.50, 3500};

        funcionario.imprimeDados();
    }
}
