package academy.dev.dojo.maratonajava.introducao;

public class Aula03TiposPrimitivosExercicio {

    public static void main(String[] args) {
        String nome = "Mateus";
        String endereco = "São Paulo";
        double salario = 1000;
        String dataRecebimentoSalario = "08/08/1994" ;

        String relatorio = "Eu " + nome +", morando no endereço " + endereco
                + ", confirmo que recebi o salário de R$" + salario + ", na data " + dataRecebimentoSalario;

        System.out.println(relatorio);

    }
}
