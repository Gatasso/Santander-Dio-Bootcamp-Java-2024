package Exercicios_Lists.collections.set.palavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavraUnica;

    public ConjuntoPalavrasUnicas() {
        this.palavraUnica = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavraUnica.add(palavra);
    }
    public void removerPalavra(String palavra){
        String palavraRemover = null;
        if (!palavraUnica.isEmpty()){
            for (String p : palavraUnica) {
                if (p.equalsIgnoreCase(palavra)){
                    palavraRemover = p;
                }
            }
        } palavraUnica.remove(palavraRemover);
    }
    public void exibirPalavrasUnicas(){
        for (String p : palavraUnica){
            System.out.println(p);
        }
    }
    public void verificarPalavra(String palavra) {
        String palavraPesquisar = null;
        if (!palavraUnica.isEmpty()) {
            for (String s : palavraUnica) {
                if (s.equalsIgnoreCase(palavra)) {
                    palavraPesquisar = s;
                    break;
                }
            }
        } if (palavraPesquisar != null){
            System.out.printf("A palavra %s existe no conjunto.\n", palavra);
        } else {
            System.out.printf("A palavra %s não     existe no conjunto\n", palavra);
        }
    }
}
