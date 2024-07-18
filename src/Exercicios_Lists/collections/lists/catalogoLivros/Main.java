package Exercicios_Lists.collections.lists.catalogoLivros;

public class Main {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();
        catalogo.adicionarLivro("Titulo 1", "Autor 1", 2018);
        catalogo.adicionarLivro("Titulo 2", "Autor 1", 2010);
        catalogo.adicionarLivro("Titulo 2", "Autor 2", 2002);
        catalogo.adicionarLivro("Titulo 3", "Autor 3", 2020);

        System.out.println(catalogo.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogo.pesquisarPorAutor("Autor 3"));
        System.out.println(catalogo.pesquisarPorAutor("Autor 1"));
        System.out.println(catalogo.pesquisarPorIntervaloAnos(2010,2020));
        System.out.println(catalogo.pesquisarPorIntervaloAnos(2000,2010));
        System.out.println(catalogo.pesquisarPorTitulo("Titulo 1"));
        System.out.println(catalogo.pesquisarPorTitulo("Titulo 3"));
        System.out.println(catalogo.pesquisarPorTitulo("Titulo 2"));
    }
}
