package Exercicios_StreamsAPI.desafios.desafio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Desafio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numerosPares = numeros.stream()
                .filter(i -> i % 2 == 0)
                .toList();
//        int soma = numerosPares.stream().reduce(0,(num1,num2) -> num1 + num2);
        int soma = numerosPares.stream().reduce(0, Integer::sum);
        System.out.println("A soma dos números pares é: " + soma);
    }
}
