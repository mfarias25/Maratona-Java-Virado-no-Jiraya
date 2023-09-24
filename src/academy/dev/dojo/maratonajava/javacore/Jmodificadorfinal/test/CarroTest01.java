package academy.dev.dojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.dev.dojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import academy.dev.dojo.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;
import academy.dev.dojo.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.COMPRADOR.setNome("Gohan");
        System.out.println(carro.COMPRADOR);
        System.out.println(carro.VELOCIDADE_LIMITE);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Julian");
        ferrari.imprime();

    }
}
