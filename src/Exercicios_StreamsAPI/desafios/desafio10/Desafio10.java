package Exercicios_StreamsAPI.desafios.desafio10;

import java.util.Arrays;
import java.util.List;

public class Desafio10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> multiplos = numeros.stream()
                .filter(x -> x % 3 == 0 || x % 5 == 0)
                .toList();

        System.out.println("Os elementos múltiplos de 3 ou 5 são:");
        multiplos.forEach(System.out::println);
    }
}
