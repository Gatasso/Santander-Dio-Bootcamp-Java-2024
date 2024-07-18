package Exercicios_Lists.collections.map.livraria;

import java.util.*;

public class LivrariaOnline {
    private Map<String,Livro> livrosDisponiveis;

    public LivrariaOnline() {
        this.livrosDisponiveis = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        livrosDisponiveis.put(link,new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        List<String> chavesRemover = new ArrayList<>();
        for (Map.Entry<String, Livro> entry : livrosDisponiveis.entrySet()) {
            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                chavesRemover.add(entry.getKey());
            }
        }
        for (String chave : chavesRemover) {
            livrosDisponiveis.remove(chave);
        }
    }
    public void pesquisarLivrosPorAutor(String autor){
        List<Livro> livrosDoAutor = new ArrayList<>();
        if (!livrosDisponiveis.isEmpty()){
            for (Map.Entry<String, Livro> entry : livrosDisponiveis.entrySet()) {
                if (entry.getValue().getAutor().equalsIgnoreCase(autor)){
                    livrosDoAutor.add(entry.getValue());
                }
            }
            System.out.println(livrosDoAutor);
        }
    }
    public Livro obterLivroMaisCaro(){
        Livro livroMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if (!livrosDisponiveis.isEmpty()){
            for (Map.Entry<String, Livro> entry : livrosDisponiveis.entrySet()) {
                if (entry.getValue().getPreco() > maiorPreco){
                    livroMaisCaro = entry.getValue();
                    maiorPreco = entry.getValue().getPreco();
                }
            }
        }
        return livroMaisCaro;
    }

    public Livro obterLivroMaisBarato(){
        Livro livroMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        if (!livrosDisponiveis.isEmpty()){
            for (Map.Entry<String, Livro> entry : livrosDisponiveis.entrySet()) {
                if (entry.getValue().getPreco() < menorPreco){
                    livroMaisBarato = entry.getValue();
                    menorPreco = entry.getValue().getPreco();
                }
            }
        }
        return livroMaisBarato;
    }
}
