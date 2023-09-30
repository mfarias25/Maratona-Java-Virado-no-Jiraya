package academy.dev.dojo.maratonajava.javacore.Npolimorfismo.test;

import academy.dev.dojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.dev.dojo.maratonajava.javacore.Npolimorfismo.dominio.Notebook;
import academy.dev.dojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.dev.dojo.maratonajava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("i9, Rtx 3060", 7000);
        Notebook notebook = new Notebook("Alienware", 13000);
        Televisao televisao = new Televisao("LG C3 '65'" , 9000);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("----------------------------------------------------------------");
        CalculadoraImposto.calcularImposto(notebook);
        System.out.println("----------------------------------------------------------------");
        CalculadoraImposto.calcularImposto(televisao);

    }
}
