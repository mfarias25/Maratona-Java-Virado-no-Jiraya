package academy.dev.dojo.maratonajava.javacore.Hheranca.test;

import academy.dev.dojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.dev.dojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.dev.dojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("3");
        endereco.setCep("13468222");
        System.out.println("--------------------------");
        Pessoa pessoa = new Pessoa("Naruto", "17089099090", endereco);
        pessoa.imprime();
        System.out.println("--------------------------");
        Funcionario funcionario = new Funcionario("Mateus Farias");
        funcionario.setCpf("19098798790");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000);
        funcionario.imprime();
        funcionario.relatorioPagamento();
    }
}
