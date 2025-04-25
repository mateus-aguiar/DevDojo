package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    //Todo metodo de uma interface e publico e abstrato
    void load();
    int MAX_DATA_SIZE = 10;

    default void checkPermission() {
        System.out.println("Fazendo checagem de permissoes");
    }

    static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
