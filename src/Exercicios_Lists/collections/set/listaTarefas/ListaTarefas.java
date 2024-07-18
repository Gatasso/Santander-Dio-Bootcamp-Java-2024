package Exercicios_Lists.collections.set.listaTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> setTarefa;

    public ListaTarefas() {
        this.setTarefa = new HashSet<>();
    }
    public void adicionarTarefa(String descricao){
        setTarefa.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if (!setTarefa.isEmpty()){
            for (Tarefa tarefa : setTarefa) {
                if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaRemover = tarefa;
                    break;
                }
            }  setTarefa.remove(tarefaParaRemover);
        } else {
            System.out.println("O conjunto está vazio");
        }

        if(tarefaParaRemover == null) {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if (!setTarefa.isEmpty()){
            for (Tarefa tarefa : setTarefa) {
                if (tarefa.isDone()){
                    tarefasConcluidas.add(tarefa);
                }
            }
        } return tarefasConcluidas;
    }
    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if (!setTarefa.isEmpty()){
            for (Tarefa tarefa : setTarefa) {
                if (!tarefa.isDone()){
                    tarefasPendentes.add(tarefa);
                }
            }
        } return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa tarefa : setTarefa) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefa.setDone(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for (Tarefa tarefa : setTarefa) {
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefa.setDone(false);
            }
        }
    }

    public int contarTarefas(){
        return setTarefa.size();
    }
    public void exibirTarefas(){
        if (!setTarefa.isEmpty()){
            System.out.println(setTarefa);
        } else {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void limparListaTarefas(){
        setTarefa.clear();
    }
}
