package maratonajava1.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 12;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !

        if (isAutorizadoComprarBebida != false) {
            System.out.println("Autorizado a comprar bebida alcoólica");
        } else {
            System.out.println("Nao Autorizado a comprar bebida alcoólica");
        }

        if (!isAutorizadoComprarBebida) {
            System.out.println("Nao Autorizado a comprar bebida alcoólica");
        }
        boolean c = false;
        if (c = true) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

        System.out.println("Fora do if");
    }
}
