package academy.dev.dojo.maratonajava.javacore.Kenum.test;

import academy.dev.dojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.dev.dojo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import academy.dev.dojo.maratonajava.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Jiraya", TipoCliente.PESSOA_FISICA, TipoPagamento.Debito);
        Cliente cliente2 = new Cliente("Jaspion", TipoCliente.PESSOA_JURIDICA,TipoPagamento.Credito);
        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println(TipoPagamento.Debito.calcularDesconto(100));
        System.out.println(TipoPagamento.Credito.calcularDesconto(100));
        TipoCliente tipoClient = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoClient.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente2);
    }
}
