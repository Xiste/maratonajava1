package maratonajava.objeto.Bintroducaometodos.test;

import maratonajava.objeto.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(50, 0);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros02(20,0));
        System.out.println("----------------");
        calculadora.imprimiDoisNumeros(86,0);
    }
}
