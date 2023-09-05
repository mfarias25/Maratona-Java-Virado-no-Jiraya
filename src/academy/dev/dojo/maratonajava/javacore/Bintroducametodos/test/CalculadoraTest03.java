package academy.dev.dojo.maratonajava.javacore.Bintroducametodos.test;

import academy.dev.dojo.maratonajava.javacore.Bintroducametodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int result = (int) calculadora.divideDoisNumeros(20,10);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros02(20,0));
        System.out.println("----------------------------------------");
        calculadora.imprimeDivisaoDeDoisNumeros(86,0);
    }
}
