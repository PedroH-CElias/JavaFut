package entities;

import java.util.ArrayList;
import java.util.List;

public class Equipe {

    private String nome;
    private List<Jogador> jogadores = new ArrayList<>();
    private Treinador treinador;

    public Equipe() {
    }

    public Equipe(String nome) {
        this.nome = nome;
    }

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public void removerJogador(Jogador jogador) {
        jogadores.remove(jogador);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public Treinador getTreinador() {
        return treinador;
    }

    public void setTreinador(Treinador treinador) {
        this.treinador = treinador;
    }

}
