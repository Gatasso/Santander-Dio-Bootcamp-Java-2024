package Exercicios_Lists.collections.set.ListaAlunos;

public class Main {
    public static void main(String[] args) {
        GerenciadorAlunos alunos = new GerenciadorAlunos();

        alunos.adicionarAluno("Matheus G.",001L,10.0);
        alunos.adicionarAluno("Matheus R.", 002L, 9.5);
        alunos.adicionarAluno("Zé", 002L, 7.5);
        alunos.adicionarAluno("Zé", 003L, 8.8);
        alunos.adicionarAluno("Junior", 004L, 1.1);
        alunos.adicionarAluno("Abigail", 005L, 1.5);

        alunos.exibirAlunos();
        System.out.println("Filtro por Nome:");
        System.out.println(alunos.exibirAlunosPorNome());
        System.out.println("Filtro por Nota");
        System.out.println(alunos.exibirAlunosPorNota());


    }
}
