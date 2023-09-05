package academy.dev.dojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06SwitchExecicio {
    public static void main(String[] args) {
        //Utilizando Switch Dados os valores de 1-7, imprima se e dia util ou final de semana
        //Considerando 1 como domingo

        byte dia = 1;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
                break;
            default:
                System.out.println("Opcao Invalida");
                break;
        }


    }
}
