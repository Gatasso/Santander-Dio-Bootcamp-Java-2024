package Exercicios_Lists.collections.map.contagemPalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavras;

    public ContagemPalavras() {
        this.contagemPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemPalavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        contagemPalavras.remove(palavra);
    }
    public void exibirContagemPalavras(){
        System.out.println(contagemPalavras);
    }
    public int exibirQuantidadePalavras(){
        int quantidadeTotal = 0;
        for (int contagem : contagemPalavras.values()) {
            quantidadeTotal += contagem;
        } return quantidadeTotal;
    }
}
