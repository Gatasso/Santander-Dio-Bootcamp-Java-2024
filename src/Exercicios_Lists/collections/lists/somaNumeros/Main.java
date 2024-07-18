package Exercicios_Lists.collections.lists.somaNumeros;

public class Main {
    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(16);
        somaNumeros.adicionarNumero(35);
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(9);

        somaNumeros.exibirNumeros();
        System.out.println("O maior número da lista é: " +
                            somaNumeros.encontrarMaiorNumero());
        System.out.println("O menor número da lista é: " +
                            somaNumeros.encontrarMenorNumero());
    }
}
