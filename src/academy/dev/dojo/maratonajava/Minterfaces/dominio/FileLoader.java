package academy.dev.dojo.maratonajava.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivo");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no arquivo");
    }

    public static void retriveDataSize() {
        System.out.println("Dentro do retriveDataSize no arquivo FileLoader");
    }
}
