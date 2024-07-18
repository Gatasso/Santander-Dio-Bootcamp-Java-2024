package Exercicios_StreamsAPI.desafios.desafio1.comparator.livro;

public class Livro {
    private String titulo, autor, editora;
    private int anoPublicacao;
    private double preco;

    public Livro(String titulo, String autor, String editora, int anoPublicacao, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "{\"" +
                titulo +"\", autor= " + autor +", editora= " + editora +
                ", publicação: " + anoPublicacao + ", R$" + preco +
                '}';
    }
}
