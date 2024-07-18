package Exercicios_Lists.collections.set.conjuntoConvidados;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> setConvidados;

    public ConjuntoConvidados() {
        this.setConvidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        setConvidados.add(new Convidado(nome, codigoConvite));
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoRemover = null;
        if (!setConvidados.isEmpty()){
            for (Convidado convidado : setConvidados) {
                if (convidado.getCodigoConvite() == codigoConvite){
                    convidadoRemover = convidado;
                }
            }
        } setConvidados.remove(convidadoRemover);
    }
    public int contarConvidados(){
        return setConvidados.size();
    }
    public Set<Convidado> exibirConvidados(){
        return setConvidados;
    }
}
