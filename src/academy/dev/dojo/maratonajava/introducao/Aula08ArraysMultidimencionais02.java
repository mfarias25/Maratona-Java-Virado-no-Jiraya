package academy.dev.dojo.maratonajava.introducao;

public class Aula08ArraysMultidimencionais02 {
    public static void main(String[] args) {
        int [] array = {1, 2, 3};
        int [] [] arrInt = new int[3][];
        arrInt[0] = new int[2];
        arrInt[1] = array;
        arrInt[2] = new int[] {1, 2, 3, 4, 5, 6};

        //int [] [] arrayInt2 = {{0,0}, {1,2,3}, {1,2,3,4,5,6}}; //FORMA MAIS FACIL.


        for (int [] arrBase: arrInt) {
            System.out.println("\n-------");
            for (int num:arrBase){
                System.out.println(num);
            }

        }
    }
}
