package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        //  Dado o valor de um carro, descubra quantas parcelas pode ser feita
        // Condição parcela >= 1000
        double valorParcela = 0;
        double valorCarro = 30000;
        for (int i = (int) valorCarro; i >= 1; i--) {
            valorParcela = valorCarro / i;
            if (valorParcela < 1000) {
               continue; // O quando o código chegar no continue, ele ignora tudo que vem depois e vai para proxima execução do loop
            }
            System.out.println("Podemos parcelar por "+i+"x de "+valorParcela);
        }
    }
}
