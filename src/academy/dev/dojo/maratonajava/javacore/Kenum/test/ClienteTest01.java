package academy.dev.dojo.maratonajava.javacore.Kenum.test;

import academy.dev.dojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.dev.dojo.maratonajava.javacore.Kenum.dominio.Cliente.TipoPagamento;
import academy.dev.dojo.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Jiraya", TipoCliente.PESSOA_FISICA, TipoPagamento.Debito);
        Cliente cliente2 = new Cliente("Jaspion", TipoCliente.PESSOA_JURIDICA, TipoPagamento.Credito);
        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
