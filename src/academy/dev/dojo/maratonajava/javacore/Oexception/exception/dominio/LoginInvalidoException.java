package academy.dev.dojo.maratonajava.javacore.Oexception.exception.dominio;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        super("Login invalido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
