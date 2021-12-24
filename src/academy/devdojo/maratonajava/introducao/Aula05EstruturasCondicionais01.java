package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 20;
        // O boolean será verdadeiro se o passado depois do igual for true
        boolean isAutorizadoComprarBebida = idade >= 18;
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado comprar bebida alcólica");
        }

        // ! se não autorizado a comprar bebida, ou seja em vez de colocarmos
        // isAutorizadoComprarBebida == false podemos usar o ! para executar se o isAutorizado for false
        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autozirado a comprar bebida alcólica");
        }


        System.out.println("Foara do if");
    }
}
