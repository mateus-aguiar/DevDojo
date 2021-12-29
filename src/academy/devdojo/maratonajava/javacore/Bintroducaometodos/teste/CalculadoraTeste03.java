package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.dividiDoisNumeros(20, 0 );

        System.out.println(resultado);
        System.out.println(calculadora.dividiDoisNumeros(20, 10));
    }
}
