package academy.dev.dojo.maratonajava.javacore.Npolimorfismo.test;

import academy.dev.dojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.dev.dojo.maratonajava.javacore.Npolimorfismo.dominio.Notebook;
import academy.dev.dojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("i9", 4000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("--------------------------------");
        Produto produto2 = new Notebook("Dell G15 ", 7000);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
        System.out.println("--------------------------------");
        Notebook notebook = new Notebook("Dell G12 ", 5000, 1);
        System.out.println(notebook.getNome());
        System.out.println(notebook.getValor());
        System.out.println(notebook.calcularImposto());
        System.out.println(notebook.getDataGarantia() + " ano de Garantia");

    }
}
