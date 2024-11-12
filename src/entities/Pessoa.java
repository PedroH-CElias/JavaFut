package entities;

public class Pessoa{

    private String nome;
    private Integer idade;
    private Integer quantidadeTitulos;

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setQuantidadeTitulos(Integer quantidadeTitulos) {
        this.quantidadeTitulos = quantidadeTitulos;
    }

    protected void exbibirPessoa() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Quantidade de títulos: " + quantidadeTitulos);
    }

}
