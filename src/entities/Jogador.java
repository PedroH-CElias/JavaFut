package entities;

public class Jogador extends Pessoa {

    private String posicao;
    private Integer numero;
    private Integer golsMarcados;

    public Jogador() {
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }


    public void setGolsMarcados(Integer golsMarcados) {
        this.golsMarcados = golsMarcados;
    }

    public void exibirJogador() {
        super.exbibirPessoa();
        System.out.println("Posição: " + posicao);
        System.out.println("Número : " + numero);
        System.out.println("Gols marcados: " + golsMarcados);
    }

}
