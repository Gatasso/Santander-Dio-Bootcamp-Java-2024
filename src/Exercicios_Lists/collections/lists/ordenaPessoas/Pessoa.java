package Exercicios_Lists.collections.lists.ordenaPessoas;

import java.util.Comparator;

public class Pessoa implements Comparable <Pessoa>{
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return Integer.compare(this.idade, pessoa.getIdade());
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return  "Nome= " + nome +
                ", idade= " + idade +
                ", altura= " + altura +
                " | ";
    }
}

class ComparatorPorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa pessoa1, Pessoa pessoa2) {
        return Double.compare(pessoa1.getAltura(), pessoa2.getAltura());
    }
}