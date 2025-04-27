package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        // Checked e Unchecked
        // Checked -> Filhas direto da classe Exception, onde nao ocorre nem a compilacao do programa (Obrigatorio tratar)
        // Unchecked -> ocorrem em tempo de execucao, normalmente ocorrem devido a um erro de desenvolvimento
        Object object = null;

        object.toString();
    }
}
