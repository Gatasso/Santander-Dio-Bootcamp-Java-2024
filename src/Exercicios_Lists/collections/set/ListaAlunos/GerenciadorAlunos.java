package Exercicios_Lists.collections.set.ListaAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> setAlunos;

    public GerenciadorAlunos() {
        this.setAlunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        setAlunos.add(new Aluno(nome,matricula,media));
    }
    public void removerAluno(long matricula){
        if (!setAlunos.isEmpty()){
            for (Aluno aluno : setAlunos) {
                if (aluno.getMatricula() == matricula){
                    setAlunos.remove(aluno);
                    break;
                }
            }
        } else {
            System.out.println("Lista de Alunos está vazia. Aluno não encontrado.");
        }
    }

    public Set<Aluno> exibirAlunosPorNome(){
        return new TreeSet<>(setAlunos);
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new AlunoPorNota());
        alunosPorNota.addAll(setAlunos);
        return alunosPorNota;
    }

    public void exibirAlunos(){
        System.out.println(setAlunos);
    }
}
