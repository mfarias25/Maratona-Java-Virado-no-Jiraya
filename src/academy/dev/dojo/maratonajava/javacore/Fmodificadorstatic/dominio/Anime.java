package academy.dev.dojo.maratonajava.javacore.Fmodificadorstatic.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    //0 - Bloco de inicializacao estatico é executado quando  a JVM carregar a classe
    //1 - Alocado um espaco em memoria pro objeto
    //2 - Cada atributo de classe é criado e inicializado com valores defualt ou o que for passado.
    //3 - bloco de inicializacao e executado
    //4 - Contrutor é executado

    static {

        System.out.println("Dentro do bloco de inicializacao1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }
    static {
        System.out.println("Dentro do bloco de inicializacao2");
    }

    static {
        System.out.println("Dentro do bloco de inicializacao3");
    }

    static {
        System.out.println("Dentro do bloco de inicializacao nao staticos1");
    }
    static {
        System.out.println("Dentro do bloco de inicializacao nao staticos2");
    }
    static {
        System.out.println("Dentro do bloco de inicializacao nao staticos3");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio:Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return Anime.episodios;
    }
}
