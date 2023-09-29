package academy.dev.dojo.maratonajava.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco de dados");
    }

    public static void retriveDataSize() {
        System.out.println("Dentro do retriveDataSize na class DatabaseLoader");
    }
}
