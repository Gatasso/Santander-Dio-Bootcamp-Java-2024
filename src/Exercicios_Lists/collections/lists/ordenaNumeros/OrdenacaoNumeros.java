package Exercicios_Lists.collections.lists.ordenaNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros{
    List<Integer> listaInteiros = new ArrayList<>();

    public OrdenacaoNumeros() {
        this.listaInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaInteiros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> ordemCrescente = new ArrayList<>(listaInteiros);
        if(!listaInteiros.isEmpty()){
            Collections.sort(ordemCrescente);
        } return ordemCrescente;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> ordemDecrescente = new ArrayList<>(listaInteiros);
        if (!listaInteiros.isEmpty()){
            ordemDecrescente.sort(Collections.reverseOrder());
        } return ordemDecrescente;
    }
}
