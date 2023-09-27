package academy.dev.dojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.dev.dojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.dev.dojo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.dev.dojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Naruto", 50000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Mateus", 2000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }

}
