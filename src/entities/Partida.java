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

    public List<Equipe> getEquipeList() {
        return equipeList;
    }
    public String simularPartida(){
        Equipe equipe1 = equipeList.get(0);
        Equipe equipe2 = equipeList.get(1);

        Integer golsEquipe1 = (int) (Math.random() * 11);
        Integer golsEquipe2 = (int) (Math.random() * 11);

        return equipe1.getNome() + " " + golsEquipe1 + " X " + equipe2.getNome() + " " + golsEquipe2;
    }

    @Override
    public void exibirDetalhes(Object partida) {

    }
}
