package entities;

import services.EstatisticasService;

public class Jogador extends Pessoa implements EstatisticasService {

    private String posicao;
    private Integer numero;
    private Integer golsMarcados;

    public Jogador() {
    }

    public Jogador(String nome, Integer idade, Integer quantidadeTitulos, Double nota, String posicao, Integer numero, Integer golsMarcados) {
        super(nome, idade, quantidadeTitulos, nota);
        this.posicao = posicao;
        this.numero = numero;
        this.golsMarcados = golsMarcados;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getGolsMarcados() {
        return golsMarcados;
    }

    public void setGolsMarcados(Integer golsMarcados) {
        this.golsMarcados = golsMarcados;
    }

    @Override
    public void exibirDetalhes(Object jogador) {

    }
}
