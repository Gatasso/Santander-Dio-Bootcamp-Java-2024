package Exercicios_StreamsAPI.desafios.desafio3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMin {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.println(numeros.stream().max(Comparator.naturalOrder()));
        System.out.println(numeros.stream().min(Comparator.naturalOrder()));
        System.out.println(numeros.stream().max(Comparator.reverseOrder()));
        System.out.println(numeros.stream().min(Comparator.reverseOrder()));
        System.out.println(numeros.stream().filter(i -> i > 5).min(Comparator.naturalOrder()));
        System.out.println(numeros.stream().filter(i -> i < 10).max(Comparator.naturalOrder()));
    }
}
