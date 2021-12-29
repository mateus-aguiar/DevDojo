package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;


import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante1.nome="Luffy";
        estudante1.idade = 18;
        estudante1.sexo = 'M';

        estudante2.nome="Zoro";
        estudante2.idade = 21;
        estudante2.sexo = 'M';

        impressora.imprime(estudante1);
        // Quando passamos objetos como argumentos naverdade estamos
        // passando a referencia de onde aquele objeto está guardado
        // E quando aquele metodo acaba a referencia do metodo é deletada mais a referencia original
        // ainda existe, Podemos ter varias referencias para o mesmo objeto
        impressora.imprime(estudante2);

    }
}
