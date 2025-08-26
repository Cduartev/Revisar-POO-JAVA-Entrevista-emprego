package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        carro1.nome = "Fiat Uno";
        carro1.modelo = "fiat";
        carro1.ano = 2004;
        carro2.nome ="Camaro";
        carro2.modelo = "Ferrari";
        carro2.ano = 2011;



        System.out.println("\n Carro 1");
        System.out.println(carro1.nome + " " + carro1.modelo + " " + carro1.ano + "\n");

        System.out.println("----------------------------------------------------------");

        System.out.println("\n Carro 2");
        System.out.println(carro2.nome + " " + carro2.modelo + " " + carro2.ano);


    }
}
