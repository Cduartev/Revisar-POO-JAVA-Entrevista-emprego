package introducao.metodos.test;

import introducao.metodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somar();
        System.out.println("\nEssa e a soma dos seus numeros\n");

        calculadora.subtrair();
        System.out.println("\nEssa e a subtracao dos seus numeros\n");
    }
}
