package entities;

import java.util.ArrayList;
import java.util.List;

public class Campeonato {

    private List<Equipe> equipes = new ArrayList<>();
    private List<Partida> partidas = new ArrayList<>();


    public Campeonato() {
    }

    public Campeonato(List<Equipe> equipes) {
        this.equipes = equipes;
    }

    public void adicionarEquipe(Equipe equipe){
        equipes.add(equipe);
    }

    public void adicionarPartida(Partida partida){
        partidas.add(partida);
    }


    public List<Equipe> getEquipes() {
        return equipes;
    }

    public List<Partida> getPartidas() {
        return partidas;
    }

}
