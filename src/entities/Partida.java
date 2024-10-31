package entities;

import services.EstatisticasService;

import java.util.ArrayList;
import java.util.List;

public class Partida implements EstatisticasService {

    private Equipe equipeVencedora;
    private Integer quantidadeGols;
    private List<Equipe> equipeList = new ArrayList<>();

    public Partida() {
    }

    public Partida(Equipe equipeVencedora, Integer quantidadeGols) {
        this.equipeVencedora = equipeVencedora;
        this.quantidadeGols = quantidadeGols;
    }

    public void adicionarEquipe(Equipe equipe){
        equipeList.add(equipe);
    }
    public void removerEquipe(Equipe equipe){
        equipeList.remove(equipe);
    }

    public Equipe getEquipeVencedora() {
        return equipeVencedora;
    }

    public void setEquipeVencedora(Equipe equipeVencedora) {
        this.equipeVencedora = equipeVencedora;
    }

    public Integer getQuantidadeGols() {
        return quantidadeGols;
    }

    public void setQuantidadeGols(Integer quantidadeGols) {
        this.quantidadeGols = quantidadeGols;
    }

    @Override
    public void exibirDetalhes(Object partida) {

    }
}
