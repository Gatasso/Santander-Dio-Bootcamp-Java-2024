package Exercicios_Lists.collections.lists.somaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaInteiros;

    public SomaNumeros() {
        this.listaInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaInteiros.add(numero);
    }
    public int calcularSoma(){
        int somatoria = 0;
        for (Integer numero : listaInteiros) {
            somatoria += numero;
        } return somatoria;
    }
    public void exibirNumeros(){
        for (Integer numero : listaInteiros) {
            System.out.println(numero);
        }

    }
    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if(!listaInteiros.isEmpty()){
            for (Integer numero : listaInteiros) {
                if(numero > maiorNumero){
                    maiorNumero = numero;
                }
            }
        } return maiorNumero;
    }
    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if(!listaInteiros.isEmpty()){
            for (Integer numero : listaInteiros) {
                if(numero < menorNumero){
                    menorNumero = numero;
                }
            }
        } return menorNumero;

    }

}
