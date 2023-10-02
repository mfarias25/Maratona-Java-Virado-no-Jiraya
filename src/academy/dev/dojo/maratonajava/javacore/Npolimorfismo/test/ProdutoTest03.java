package academy.dev.dojo.maratonajava.javacore.Npolimorfismo.test;

import academy.dev.dojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.dev.dojo.maratonajava.javacore.Npolimorfismo.dominio.Notebook;
import academy.dev.dojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.dev.dojo.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("i9", 4000);


        Produto produto2 = new Notebook("Dell G15 ", 7000, 2);

        System.out.println("--------------------------------");

        Notebook notebook = new Notebook("Dell G12 ", 5000);
        notebook.setDataGarantia(1);
        CalculadoraImposto.calcularImposto(notebook);

        System.out.println("--------------------------------");
        CalculadoraImposto.calcularImposto(produto);
        System.out.println("--------------------------------");
        CalculadoraImposto.calcularImposto(produto2);

    }
}
