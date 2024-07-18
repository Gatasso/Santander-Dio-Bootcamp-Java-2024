package Exercicios_StreamsAPI.desafios.desafio9;

import java.util.Arrays;
import java.util.List;


public class Desafio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean isEqual = numeros.stream()
                .distinct()     //elimina os numeros repetidos
                .count() == numeros.size(); //compara com o tamanho da lista original

        if (isEqual){
            System.out.println("Não há números repetidos.");
        } else {
            System.out.println("Há números repetidos na lista.");
        }
    }
}
