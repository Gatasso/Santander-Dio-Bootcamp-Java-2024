package Exercicios_Lists.collections.map.agendaContatos;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Matheus", 11000);
        agenda.adicionarContato("Ana", 22000);
        agenda.exibirContatos();
        agenda.adicionarContato("Gá", 33000);
        agenda.adicionarContato("Matheus", 44000);
        agenda.exibirContatos();
        agenda.adicionarContato("Stella", 55000);
        agenda.adicionarContato("Matheus", 66000);
        agenda.exibirContatos();

        System.out.println("O número deste contato é: " + agenda.pesquisarPorNome("Gá"));
        agenda.removerContato("Matheus");
        agenda.exibirContatos();
        agenda.removerContato("Stella");
        agenda.exibirContatos();
        agenda.removerContato("Ana");
        agenda.exibirContatos();
        agenda.removerContato("Gá");
        agenda.exibirContatos();
    }
}
