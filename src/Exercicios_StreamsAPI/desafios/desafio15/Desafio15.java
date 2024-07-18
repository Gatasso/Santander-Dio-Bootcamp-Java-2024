package Exercicios_StreamsAPI.desafios.desafio15;

import java.util.Arrays;
import java.util.List;

public class Desafio15 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, -3, 4, 5, 6, 7, 8, 9, -10, 5, 4, 3);

        List<Integer> numerosNegativos = numeros.stream().filter(x -> x < 0).sorted().toList();

        if (numerosNegativos.isEmpty()){
            System.out.println("Não há números negativos na lista");
        } else {
            System.out.println("Números negativos na lista: ");
            numerosNegativos.forEach(System.out::println);
        }
    }
}
