package Exercicios_Lists.collections.lists.ordenaPessoas;

public class Main {
    public static void main(String[] args) {
        OrdenaPessoas lista = new OrdenaPessoas();

        lista.adicionarPessoa("Pessoa 1", 50, 1.90);
        lista.adicionarPessoa("Pessoa 2", 12, 1.50);
        lista.adicionarPessoa("Pessoa 3", 20, 1.80);
        lista.adicionarPessoa("Pessoa 4", 33, 1.60);
        lista.adicionarPessoa("Pessoa 5", 45, 1.75);
        lista.adicionarPessoa("Pessoa 6", 90, 1.48);

        System.out.println(lista.ordenarPorIdade());
        System.out.println(lista.ordenarPorAltura());
    }
}
