package Exercicios_Lists.collections.lists.cartStorage;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> meuCarrinho;

    public CarrinhoCompras() {
        this.meuCarrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome,double preco, int quantidade){
        meuCarrinho.add(new Item(nome,preco,quantidade));
    }
    public void removerItem(String nome){
        List <Item> itensExclusao = new ArrayList<>();
        for (Item item : meuCarrinho) {
            if(item.getNome().equalsIgnoreCase(nome)){
                itensExclusao.add(item);
            }
        } meuCarrinho.removeAll(itensExclusao);

    }
    public double calcularValorTotal(){
        double valorTotal = 0;
        for (Item item : meuCarrinho) {
            valorTotal += item.getPreco() * item.getQuantidade();
        } return valorTotal;
    }
    public void exibirItens(){
        for (Item item : meuCarrinho) {
            System.out.printf ("%s - %d und\n",item.getNome(), item.getQuantidade());
        }

    }
}
