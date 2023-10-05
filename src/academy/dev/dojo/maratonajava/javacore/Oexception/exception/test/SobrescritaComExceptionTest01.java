package academy.dev.dojo.maratonajava.javacore.Oexception.exception.test;

import academy.dev.dojo.maratonajava.javacore.Oexception.exception.dominio.Funcionario;
import academy.dev.dojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;
import academy.dev.dojo.maratonajava.javacore.Oexception.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
