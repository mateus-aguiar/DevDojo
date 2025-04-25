package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        // Pagar uma taxa baseado em quanto vc ganha por ano
        // 0 a 34,712 paga 9,70%
        // 34,713 a 68,507 paga 37,35%
        // 68,508 pra cima paga 49,50

        double salarioPorAno = 70000;
        double valorTaxa;
        if (salarioPorAno <= 34712) {
            valorTaxa = (salarioPorAno * 9.70) / 100;
        } else if (salarioPorAno > 34712 && salarioPorAno <= 68507) {
            valorTaxa = (salarioPorAno * 37.35) / 100;
        } else {
            valorTaxa = (salarioPorAno * 49.50) / 100;
        }
        System.out.println("Valor da sua taxa será : " + valorTaxa);
    }
}
