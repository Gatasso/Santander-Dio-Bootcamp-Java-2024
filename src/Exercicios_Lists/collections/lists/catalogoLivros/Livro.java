package Exercicios_Lists.collections.lists.catalogoLivros;

public class Livro {
    private String titulo, autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                titulo +
                ", autor= " + autor +
                ", anoPublicacao= " + anoPublicacao +
                '}';
    }
}
