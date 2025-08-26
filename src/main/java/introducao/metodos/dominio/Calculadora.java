package introducao.metodos.dominio;

public class Calculadora {

    public void somar(){
        System.out.println(10 + 10);
    }

    public void subtrair(){
       System.out.println(20 - 10);
    }

    public void mutiplicar(int num1, int num2){
        if (num2 == 0 && num1 == 0) {
            throw new IllegalArgumentException("Os dois numeros nao podem ser zero");
        }
        System.out.println(num1 * num2);


    }




}
