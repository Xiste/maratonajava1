package maratonajava.introducao.Aula05EstruturasCondicioanais;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando switch e Dados valores de 1 a 7, imprima se é dia util ou final de semana
        // Considerando 1 como domingo
        byte dia = 3;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Dia Util");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}
