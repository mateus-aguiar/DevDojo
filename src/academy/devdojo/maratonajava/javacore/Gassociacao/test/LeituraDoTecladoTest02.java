package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Random;
import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("O grande software de previsao do futuro");
        System.out.println("Digite sua pergunta e eu responderei sim ou nao");
        String pergunta = scanner.nextLine();

        int num = random.nextInt(10);
        if (num % 2 == 0) {
            System.out.println("SIM");
        } else {
            System.out.println("NAO");
        }
    }
}
