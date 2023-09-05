package academy.dev.dojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição01WhileDowhileFor {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;


        while (count < 10) {
          System.out.println(++count);
          //count += 1;
        }

        /* do-while roda pelo menos 1x mesmo se for false.

        do {
            System.out.println("dentro do do-while");
        }
        while (count < 10); {

        }*/


        for (int i= 0;i < 10; i++) {  // for trabalha com index, ja DO trabalha com condicoes.
            System.out.println("For "+i);
        }
    }
}
