package Exercicios_StreamsAPI.desafios.desafio11;

import java.util.Arrays;
import java.util.List;

public class Desafio11 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer somaQuadrados = numeros.stream()
                .map(x -> x * x)
                .reduce(0, Integer::sum);

        System.out.println("A soma dos quadrados é: " + somaQuadrados);
    }
}
