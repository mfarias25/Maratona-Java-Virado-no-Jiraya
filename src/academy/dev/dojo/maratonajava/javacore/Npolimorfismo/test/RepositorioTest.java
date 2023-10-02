package academy.dev.dojo.maratonajava.javacore.Npolimorfismo.test;

import academy.dev.dojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.dev.dojo.maratonajava.javacore.Npolimorfismo.service.RepositorioBancoDeDados;
import academy.dev.dojo.maratonajava.javacore.Npolimorfismo.service.RepositorioMemoria;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
        List<String> list = new ArrayList<>();
        list.add("Naruto");
        list.add("Itachi");
        list.add("Kakashi");
        System.out.println(list);
    }
}
