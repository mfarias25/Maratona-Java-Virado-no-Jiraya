package academy.dev.dojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Software de previsao do futuro");
        System.out.println("Digite dua pergunta e eu responderei sim ou nao");
        String pergunta = input.nextLine();
        if (pergunta.charAt(0) == ' ') {
            System.out.println("Sim");
        }else {
                System.out.println("Nao");
            }
    }
}
