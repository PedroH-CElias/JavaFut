package entities;

public class Treinador extends Pessoa {

    private Integer anosExperiencia;
    private Integer quantidadeEquipesTreinadas;

    public Treinador() {
    }

    public void setAnosExperiencia(Integer anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }


    public void setQuantidadeEquipesTreinadas(Integer quantidadeEquipesTreinadas) {
        this.quantidadeEquipesTreinadas = quantidadeEquipesTreinadas;
    }

    public void exibirTreinador() {
        super.exbibirPessoa();
        System.out.println("Anos de experiência: " + anosExperiencia);
        System.out.println("Quantidade de equipes treinadas : " + quantidadeEquipesTreinadas);
    }

}
