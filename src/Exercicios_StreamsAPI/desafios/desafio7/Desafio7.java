package Exercicios_StreamsAPI.desafios.desafio7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio7 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int segundoMaior = numeros.stream()
                .distinct()         //remove elementos repetidos
                .sorted(Comparator.reverseOrder())  //ordena por ordem decrescente(revert natural)
                .skip(1)        // pula o primeiro valor (ignora)
                .findFirst()    // acha o primeiro valor após o pulo (segundo maior)
                .orElseThrow();    //tratamento de possivel exceção para permitir a escrita correta

        System.out.println("O segundo maior numero do conjunto é: " + segundoMaior);
    }
}
