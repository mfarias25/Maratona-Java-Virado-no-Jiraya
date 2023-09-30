package academy.dev.dojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Notebook extends Produto{
    public static final double IMPOSTO_POR_CENTO = 0.06;
    public Notebook(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Tomate");
       return this.valor * IMPOSTO_POR_CENTO;
    }
}
