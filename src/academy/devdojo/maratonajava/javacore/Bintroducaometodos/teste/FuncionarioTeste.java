package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Naruto";
        funcionario.idade = 18;
       // funcionario.salario = new double[] {1000, 2000, 3000};

        funcionario.imprimeFunc();
        funcionario.mediaSal();
    }
}
