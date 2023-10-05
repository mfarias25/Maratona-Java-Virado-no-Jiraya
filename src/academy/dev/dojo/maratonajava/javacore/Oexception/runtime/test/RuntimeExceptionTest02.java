package academy.dev.dojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.File;
import java.io.IOException;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) throws IOException{
        criarNovoarquivo();
    }

    public static void criarNovoarquivo() throws IOException {
        File file = new File("arquivo\\ test.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado" + isCriado);
        }catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
