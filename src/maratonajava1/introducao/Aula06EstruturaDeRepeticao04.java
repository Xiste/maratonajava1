package maratonajava1.introducao;

public class Aula06EstruturaDeRepeticao04 {
    //Dado valor de um carro, descubra em quantas ele pode ser parcelado
    //Condição valorParcela >= 1000
    public static void main(String[] args) {
        double valorCarro = 10000;
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
