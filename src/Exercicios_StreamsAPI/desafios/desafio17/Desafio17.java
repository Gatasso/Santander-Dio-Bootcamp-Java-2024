package Exercicios_StreamsAPI.desafios.desafio17;



import Exercicios_StreamsAPI.desafios.desafio14.Desafio14;

import java.util.Arrays;
import java.util.List;

public class Desafio17 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

       List<Integer> numerosPrimos = numeros.stream().filter(Desafio14::isPrime).toList();

        System.out.println("Os números primos da lista são: ");
        numerosPrimos.forEach(System.out::println);
    }
}
