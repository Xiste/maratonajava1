package maratonajava1.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 7000;
        double primeiraFaixa = 9.7 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;
        if (salarioAnual <= 34712) {
            salarioAnual *= primeiraFaixa;
        } else if (salarioAnual >= 34712 && salarioAnual <= 68507) {
            salarioAnual *= segundaFaixa;
        } else {
            salarioAnual *= terceiraFaixa;
        }
        System.out.println(salarioAnual);
    }
}
