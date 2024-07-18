package Exercicios_StreamsAPI.desafios.desafio4;

import java.util.Arrays;
import java.util.List;

public class Desafio4b {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        numeros.forEach(System.out::println);
        System.out.println("-----------------------------");
        List<Integer> novaListanumeros = numeros.stream().filter(x -> x % 2 == 0).toList();
        novaListanumeros.forEach(System.out::println);
        System.out.println("-----------------------------");
        numeros.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
    }
}
