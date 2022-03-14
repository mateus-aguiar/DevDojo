package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private int episodios;
    private String tipo;
    private String genero;
    public String estudio;


    public Anime(String nome, int episodios, String tipo, String genero) {
        this(); // Obrigatório ser o primeira linha executavel do construtor
        this.nome = nome;
        this.episodios = episodios;
        this.tipo = tipo;
        this.genero = genero;
    }

    public Anime(String nome, int episodios, String tipo, String genero, String estudio) {
        this(nome, episodios, tipo, genero); // Obrigatório ser o primeira linha executavel do construtor
        this.estudio = estudio;
    }

    public Anime(){
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
