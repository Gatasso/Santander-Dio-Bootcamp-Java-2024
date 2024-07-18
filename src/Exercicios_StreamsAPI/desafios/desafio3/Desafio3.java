package Exercicios_StreamsAPI.desafios.desafio3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        System.out.println(numeros.stream().allMatch(integer -> integer <= 0));
        List<Integer> negativos = Arrays.asList(-1, -2, -3, -4, -5, -6, -7, -8, -9, -10, -5, -4, -3);
        System.out.println(negativos.stream().allMatch(integer -> integer >= 0));
        System.out.println();
        System.out.println(numeros.stream().count());
    }
}
