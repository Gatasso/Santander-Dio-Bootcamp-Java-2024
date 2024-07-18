package Exercicios_Lists.collections.set.palavrasUnicas;

public class Main {
    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavras = new ConjuntoPalavrasUnicas();

        conjuntoPalavras.adicionarPalavra("Arturianos");
        conjuntoPalavras.adicionarPalavra("Uva");
        conjuntoPalavras.adicionarPalavra("Pochete");
        conjuntoPalavras.adicionarPalavra("Tcheggers");

        conjuntoPalavras.exibirPalavrasUnicas();
        conjuntoPalavras.verificarPalavra("tcheggers");

        conjuntoPalavras.removerPalavra("Arturianos");
        conjuntoPalavras.verificarPalavra("Arturianos");
        conjuntoPalavras.exibirPalavrasUnicas();
    }
}
