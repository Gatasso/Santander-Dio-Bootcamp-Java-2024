package Exercicios_Lists.collections.set.cadastroProduto;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> setProdutos;

    public CadastroProdutos() {
        this.setProdutos = new HashSet<>();
    }

    public void adicionarProduto(String nome, long cod, double preco, int quantidade){
        setProdutos.add(new Produto(nome,cod,preco,quantidade));
    }
    public Set<Produto> exibirProdutosPorNome(){
        return new TreeSet<>(setProdutos);
    }
    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco =  new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(setProdutos);
        return produtosPorPreco;
    }
}
