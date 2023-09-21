package academy.dev.dojo.maratonajava.javacore.Hheranca.test;

import academy.dev.dojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    //0 - Bloco de inicializacao estatico da super classe é executado quando  a JVM carregar a classe pai
    //1 - Bloco de inicializacao estatico da sub classe é executado quando  a JVM carregar a classe filha
    //2 - Alocado um espaco em memoria pro objeto da classe pai
    //3 - Cada atributo de classe é criado e inicializado com valores defualt ou o que for passadoda classe pai
    //4 - bloco de inicializacao da super classe e executado na ordem em que aparece
    //5 - Contrutor é executado da superclasse
    //6 - Alocado espaco em memoria pro objeto da subclasse
    //7 - Cada atributo de classe é criado e inicializado com valores defualt ou que for passado
    //8 - bloco de inicializacao da subclasse e executado na ordem em que aparece
    //9 - Contrutor é executado da subclasse
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Itachi");
    }
}
