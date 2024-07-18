package Exercicios_Lists.collections.map.dicionario;

public class Main {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Percuciência", "Característica de quem é percuciente, ou seja, que tem perspicácia.");
        dicionario.adicionarPalavra("Senescência", "Processo natural de envelhecimento.");
        dicionario.adicionarPalavra("Asseidade", "Característica de um ser que existe por si mesmo. Sendo a causa e o princípio de si próprio, não necessita de outros seres para existir");
        dicionario.adicionarPalavra("Diletante", "Quem realiza algo por gosto e não por obrigatoriedade.");
        dicionario.adicionarPalavra("Humílimo", "Grau superlativo absoluto sintético do adjetivo humilde. Que é muito humilde, extremamente humilde.");
        dicionario.adicionarPalavra("Polografia", "Descrição astronômica do céu.");
        dicionario.adicionarPalavra("Heliopatia", "Conjunto de distúrbios, perturbações ou alterações patológicas causadas pela luz dos raios solares.");
        dicionario.adicionarPalavra("Parestesia", "Sensações desagradáveis na pele como dormência, formigamento, coceira, picadas, pressão, frio, queimação, ardência,… devido a perturbações na sensibilidade tátil.");

        dicionario.exibirPalavras();
        dicionario.pesquisarPorPalavra("Polografia");
        dicionario.exibirPalavras();
        dicionario.removerPalavra("Percuciência");
        dicionario.exibirPalavras();
        dicionario.removerPalavra("Senescência");
        dicionario.exibirPalavras();
        dicionario.removerPalavra("Asseidade");
        dicionario.exibirPalavras();
        dicionario.removerPalavra("Diletante");
        dicionario.exibirPalavras();
        dicionario.removerPalavra("Humílimo");
        dicionario.exibirPalavras();
        dicionario.removerPalavra("Polografia");
        dicionario.exibirPalavras();
        dicionario.removerPalavra("Heliopatia");
        dicionario.exibirPalavras();
        dicionario.removerPalavra("Parestesia");
        dicionario.exibirPalavras();
    }
}
