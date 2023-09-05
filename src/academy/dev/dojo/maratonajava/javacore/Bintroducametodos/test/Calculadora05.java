package academy.dev.dojo.maratonajava.javacore.Bintroducametodos.test;

import academy.dev.dojo.maratonajava.javacore.Bintroducametodos.dominio.Calculadora;

public class Calculadora05 {
    public static void main(String... args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5,10};
        calculadora.someArray(new int[] {1,2,3,4,5,10});
        calculadora.somaVarArgs( 1,2,3,4,5,10);
    }
}
