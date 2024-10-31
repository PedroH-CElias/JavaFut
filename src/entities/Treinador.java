package entities;

import services.EstatisticasService;

public class Treinador extends Pessoa implements EstatisticasService {

    private Integer anosExperiencia;
    private Integer quantidadeEquipesTreinadas;

    public Treinador() {
    }

    public Treinador(String nome, Integer idade, Integer quantidadeTitulos, Double nota, Integer anosExperiencia, Integer quantidadeEquipesTreinadas) {
        super(nome, idade, quantidadeTitulos, nota);
        this.anosExperiencia = anosExperiencia;
        this.quantidadeEquipesTreinadas = quantidadeEquipesTreinadas;
    }

    public Integer getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(Integer anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public Integer getQuantidadeEquipesTreinadas() {
        return quantidadeEquipesTreinadas;
    }

    public void setQuantidadeEquipesTreinadas(Integer quantidadeEquipesTreinadas) {
        this.quantidadeEquipesTreinadas = quantidadeEquipesTreinadas;
    }

    @Override
    public void exibirDetalhes(Object treinador) {

    }
}
