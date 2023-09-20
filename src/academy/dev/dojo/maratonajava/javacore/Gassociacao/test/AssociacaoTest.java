package academy.dev.dojo.maratonajava.javacore.Gassociacao.test;

import academy.dev.dojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.dev.dojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.dev.dojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.dev.dojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua Das Palmas");
        Aluno aluno = new Aluno("Naruto", 29);
        Professor professor = new Professor("Jiraya", "Ninja");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Como se tornar um Hokage", alunosParaSeminario, local);
        Seminario[] seminarioDisponiveis = {seminario};
        professor.setSeminario(seminarioDisponiveis);
        professor.imprime();
    }
}
