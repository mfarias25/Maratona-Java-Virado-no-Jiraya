package academy.dev.dojo.maratonajava.javacore.Npolimorfismo.service;

import academy.dev.dojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
