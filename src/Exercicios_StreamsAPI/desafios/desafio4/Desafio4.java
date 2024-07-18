package Exercicios_StreamsAPI.desafios.desafio4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Desafio4 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3));
        numeros.forEach(System.out::println);
        System.out.println("-----------------------------");
        numeros.removeIf(x -> (x % 2 != 0));
        numeros.forEach(System.out::println);
    }
}
