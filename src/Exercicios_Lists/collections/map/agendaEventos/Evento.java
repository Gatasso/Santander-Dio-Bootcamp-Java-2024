package Exercicios_Lists.collections.map.agendaEventos;

public class Evento {
    private String nomeEvento, atracao;

    public Evento(String nomeEvento, String atracao) {
        this.nomeEvento = nomeEvento;
        this.atracao = atracao;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public String getAtracao() {
        return atracao;
    }

    @Override
    public String toString() {
        return "Evento " + nomeEvento + '{' +
                "Atracao='" + atracao + '}' +
                " | ";
    }
}
