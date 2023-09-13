package academy.dev.dojo.maratonajava.javacore.Fmodificadorstatic.test;

import academy.dev.dojo.maratonajava.javacore.Fmodificadorstatic.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("Porche", 250);
        Carro c3 = new Carro("Mercedes", 230);
        //System.out.println(Carro.velocidadeLimite);
        //Carro.velocidadeLimite = 180;
        //System.out.println(Carro.velocidadeLimite);

        Carro.setVelocidadeLimite(150);



    c1.imprime();
    c2.imprime();
    c3.imprime();
    }
}
