package Exercicios_StreamsAPI.desafios.desafio1.comparator.livro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Livraria {
    private Set<Livro> livrosCatalogo;

    public Livraria(Set<Livro> livrosCatalogo) {
        this.livrosCatalogo = livrosCatalogo;
    }

    public void adicionarLivroAoCatalogo (Livro livro){
        livrosCatalogo.add(livro);
    }
    public void filtrarPorAutor(String autor){
        livrosCatalogo.stream().filter(livro -> livro.getAutor().equalsIgnoreCase(autor))
                .forEach(System.out::println);
    }
    public void filtrarPorEditora(String editora){
        livrosCatalogo.stream().filter(livro -> livro.getEditora().equalsIgnoreCase(editora))
                .forEach(System.out::println);
    }
    public List<Livro> filtrarPorTitulo(String titulo){
        return livrosCatalogo.stream()
                .filter(livro -> livro.getTitulo().equalsIgnoreCase(titulo))
                .toList();
    }
    public List<Livro> ordenaPorAno(){
        return livrosCatalogo.stream()
                .sorted(Comparator.comparing(Livro::getAnoPublicacao))
                .toList();
    }
    public List<Livro> ordenaPorPreco(){
        return livrosCatalogo.stream()
                .sorted(Comparator.comparing(Livro::getPreco).reversed())
                .toList();
    }
}
