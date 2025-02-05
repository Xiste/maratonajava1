package maratonajava.objeto.Aintroducaoclasses.test;

import maratonajava.objeto.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {

        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.idade = 32;
        professor.sexo = 'M';
        System.out.println(professor.nome + " " + professor.sexo + " " + professor.idade);
    }
}
