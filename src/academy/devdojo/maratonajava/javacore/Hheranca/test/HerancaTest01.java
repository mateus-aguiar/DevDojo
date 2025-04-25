package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 2");
        endereco.setCep("123-123");
        Pessoa pessoa = new Pessoa("Fulano");
        pessoa.setCpf("123456-98");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        System.out.println("----------");

        Funcionario funcionario = new Funcionario("Beltrano", 20000);
        funcionario.setCpf("9876543");
        funcionario.setEndereco(endereco);

        funcionario.imprime();
    }
}
