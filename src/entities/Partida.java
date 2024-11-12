package entities;

import java.util.ArrayList;
import java.util.List;

public class Partida {

    private String equipeVencedora;
    private Integer quantidadeGols;
    private String placar;
    private List<Equipe> equipes = new ArrayList<>();

    public Partida() {
    }

    public void adicionarEquipe(Equipe equipe){
        equipes.add(equipe);
    }

    public String getEquipeVencedora() {
        return equipeVencedora;
    }

    public Integer getQuantidadeGols() {
        return quantidadeGols;
    }

    public String getPlacar() {
        return placar;
    }

    public List<Equipe> getEquipes() {
        return equipes;
    }

    public void simularPartida(){
        Equipe primeraEquipe = equipes.get(0);
        Equipe segundaEquipe = equipes.get(1);

        Integer golsPrimeraEquipe = (int) (Math.random() * 5);
        Integer golsSegundaEquipe = (int) (Math.random() * 5);

        quantidadeGols = golsPrimeraEquipe + golsSegundaEquipe;

        if (golsPrimeraEquipe > golsSegundaEquipe)  {
            equipeVencedora = primeraEquipe.getNome();
        } else if (golsSegundaEquipe > golsPrimeraEquipe) {
            equipeVencedora = segundaEquipe.getNome();
        } else {
            equipeVencedora = "Não há equipe vencedora! Empate!";
        }

        placar = golsPrimeraEquipe + " X " + golsSegundaEquipe;

    }
}
