package Exercicios_Lists.collections.map.estoque;

public class Main {
    public static void main(String[] args) {
        EstoqueProduto estoque = new EstoqueProduto();

        estoque.adicionarProduto(100L, "Sal", 5, 20);
        estoque.adicionarProduto(200L, "Açucar", 5, 10);
        estoque.adicionarProduto(300L, "Cafe", 6, 30);
        estoque.adicionarProduto(400L, "Azeite", 2, 40);
        estoque.adicionarProduto(500L, "Salmão", 1, 100);

        estoque.exibirProdutos();
        System.out.println("Valor total: R$" + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: "+ estoque.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: "+estoque.obterProdutoMaisBarato());
        System.out.println("Produto mais recorente: "+estoque.obterProdutoMaisRecorrente());
    }
}
