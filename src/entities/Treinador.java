package entities;

import services.EstatisticasService;

public class Treinador extends Pessoa {

    private Integer anosExperiencia;
    private Integer quantidadeEquipesTreinadas;

    public Treinador() {
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

}
