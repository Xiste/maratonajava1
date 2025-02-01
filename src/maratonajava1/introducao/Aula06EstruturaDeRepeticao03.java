package maratonajava1.introducao;

public class Aula06EstruturaDeRepeticao03 {
    //Imprima os primeiros 25 numeros de um dado valor. Por exemplo, 50
    public static void main(String[] args) {
        int count = 50;
        for (int i = 0; i  <= count; i++) {
            if(i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}
