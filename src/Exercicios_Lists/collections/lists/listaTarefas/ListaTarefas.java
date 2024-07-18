package Exercicios_Lists.collections.lists.listaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List <Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List <Tarefa> tarefasExclusao = new ArrayList<>();
        for (Tarefa tarefa : listaTarefas) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefasExclusao.add(tarefa);
            }
        } listaTarefas.removeAll(tarefasExclusao);
    }

    public int obterNumeroTotalTarefas(){
        return this.listaTarefas.size();
    }

    public void obterDescricoesTarefas(){
        for (Tarefa tarefa : listaTarefas) {
            System.out.println(tarefa.getDescricao());
        }
    }
}
