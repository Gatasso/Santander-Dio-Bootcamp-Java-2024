package Exercicios_StreamsAPI.desafios.desafio18;

import java.util.Arrays;
import java.util.List;

public class Desafio18 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> listaNaoRepetidos = numeros.stream().distinct().toList();

        if (listaNaoRepetidos.isEmpty()){
            System.out.println("Os números da lista são iguais");
        } else {
            System.out.println("Os seguintes números se repetem: " + listaNaoRepetidos);
        }

    }
}
