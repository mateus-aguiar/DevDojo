package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprimeFunc() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salario == null) {
            return;
        }
        for (int i = 0; i < this.salario.length; i++) {
            System.out.println("Salário " + (i+1) + " = " + this.salario[i]);
        }
    }

    public void mediaSal() {
        if (salario == null) {
            return;
        }
        int somaSal = 0;
        for (int i = 0; i < this.salario.length; i++) {
            somaSal += this.salario[i];
        }
        System.out.println("Média dos salários é = " + (somaSal / this.salario.length));
    }
}
