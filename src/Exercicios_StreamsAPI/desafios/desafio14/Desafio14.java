package Exercicios_StreamsAPI.desafios.desafio14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer maiorNumeroPrimo = numeros.stream().filter(Desafio14::isPrime).max(Comparator.naturalOrder())
                .orElseThrow();

        System.out.println("O maior número primo da lista é: " + maiorNumeroPrimo);
    }

    public static boolean isPrime(Integer x){
        if(x <= 1){
            return false;
        } else{
            for (int i = 2; i < Math.sqrt(x); i++) {
                if (x % i == 0){
                    return false;
                }
            } return true;
        }
    }
}
