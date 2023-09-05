package academy.dev.dojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição05Continue {
    public static void main(String[] args) {
        // Dado o valor de uma carro, descubra em quantas x ele pode ser parcelado.
        // Condicao valorParcela >=1000

        double valorTotal = 30000;
        for (int parcela = (int)valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " R$" +valorParcela);

        }
    }
}
