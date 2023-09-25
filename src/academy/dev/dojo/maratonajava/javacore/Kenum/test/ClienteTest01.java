package academy.dev.dojo.maratonajava.javacore.Kenum.test;

import academy.dev.dojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.dev.dojo.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Jiraya", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Jaspion", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente3 = new Cliente("Mikey", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente4 = new Cliente("Pato Donald", TipoCliente.PESSOA_FISICA);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);

    }
}
