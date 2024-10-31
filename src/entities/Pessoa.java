package entities;

import services.EstatisticasService;

public class Pessoa{

    private String nome;
    private Integer idade;
    private Integer quantidadeTitulos;
    private Double nota;

    public Pessoa() {
    }

    public Pessoa(String nome, Integer idade, Integer quantidadeTitulos, Double  nota) {
        this.nome = nome;
        this.idade = idade;
        this.quantidadeTitulos = quantidadeTitulos;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getQuantidadeTitulos() {
        return quantidadeTitulos;
    }

    public void setQuantidadeTitulos(Integer quantidadeTitulos) {
        this.quantidadeTitulos = quantidadeTitulos;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

}
