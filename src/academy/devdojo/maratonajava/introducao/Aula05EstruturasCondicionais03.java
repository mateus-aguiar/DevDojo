package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar 500 se salario > 5000
        double salario = 5000;
        String mensagemDoar = "Eu vou doar 500 reais para o DevDojo";
        String mensagemNaoDoar = "Eu não vou pdoer doar 500 reais para o DevDojo";
        // Operador ternario
        // (condição) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
