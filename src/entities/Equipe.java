package entities;

import services.EstatisticasService;

import java.util.ArrayList;
import java.util.List;

public class Equipe implements EstatisticasService {

    private String nome;
    private List<Jogador> jogadorList = new ArrayList<>();
    private Treinador treinador;

    public Equipe() {
    }

    public Equipe(String nome) {
        this.nome = nome;
    }

    public void adicionarJogador(Jogador jogador) {
        jogadorList.add(jogador);
    }

    public void removerJogador(Jogador jogador) {
        jogadorList.remove(jogador);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibirDetalhes(Object equipe) {

    }
}
