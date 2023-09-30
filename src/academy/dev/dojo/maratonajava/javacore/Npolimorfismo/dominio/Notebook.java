package academy.dev.dojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Notebook extends Produto{
    private int dataGarantia;
    public static final double IMPOSTO_POR_CENTO = 0.06;
    public Notebook(String nome, double valor) {
        super(nome, valor);
    }

    public Notebook(String nome, double valor, int dataGarantia) {
        super(nome, valor);
        this.dataGarantia = dataGarantia;
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do Notebook");
       return this.valor * IMPOSTO_POR_CENTO;
    }

    public int getDataGarantia() {
        return dataGarantia;
    }

    public void setDataGarantia(int dataGarantia) {
        this.dataGarantia = dataGarantia;
    }
}
