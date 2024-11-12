package entities;

import java.util.ArrayList;
import java.util.List;

public class Campeonato {

    private List<Equipe> equipes = new ArrayList<>();

    public Campeonato() {
    }

    public Campeonato(List<Equipe> equipes) {
        this.equipes = equipes;
    }

    public void adicionarEquipe(Equipe equipe){
        equipes.add(equipe);
    }

    public List<Equipe> getEquipes() {
        return equipes;
    }

}
