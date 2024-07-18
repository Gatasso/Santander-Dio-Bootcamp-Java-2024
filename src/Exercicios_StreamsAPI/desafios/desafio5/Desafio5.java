package Exercicios_StreamsAPI.desafios.desafio5;

import java.util.*;

public class Desafio5 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3));

        double media = numeros.stream()
                .filter(x -> x > 5) //filtra os elementos maiores que 5
                .mapToDouble(Integer::doubleValue) //converte os valores para Double
                .average() //calcula a média dos valores em questão
                .orElseThrow(() -> new NoSuchElementException("Não foi possível encontrar a média."));
                //tratamento de erro removendo o OptionalDouble

        System.out.println("A media dos números é " + media);
    }
}
