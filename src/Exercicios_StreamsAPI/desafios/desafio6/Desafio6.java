package Exercicios_StreamsAPI.desafios.desafio6;

import java.util.Arrays;
import java.util.List;

public class Desafio6 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println(numeros.stream().anyMatch(x -> x > 10));  //identifica se há algum numero maior que 10
                                                                    // retorna boolean por ser Predicate
    }
}
