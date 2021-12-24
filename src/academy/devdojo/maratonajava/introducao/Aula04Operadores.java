package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 + numero02;
        System.out.println(resultado);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezDiferenteQueVinte = 10 != 20;
        boolean isDezIgualADez = 10 == 10;
        System.out.println("isDezMaiorQueVinte"+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte"+isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte"+isDezIgualQueVinte);
        System.out.println("isDezDiferenteQueVinte"+isDezDiferenteQueVinte);
        System.out.println("isDezIgualADez"+isDezIgualADez);

        // && (AND) || (or) ! (not)
        int idade = 29;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta"+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta"+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCompravel"+isPlaystationCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus %= 2; // 0
        System.out.println(bonus);

        // ++ --
        int contador = 0;
        contador++; // Realiza oque prescisa ser feito com a variavol e depois incrementa
        contador--;
        ++contador; // Realiza primeiro a incrementação depois realiza oque prescisa com a variavel
        --contador;
        int contador2 = 0;
        System.out.println(contador2++); // vai dar 0 pois printa primeiro depois ele incrementa
        System.out.println(++contador2); // vai mostrar 2 pois incrementou o anterior e depois já incrementa esse e mostra
    }
}
