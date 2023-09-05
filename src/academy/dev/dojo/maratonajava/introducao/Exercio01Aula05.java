package academy.dev.dojo.maratonajava.introducao;

public class Exercio01Aula05 {
    public static void main(String[] args) {
        double salarioAnual = 35000;
        double primeiraTaxa = 9.70 / 100;
        double segundaTaxa = 37.35 / 100;
        double terceiraTaxa = 49.50 / 100;
        double valorImposto;
        double salarioMinimo = 34712;
        double salaAcimaDaMedia = 68507;

        if (salarioAnual <= salarioMinimo) {
            valorImposto = salarioAnual * primeiraTaxa;
        }else if(salarioAnual >= salarioMinimo && salarioAnual <= salaAcimaDaMedia){
            valorImposto = salarioAnual * segundaTaxa;
        }else {
            valorImposto = salarioAnual * terceiraTaxa;
        }
        System.out.println("Valor do imposto:" + valorImposto);


    }
}
