package academy.dev.dojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição04ExecicioBreak {
    public static void main(String[] args) {
        // Dado o valor de uma carro, descubra em quantas x ele pode ser parcelado.
        // Condicao valorParcela >=1000

        double valorTotal = 30000;

        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela <1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$" +valorParcela);

        }
    }
}
