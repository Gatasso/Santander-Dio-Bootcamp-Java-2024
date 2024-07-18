package Exercicios_Lists.collections.map.agendaEventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> agendaEvento;

    public AgendaEventos() {
        this.agendaEvento = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        agendaEvento.put(data,new Evento(nome,atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(agendaEvento);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(agendaEvento);
        if (!agendaEvento.isEmpty()){
            for (Map.Entry<LocalDate,Evento> entry: eventosTreeMap.entrySet()){
                if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                    proximaData = entry.getKey();
                    proximoEvento = entry.getValue();
                    System.out.println("O próximo evento " + proximoEvento + "será em " + proximaData);
                    break;
                }
            }
        }
    }

}
