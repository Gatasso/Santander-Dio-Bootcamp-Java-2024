package Exercicios_StreamsAPI.desafios.desafio10;

import java.util.Arrays;
import java.util.List;

public class Desafio10b {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> multiplos3 = numeros.stream().filter(x -> x % 3 == 0).toList();
        List<Integer> multiplos5 = numeros.stream().filter(x -> x % 5 == 0).toList();
        System.out.println("Múltiplos de 3:");
        multiplos3.forEach(System.out::println);
        System.out.println("Múltiplos de 5:");
        multiplos5.forEach(System.out::println);
    }
}
