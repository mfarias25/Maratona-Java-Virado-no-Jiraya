package academy.dev.dojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 3000;
        String mensagemDoar = "Eu vou doar 1000 pro DevDojo";
        String mensagemNaoDoar = "Nao tenho condicoes";
        //Operador ternario = (condicao) ? verdadeiro :falso;
        String resultado = salario > 5000 ? mensagemDoar :mensagemNaoDoar;
        System.out.println(resultado);








        /*
            if (salario > 5000) {
                resultado = mensagemDoar;
            }else {
                resultado = mensagemNaoDoar;
            }

            System.out.println(resultado);
        */
    }
}
