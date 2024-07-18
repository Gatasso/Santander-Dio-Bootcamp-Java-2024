package Exercicios_StreamsAPI.desafios.desafio1.comparator.pessoa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ordenador {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Matheus", 22, 2000, true),
                new Pessoa("Nicolau", 18, 1100, true),
                new Pessoa("Dudilda", 12, 0, true),
                new Pessoa("Roger", 52, 4000, false),
                new Pessoa("Adilsu", 60, 7000, false),
                new Pessoa("Ana", 48, 3000, true)
        );
        System.out.println("Ordem alfabética:");
        List<String> pessoasPorNome = pessoas.stream().map(Pessoa::getName).sorted().toList();
        System.out.println(pessoasPorNome);
        System.out.println("-----------------------------");

        System.out.println("Pessoas por idade Crescente:");
        List<Pessoa> pessoasPorIdadeCrescente = pessoas.stream()
                .sorted(Comparator.comparing(Pessoa::getAge))
                .toList();
        pessoasPorIdadeCrescente.forEach(System.out::println);
        System.out.println("-----------------------------");

        System.out.println("Pessoas por idade Decrescente:");
        List<Pessoa> pessoasPorIdadeDecrescente = pessoas.stream()
                .sorted(Comparator.comparing(Pessoa::getAge)
                        .reversed())
                .toList();
        pessoasPorIdadeDecrescente.forEach(System.out::println);
        System.out.println("-----------------------------");

        System.out.println("Pessoas por Salario");
        List<Pessoa> pessoasPorSalarioCrescente = pessoas.stream()
                .sorted(Comparator.comparing(Pessoa::getSalary))
                .toList();
        pessoasPorSalarioCrescente.forEach(System.out::println);
        System.out.println("-----------------------------");

        System.out.println("Pessoas por Salario");
        List<Pessoa> pessoasPorSalarioDecrescente = pessoas.stream()
                .sorted(Comparator.comparing(Pessoa::getSalary)
                        .reversed())
                .toList();
        pessoasPorSalarioDecrescente.forEach(System.out::println);
        System.out.println("-----------------------------");

        System.out.println("Pessoas por não cabelo");
        List<Pessoa> pessoasPorNaoCabelo = pessoas.stream()
                .sorted(Comparator.comparing(Pessoa::isHasHair))
                .toList();
        pessoasPorNaoCabelo.forEach(System.out::println);
        System.out.println("-----------------------------");

        System.out.println("Pessoas por cabelo");
        List<Pessoa> pessoasPorCabelo = pessoas.stream()
                .sorted(Comparator.comparing(Pessoa::isHasHair)
                        .reversed())
                .toList();
        pessoasPorCabelo.forEach(System.out::println);
        System.out.println("-----------------------------");

    }
}
