package academy.dev.dojo.maratonajava.introducao;

public class Aula04Operadores {

    // +, -, /, *
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        double resultado = numero1 / (double)numero2;

        System.out.println(+numero1+numero2+"Valor:"+numero1+numero2);
        System.out.println("Valor:"+numero1+numero2);
        System.out.println(numero2-numero1);
        System.out.println(numero2+numero1);
        System.out.println(resultado);
        System.out.println(numero2*numero1);


        // %
        int resto = 20 % 2;
        System.out.println(resto);

        //< > <= >= != ==
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezDiferenteDeVinte = 10 != 20;
        System.out.println("Dez maior que vinte? = " + isDezMaiorQueVinte);
        System.out.println("Dez meor que vinte? = " + isDezMenorQueVinte);
        System.out.println("Dez igual que vinte? = " + isDezIgualQueVinte);
        System.out.println("Dez diferente que vinte? = " + isDezDiferenteDeVinte);


        //  AND = &&, OU = ||, NOT !

        float salario = 3500F;
        int idade = 30;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381; // true+false = false

        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTrinta);


        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 1000;
        float plasytationCinco = 900F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > plasytationCinco || valorTotalContaPoupanca > plasytationCinco;
        System.out.println("Tenho dinheiro para comprar o Playstation5? " + isPlaystationCincoCompravel);

        // =, +=, -+, *=, /=

        float bonus = 1800; //1800
        //bonus = bonus + 1000;
        bonus += 1000; //2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        System.out.println(bonus);

        //
        int contador = 0;
        contador ++; // +1
        contador --;
        //++contador;
        //--contador;

        int contador2 = 0;

        System.out.println(contador2++);
        System.out.println(contador2);
        System.out.println(++contador2);

    }
}
