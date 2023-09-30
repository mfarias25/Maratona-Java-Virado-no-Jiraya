package academy.dev.dojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    int MAX_DATA_SIZE = 10;
    void load();
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

    public static void retriveDataSize() {
        System.out.println("Dentro do retriveDataSize na interface");
    }
}
