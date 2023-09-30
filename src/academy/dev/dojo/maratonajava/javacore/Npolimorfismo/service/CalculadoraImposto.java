package academy.dev.dojo.maratonajava.javacore.Npolimorfismo.service;

import academy.dev.dojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.dev.dojo.maratonajava.javacore.Npolimorfismo.dominio.Notebook;

public class CalculadoraImposto {
    public static void calculateImpostoComputador(Computador computador){
        System.out.println("Relatorio de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Imposto do computador" + computador.getNome());
        System.out.println("Impsto a ser pago" + computador.getValor());
    }

    public static void calculateImpostoNotebook(Notebook notebook){
        System.out.println("Relatorio de imposto do computador");
        double imposto = notebook.calcularImposto();
        System.out.println("Imposto do notebook" + notebook.getNome());
        System.out.println("Impsto a ser pago" + notebook.getValor());
    }
}
