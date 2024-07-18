package Exercicios_StreamsAPI.desafios.desafio19;

import java.util.Arrays;
import java.util.List;

public class Desafio19 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer somaMultiplos = numeros.stream()
                .filter(x -> x % 3 == 0 || x % 5 == 0)
                .reduce(0, Integer::sum);

        System.out.println("A soma de todos os múltiplos de 3 e 5 da lista é: " + somaMultiplos);
    }
}
