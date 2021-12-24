package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        //  Dado o valor de um carro, descubra quantas parcelas pode ser feita
        // Condição parcela >= 1000
        double valorParcela = 0;
        double valorCarro = 40000;
        for (int i = 0; i <= valorCarro; i++) {
            valorParcela = valorCarro / i;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Podemos parcelar por "+i+"x de "+valorParcela);
        }
    }
}
