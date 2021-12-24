package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        // Temos 03 possibilidades de declaração
        int[] numeros = new int[3];
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = new int[]{5, 4, 3, 2, 1};

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        // Foreach
        // Uma outra opção para se fazer o mesmo que está sendo feiot acima.]
        // O for normal é usado quando queremos usar index especificos etc.
        // basicamente a variavel local num vai passar por cada espaço do array
        for(int num: numeros3) {
            System.out.println(num);
        }
    }
}
