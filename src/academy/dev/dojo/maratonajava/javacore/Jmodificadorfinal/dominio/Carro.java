package academy.dev.dojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    public final double VELOCIDADE_LIMITE; //Constante, nao se pode alterar o valor depois de compilado.

    public Carro() {
        VELOCIDADE_LIMITE = 250;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
