package academy.dev.dojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.dev.dojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Kami";
        professor.idade = 140;
        professor.sexo = 'M';

        System.out.println("Nome:" + professor.nome + " " +"Idade:" + professor.idade + " " + "Sexo:" + professor.sexo);
    }
}
