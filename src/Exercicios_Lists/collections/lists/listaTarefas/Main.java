package Exercicios_Lists.collections.lists.listaTarefas;

public class Main {
    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();
        lista.adicionarTarefa("Resolver o exercício de carrinho de compras");
        lista.adicionarTarefa("Limpar o carro");
        lista.adicionarTarefa("Preparar o café");
        lista.adicionarTarefa("Exercicio Faculdade");
        lista.adicionarTarefa("Exercicio Faculdade");

        System.out.println("Nuúmero total de tarefas: " + lista.obterNumeroTotalTarefas());
        lista.obterDescricoesTarefas();

        lista.removerTarefa("Exercicio Faculdade");
        System.out.println("Nuúmero total de tarefas: " + lista.obterNumeroTotalTarefas());
        lista.obterDescricoesTarefas();
    }
}
