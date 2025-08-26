package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Sergio Carvalho Vidal";
        professor.idade = 50;
        professor.sexo = 'M';

        System.out.println("Tudo na mesma linha");
        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);

        System.out.println("----------------------------------------------------------------");

        System.out.println(professor.nome);
        System.out.println(professor.idade);
        System.out.println(professor.sexo);

    }
}
