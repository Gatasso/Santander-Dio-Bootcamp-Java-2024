package Exercicios_Lists.collections.map.agendaContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String,Integer> agendaContatos;

    public AgendaContatos() {
        this.agendaContatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatos.put(nome,telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatos.isEmpty()){
            agendaContatos.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatos);
    }

    public Integer pesquisarPorNome(String nome){
        Integer contato = null;
        if (!agendaContatos.isEmpty()){
             contato = agendaContatos.get(nome);
        } return contato;
    }
}
