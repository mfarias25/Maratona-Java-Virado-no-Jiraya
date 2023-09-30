package academy.dev.dojo.maratonajava.javacore.Npolimorfismo.test;

import academy.dev.dojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.dev.dojo.maratonajava.javacore.Npolimorfismo.dominio.Notebook;
import academy.dev.dojo.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("i9, Rtx 3060", 7000);
        Notebook notebook = new Notebook("Alienware", 13000);
        CalculadoraImposto.calculateImpostoComputador(computador);
        System.out.println("----------------------------------------------------------------");
        CalculadoraImposto.calculateImpostoNotebook(notebook);

    }
}
