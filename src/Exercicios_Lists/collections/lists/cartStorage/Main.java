package Exercicios_Lists.collections.lists.cartStorage;

public class Main {
    public static void main(String[] args) {
        CarrinhoCompras meuCarrinho = new CarrinhoCompras();

        meuCarrinho.adicionarItem("Ovos",30, 2);
        meuCarrinho.adicionarItem("Leite",10, 6);
        meuCarrinho.adicionarItem("Bala",1.5, 5);
        meuCarrinho.exibirItens();
        System.out.printf("Preço total do carrinho: R$%.2f\n",
                            meuCarrinho.calcularValorTotal());
        meuCarrinho.removerItem("leite");
        meuCarrinho.exibirItens();
        System.out.printf("Preço total do carrinho: R$%.2f",
                meuCarrinho.calcularValorTotal());
    }
}
