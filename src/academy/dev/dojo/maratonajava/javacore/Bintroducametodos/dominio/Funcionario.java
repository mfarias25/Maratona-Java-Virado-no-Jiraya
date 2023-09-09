package academy.dev.dojo.maratonajava.javacore.Bintroducametodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double media;
    private double[] salarios;

    public void imprimeDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.println(salario + " ");
        }

        imprimeMediaSalarios();
    }

    public void imprimeMediaSalarios() {
        if (salarios == null) {
            return;
        }

        for (double salario : salarios) {
            media += salario;
            media /= salarios.length;
        }

        System.out.println("Media salarial " + media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getMedia() {
        return media;
    }

    public double[] getSalarios() {
        return salarios;
    }
}
