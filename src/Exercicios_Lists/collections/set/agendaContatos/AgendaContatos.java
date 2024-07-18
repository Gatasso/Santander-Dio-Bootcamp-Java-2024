package Exercicios_Lists.collections.set.agendaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> setContatos;

    public AgendaContatos() {
        this.setContatos = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero){
        setContatos.add(new Contato(nome, numero));
    }
    public void exibirContatos(){
        System.out.println(setContatos);
    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        if (!setContatos.isEmpty()){
            for (Contato contato : setContatos) {
                if (contato.getNome().startsWith(nome)){
                    contatosPorNome.add(contato);
                }
            }
        } return contatosPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato contato : setContatos) {
            if (contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumero(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        } return contatoAtualizado;
    }
}
