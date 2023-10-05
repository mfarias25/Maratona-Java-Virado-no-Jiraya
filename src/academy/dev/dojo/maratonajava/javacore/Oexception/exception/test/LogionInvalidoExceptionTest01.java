package academy.dev.dojo.maratonajava.javacore.Oexception.exception.test;

import academy.dev.dojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LogionInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in); //Simular o usuario digitando os dados
        String usernameDB = "Goku";
        String senhaDB = "ssj";
        System.out.println("Usuario");
        String usernameDigitando = teclado.nextLine();
        System.out.println("Senha");
        String senhaDigitada = teclado.nextLine();
        if (!usernameDB.equals(usernameDigitando) || !senhaDB.equals(senhaDigitada)) {
            throw new LoginInvalidoException("Usuario ou senha invalidos");
        }

        System.out.println("Usuario logado com sucesso");
    }
}
