package academy.dev.dojo.maratonajava.javacore.Oexception.Error.test;

public class StackOverFlowTest01 {
    public static void main(String[] args) {
        recursividade();

    }
    public static void recursividade() {
        recursividade();
    }
}