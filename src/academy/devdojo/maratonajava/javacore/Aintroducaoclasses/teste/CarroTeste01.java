package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.modelo = "Hatch";
        carro1.nome = "Uno";
        carro1.ano = 2010;

        carro2.modelo = "Hatch";
        carro2.nome = "Palio";
        carro2.ano = 2011;

        carro1 = carro2;

        System.out.println("Carro: " + carro1.nome + " Modelo: " + carro1.modelo + " Ano: " + carro1.ano);
        System.out.println("\nCarro: " + carro2.nome + " Modelo: " + carro2.modelo + " Ano: " + carro2.ano);
    }
}
