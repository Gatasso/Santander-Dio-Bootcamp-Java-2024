package Exercicios_StreamsAPI.desafios.desafio1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio1 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //sorted = ordena de forma natural //forEach percorre os elementos da lista
        numeros.stream().sorted().forEach(System.out::println);
        System.out.println("-------------");
        //reverseOrder inverte a ordem natural
        numeros.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
