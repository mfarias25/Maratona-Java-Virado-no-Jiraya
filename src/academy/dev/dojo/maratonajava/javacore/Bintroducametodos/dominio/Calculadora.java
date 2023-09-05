package academy.dev.dojo.maratonajava.javacore.Bintroducametodos.dominio;

public class Calculadora {
    public  void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(20 - 10);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        return num1/num2;
    }

    public double divideDoisNumeros02(double num1, double num2) {
        if(num2 != 0) {
            return num1/num2;
        }
            System.out.println("Não existe divisão por zero");
            return 0;
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero");
        }
        else {
            System.out.println(num1/num2);
        }
    }
    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do altera dois numeros");
        System.out.println("Num1: " +num1 );
        System.out.println("Num2: " +num2 );
    }
    public void someArray(int[] numeros) {
        int soma = 0;
        for (int num:numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num:numeros) {
            soma += num;
        }
        System.out.println(soma);

    }
}
