package academy.dev.dojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.dev.dojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroExercicio {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Porsche";
        carro1.modelo = "Carrera GT";
        carro1.ano = 2023;
        System.out.println("Nome:" + carro1.nome + " " + "Modelo:" + carro1.modelo + " " + "Ano:" + carro1.ano);

        System.out.println("-------------------------------------------------------------------------------------");

        carro2.nome = "Dodge";
        carro2.modelo = "Americano";
        carro2.ano = 1971;
        System.out.println("Nome:" + carro2.nome + " " + "Modelo:" + carro2.modelo + " " + "Ano:" + carro2.ano);
    }
}
