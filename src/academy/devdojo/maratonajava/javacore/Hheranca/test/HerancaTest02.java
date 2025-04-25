package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    // 0 - Bloco de inicializacao estatico da super classe e executado quando a JVM carregar classe pai
    // 1 - Bloco de inicializacao estatico da subclasse e executado quando a JVM carregar classe filha
    // 2 = Alocado espaco em memoria pro objeto da superclasse
    // 3 - Cada atributo de superclasse e criado e inicializado com valores default ou o que for passado
    // 4 - Bloco de inicializacao da superclasse e executado na ordem em que aparece
    // 5 - Construtor e executado da superclasse
    // 6 - Alocado espaco em memoria pro objeto da subclasse
    // 7 - Cada atributo de subclasse e criado e inicializado com valores default ou o que for passado
    // 8 - Bloco de inicializacao da subclasse e executado na ordem em que aparece
    // 9 - Construtor e executado da subclase
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Fulano", 1000);
    }
}
