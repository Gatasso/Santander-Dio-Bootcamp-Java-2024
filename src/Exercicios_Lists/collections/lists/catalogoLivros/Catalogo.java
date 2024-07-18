package Exercicios_Lists.collections.lists.catalogoLivros;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Livro> catalogo;

    public Catalogo() {
        this.catalogo = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        catalogo.add(new Livro(titulo,autor,anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> pesquisaPorAutor = new ArrayList<>();
        if (!catalogo.isEmpty()) {
            for (Livro livro : catalogo) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    pesquisaPorAutor.add(livro);
                }
            }
        } return pesquisaPorAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> pesquisaPorAno = new ArrayList<>();
        if(!catalogo.isEmpty()){
            for (Livro livro : catalogo) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal){
                    pesquisaPorAno.add(livro);
                }
            }
        } return pesquisaPorAno;
    }
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPesquisa = null;
        if (!catalogo.isEmpty()){
            for (Livro livro : catalogo) {
                if(livro.getTitulo().equalsIgnoreCase(titulo)){
                    livroPesquisa = livro;
                    break;
                }
            }
        } return livroPesquisa;
    }
}
