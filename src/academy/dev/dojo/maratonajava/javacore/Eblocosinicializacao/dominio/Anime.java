package academy.dev.dojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    //1 - Alocado um espaco em memoria pro objeto
    //2 - Cada atributo de classe é criado e inicializado com valores defualt ou o que for passado.
    //3 - bloco de inicializacao e executado
    //4 - Contrutor é executado

    {
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodios:this.episodios) {
            System.out.println(episodios + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
