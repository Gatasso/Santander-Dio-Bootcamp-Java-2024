package Exercicios_Lists.collections.set.listaTarefas;

public class Main {
    public static void main(String[] args) {
        ListaTarefas tarefas = new ListaTarefas();

        tarefas.adicionarTarefa("Limpar Carro");
        tarefas.adicionarTarefa("Abastecer");
        tarefas.adicionarTarefa("Estudar");
        System.out.println(tarefas.contarTarefas());
        tarefas.exibirTarefas();

        tarefas.marcarTarefaConcluida("Limpar Carro");
        tarefas.marcarTarefaConcluida("Abastecer");
        tarefas.marcarTarefaConcluida("Estudar");
        System.out.println(tarefas.contarTarefas());
        tarefas.exibirTarefas();
        System.out.println(tarefas.obterTarefasConcluidas());
        System.out.println(tarefas.obterTarefasPendentes());

        tarefas.marcarTarefaPendente("Limpar Carro");
        tarefas.marcarTarefaPendente("Abastecer");
        tarefas.marcarTarefaPendente("Estudar");
        System.out.println(tarefas.contarTarefas());
        tarefas.exibirTarefas();
        System.out.println(tarefas.obterTarefasConcluidas());
        System.out.println(tarefas.obterTarefasPendentes());

        tarefas.removerTarefa("Limpar Carro");
        System.out.println(tarefas.contarTarefas());
        tarefas.exibirTarefas();
        System.out.println(tarefas.obterTarefasConcluidas());
        System.out.println(tarefas.obterTarefasPendentes());

        tarefas.limparListaTarefas();
        System.out.println(tarefas.contarTarefas());
        tarefas.exibirTarefas();
        System.out.println(tarefas.obterTarefasConcluidas());
        System.out.println(tarefas.obterTarefasPendentes());


    }
}
