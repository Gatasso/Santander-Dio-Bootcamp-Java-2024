package Exercicios_Lists.collections.set.conjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();
        convidados.adicionarConvidado("Matheus", 1000);
        convidados.adicionarConvidado("Stella", 1001);
        convidados.adicionarConvidado("Matheus", 1002);
        convidados.adicionarConvidado("Duda", 1003);
        convidados.adicionarConvidado("Nicolau", 1004);

        System.out.println(convidados.contarConvidados());
        System.out.println(convidados.exibirConvidados());

        convidados.removerConvidadoPorCodigoConvite(1004);
        System.out.println(convidados.contarConvidados());
        System.out.println(convidados.exibirConvidados());
    }
}
