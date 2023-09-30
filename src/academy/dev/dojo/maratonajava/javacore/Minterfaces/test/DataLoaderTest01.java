package academy.dev.dojo.maratonajava.javacore.Minterfaces.test;

import academy.dev.dojo.maratonajava.javacore.Minterfaces.dominio.DataLoader;
import academy.dev.dojo.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;
import academy.dev.dojo.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        fileLoader.checkPermission();

        DatabaseLoader.retriveDataSize();
        DataLoader.retriveDataSize();
        FileLoader.retriveDataSize();

    }
}
