package academy.dev.dojo.maratonajava.javacore.Bintroducametodos.test;

import academy.dev.dojo.maratonajava.javacore.Bintroducametodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        //pessoa.nome = "Itachi";
        pessoa.setNome("Itachi");
        pessoa.setIdade(33);
        pessoa.imprime();
        //System.out.println(pessoa.getNome());
        //System.out.println(pessoa.getIdade());
    }
}
