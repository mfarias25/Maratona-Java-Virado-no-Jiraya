package academy.dev.dojo.maratonajava.introducao;

public class Aula08ArraysMultidimencionais01 {
    public static void main(String[] args) {
        int [][] dias = new int[4][4];

        dias [0][0] = 31;
        dias [0][1] = 28;
        dias [0][2] = 31;
        dias [0][3] = 31;

        dias [1][0] = 31;
        dias [1][1] = 28;
        dias [1][2] = 31;
        dias [1][3] = 31;

        dias [2][0] = 31;
        dias [2][1] = 28;
        dias [2][2] = 31;
        dias [2][3] = 31;

        dias [3][0] = 31;
        dias [3][1] = 28;
        dias [3][2] = 31;
        dias [3][3] = 31;
        for (int [] arrBase: dias) {
            for (int num: arrBase){
                System.out.println(num);
            }

        }

        /*for (int i = 0; i < dias.length; i++) {
        for (int i = 0; i < dias.length; i++) {for (int j = 0; j < dias[i].length; j++) {
        for (int i = 0; i < dias.length; i++) {System.out.println(dias[i][j]);
            }
        }*/
    }
}
