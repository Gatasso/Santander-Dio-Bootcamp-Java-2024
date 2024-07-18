package Exercicios_Lists.collections.map.estoque;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    private Map<Long, Produto> estoque;

    public EstoqueProduto() {
        this.estoque = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoque.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println(estoque);
    }

    public double calcularValorTotalEstoque() {
        double valorTotal = 0;
        if (!estoque.isEmpty()) {
            for (Produto p : estoque.values()) {
                valorTotal += (p.getPreco() * p.getQuantidade());
            }
        }
        return valorTotal;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoque.isEmpty()) {
            for (Produto p : estoque.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoque.isEmpty()){
            for (Produto p : estoque.values()) {
                if (p.getPreco() < menorPreco){
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        } return produtoMaisBarato;
    }

    public Produto obterProdutoMaisRecorrente(){
        Produto produtoRecorrente = null;
        double valorProduto = 0;
        double maiorRecorrencia = Double.MIN_VALUE;

        if (!estoque.isEmpty()){
            for (Produto p : estoque.values()) {
                valorProduto = (p.getPreco() * p.getQuantidade());
                if (valorProduto > maiorRecorrencia){
                    produtoRecorrente = p;
                    maiorRecorrencia = valorProduto;
                }
            }
        } return produtoRecorrente;
    }
}
