package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num1, float num2) {
        System.out.println(num1 * num2);
    }

    public double dividiDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }

        return num1 / num2;
    }

    public void dividiDoisNumeros02(double num1, double num2) {

        if (num2 == 0) {
            System.out.println("Não é possivel dividir um numero por 0");
            return; // O return para metodos void trabalha como se fosse um break
        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 10;

        System.out.println(num1);
        System.out.println(num2);
    }
}
