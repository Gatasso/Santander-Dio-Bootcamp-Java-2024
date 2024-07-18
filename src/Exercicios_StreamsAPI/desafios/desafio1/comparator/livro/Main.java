package Exercicios_StreamsAPI.desafios.desafio1.comparator.livro;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Livraria livraria = new Livraria(new HashSet<>());
        Livro livro1 = new Livro("O livro","Autor 4","Editora 1",2010,61);
        Livro livro2 = new Livro("The book","Autor 3","Editora 2",2000,70);
        Livro livro3 = new Livro("El libro","Autor 4","Editora 1",2018,50);
        Livro livro4 = new Livro("Muito Livro","Autor 1","Editora 3",1980,200);
        Livro livro5 = new Livro("Velho Livro","Autor 1","Editora 1",1940,20);
        Livro livro6 = new Livro("2 + 2","Autor 2","Editora 2",2006,35);

        livraria.adicionarLivroAoCatalogo(livro1);
        livraria.adicionarLivroAoCatalogo(livro2);
        livraria.adicionarLivroAoCatalogo(livro3);
        livraria.adicionarLivroAoCatalogo(livro4);
        livraria.adicionarLivroAoCatalogo(livro5);
        livraria.adicionarLivroAoCatalogo(livro6);

        livraria.filtrarPorAutor("Autor 3");
        System.out.println("--------------------------------");
        livraria.filtrarPorEditora("Editora 2");
        System.out.println("--------------------------------");
        System.out.println(livraria.filtrarPorTitulo("The Book"));
        System.out.println("--------------------------------");
        livraria.ordenaPorAno().forEach(System.out::println);
        System.out.println("--------------------------------");
        livraria.ordenaPorPreco().forEach(System.out::println);
    }
}
