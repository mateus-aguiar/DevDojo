package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader{
    @Override
    public void load() {
        System.out.println("Carrega dados de um arquivo");
    }
}
