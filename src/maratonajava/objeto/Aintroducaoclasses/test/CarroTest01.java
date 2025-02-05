package maratonajava.objeto.Aintroducaoclasses.test;

import maratonajava.objeto.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "Onix";
        carro01.modelo = "Turbo";
        carro01.ano = 2025;

        carro02.nome = "Toyota";
        carro02.modelo = "Gol Turbo";
        carro02.ano = 2022;

        carro01 = carro02;

        System.out.println("Carro 1");
        System.out.println(carro01.nome);
        System.out.println(carro01.modelo);
        System.out.println(carro01.ano);

        System.out.println("\nCarro 2");
        System.out.println(carro02.nome);
        System.out.println(carro02.modelo);
        System.out.println(carro02.ano);
    }
}
