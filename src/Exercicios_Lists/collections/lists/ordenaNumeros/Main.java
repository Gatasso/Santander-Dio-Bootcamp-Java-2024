package Exercicios_Lists.collections.lists.ordenaNumeros;

public class Main {
    public static void main(String[] args) {
        OrdenacaoNumeros lista = new OrdenacaoNumeros();

        lista.adicionarNumero(5);
        lista.adicionarNumero(6);
        lista.adicionarNumero(4);
        lista.adicionarNumero(7);
        lista.adicionarNumero(3);
        lista.adicionarNumero(8);
        lista.adicionarNumero(2);
        lista.adicionarNumero(9);
        lista.adicionarNumero(1);
        lista.adicionarNumero(10);
        lista.adicionarNumero(0);

        System.out.println(lista.ordenarAscendente());
        System.out.println(lista.ordenarDescendente());
    }
}
