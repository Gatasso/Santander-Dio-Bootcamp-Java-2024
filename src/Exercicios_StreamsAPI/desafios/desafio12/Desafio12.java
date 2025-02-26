package Exercicios_StreamsAPI.desafios.desafio12;

import java.util.Arrays;
import java.util.List;

public class Desafio12 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer produtos = numeros.stream().reduce((a,b) -> a * b).orElseThrow();
        System.out.println("Produto de todos os números: " + produtos);
    }
}
