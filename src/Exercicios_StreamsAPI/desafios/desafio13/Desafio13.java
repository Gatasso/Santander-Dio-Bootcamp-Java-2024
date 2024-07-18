package Exercicios_StreamsAPI.desafios.desafio13;

import java.util.Arrays;
import java.util.List;

public class Desafio13 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosFiltrados = numeros.stream()
                .filter(x -> x > 5 && x < 10)
                .toList();

        System.out.println("Os números dentro do Range selecionado, são:");
        numerosFiltrados.forEach(System.out::println);
    }
}
