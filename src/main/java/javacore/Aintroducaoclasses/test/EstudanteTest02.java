package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
  public static void main(String[] args){
      Estudante estudante = new Estudante();
      Estudante estudante2 = new Estudante();
      estudante2.idade = 40;
      estudante.nome = "Cayo Duarte Vidal";
      System.out.println(estudante2.idade);
      System.out.println(estudante.nome);
      System.out.println(estudante.sexo);
  }

}
