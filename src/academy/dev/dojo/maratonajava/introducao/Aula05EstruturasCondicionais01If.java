package academy.dev.dojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if(isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcolica");

        }
        if (!isAutorizadoComprarBebida){ //Ou pode ser usado somento passando ELSE
            System.out.println("Negado! idade a baixo do permitido");
        }


    }
}
