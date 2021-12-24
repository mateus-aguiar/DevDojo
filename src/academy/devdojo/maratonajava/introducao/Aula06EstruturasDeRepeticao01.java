package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 12;

        // While se verifica a condição e depois se a condição der true executa o loop enquanto a condição é true
        while (count < 10) {
            System.out.println("Dentro do while");
            count++;
        }

        count = 0;
        // Executa primeiro depois verifica, apôs verificar e se condição true continua loop
        do {
            System.out.println("Dentro do Do While");
            count++;
        } while(count < 10);

        // estrutura de loop na qual inicializamos uma variavel primeiro, depois a condição a ser batida para execução
        // Depois alguma coisa que se repete toda vez
        // for (Inicialização ; Condição; Algo que se repete)
        for (int i = 0;i < 10; i++) {
            System.out.println("Dentro do For");
        }
    }
}
