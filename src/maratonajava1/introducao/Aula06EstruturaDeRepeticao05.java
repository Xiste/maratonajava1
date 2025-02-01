package maratonajava1.introducao;

public class Aula06EstruturaDeRepeticao05 {
    //Dado valor de um carro, descubra em quantas ele pode ser parcelado
    //Condição valorParcela >= 1000
    public static void main(String[] args) {
        double valorCarro = 30000;
        for (int parcela = (int) valorCarro; parcela >= 1; parcela--) {
            double valorParcela = valorCarro / parcela;
            if(valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
