package Exercicios_Lists.collections.set.agendaContatos;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Matheus", 1000);
        agendaContatos.adicionarContato("Matheus", 2000);
        agendaContatos.adicionarContato("Matheus Galasso", 1000);
        agendaContatos.adicionarContato("Matheus Romera", 2000);
        agendaContatos.adicionarContato("Matheus Facul", 3000);
        agendaContatos.adicionarContato("Matheus Trampo", 4000);
        agendaContatos.adicionarContato("Namo Matheus", 5000);

        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("Namo"));
        agendaContatos.atualizarNumeroContato("Matheus", 5000);
        agendaContatos.atualizarNumeroContato("Matheus Trampo", 1000);
        agendaContatos.exibirContatos();

    }
}
