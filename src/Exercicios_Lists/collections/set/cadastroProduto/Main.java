package Exercicios_Lists.collections.set.cadastroProduto;

public class Main {
    public static void main(String[] args) {
        CadastroProdutos produtos = new CadastroProdutos();

        produtos.adicionarProduto("Mouse", 10L, 200, 10);
        produtos.adicionarProduto("Teclado", 3L, 400, 20);
        produtos.adicionarProduto("Arduino", 7L, 250, 30);

        System.out.println(produtos.exibirProdutosPorNome());
        System.out.println(produtos.exibirProdutosPorPreco());
        produtos.exibirProdutosPorPreco();
    }
}
