package Exercicios_StreamsAPI.desafios.desafio1.natural;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringOrdering {
    public static void main(String[] args) {
        List <String> palavras = Arrays.asList("andar","colarinho","bonissima","mano","zika","feito", "lembrado");
        palavras.stream().sorted().forEach(System.out::println);
        System.out.println("------------------------------------");
        palavras.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
