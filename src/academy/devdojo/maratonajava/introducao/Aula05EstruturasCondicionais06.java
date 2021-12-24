package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando switch e dados os valores de 1 a 7, imprima se é dia util ou final de semana
        // Considerando 1 como domingo
        int dia = 2;
        switch (dia) {
            case 1:
                System.out.println("Domingo é final de semana");
                break;
            case 2:
                System.out.println("Segunda é dia util");
                break;
            case 3:
                System.out.println("Terça é dia util");
                break;
            case 4:
                System.out.println("Quarta é dia util");
                break;
            case 5:
                System.out.println("Quinta é dia util");
                break;
            case 6:
                System.out.println("Sexta é dia util");
                break;
            case 7:
                System.out.println("Sabado é final de semana");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
