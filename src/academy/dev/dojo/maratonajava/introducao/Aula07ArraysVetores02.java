package academy.dev.dojo.maratonajava.introducao;

public class Aula07ArraysVetores02 {
    public static void main(String[] args) {
        //byte, short, int, long, float e duble 0
        //char, '\\u000' ''
        //boolen false
        //String null

        String [] nomes = new String[4];// type reference

        nomes[0] = "Goku";
        nomes[1] = "Naruto";
        nomes[2] = "Luffy";
        nomes[3] = "Itachi";

        for (int i = 0; i < nomes.length ; i++) {
            System.out.println(nomes[i]);
        }
    }
}
