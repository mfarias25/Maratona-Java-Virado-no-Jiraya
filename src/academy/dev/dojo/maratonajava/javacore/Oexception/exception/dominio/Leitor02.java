package academy.dev.dojo.maratonajava.javacore.Oexception.exception.dominio;

import java.io.Closeable;
import java.io.IOException;

public class Leitor02 implements Closeable {

    @Override
    public void close() throws IOException {
        System.out.println("Fechando Leitor02");
    }
}
