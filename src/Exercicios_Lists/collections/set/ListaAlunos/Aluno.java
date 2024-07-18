package Exercicios_Lists.collections.set.ListaAlunos;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private long matricula;
    private double notaMedia;

    public Aluno(String nome, long matricula, double notaMedia) {
        this.nome = nome;
        this.matricula = matricula;
        this.notaMedia = notaMedia;
    }

    @Override
    public int compareTo(Aluno aluno) {
        return nome.compareToIgnoreCase(aluno.getNome());
    }

    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    @Override
    public String toString() {
        return "{ Aluno:" + nome + " | Matricula(" + matricula +
                ") | Média= " + notaMedia + " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return getMatricula() == aluno.getMatricula();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getMatricula());
    }
}
class AlunoPorNota implements Comparator<Aluno>{

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getNotaMedia(),a2.getNotaMedia());
    }
}
