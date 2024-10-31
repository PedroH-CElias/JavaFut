package services;

import entities.Campeonato;
import entities.Equipe;
import entities.Jogador;
import entities.Treinador;

import java.io.IOException;
import java.util.Scanner;

public class MenuService {

    public static void exibirTitulo() {
        System.out.println("***** JAVA FUT *****\n");
    }

    public static void exibirMenuOpcoes(Campeonato campeonato) {
        Scanner sc = new Scanner(System.in);
        exibirTitulo();
        System.out.println("1 - Cadastrar Jogador.");
        System.out.println("2 - Cadastrar Treinador.");
        System.out.println("3 - Simular Partida.");
        System.out.println("4 - Exibir detalhes jogador.");
        System.out.println("5 - Exibir detalhes treinador.");
        System.out.println("6 - Exibir detalhes equipe.");
        System.out.println("7 - Exibir detalhes partida.");
        System.out.println("0 - Encerrar.\n");

        System.out.print("Digite o número da opção escolhida: ");
        int opcaoEscolhida = sc.nextInt();
        switch (opcaoEscolhida) {
            case 1:
                if (campeonato.getEquipes().isEmpty()) {
                    System.out.println("Não há equipes cadastradas!");
                }
                else {
                    String equipe = escolherEquipe();
                    for (Equipe e : campeonato.getEquipes()) {
                        if(e.getNome().equals(equipe)){
                            cadastarJogador(e);
                            break;
                        }
                        else {
                            System.out.println("Equipe não cadastrada!");
                        }
                    }
                }
                break;
            case 2:
                if (campeonato.getEquipes().isEmpty()) {
                    System.out.println("Não há equipes cadastradas!");
                }
                else {
                    String equipe = escolherEquipe();
                    for (Equipe e : campeonato.getEquipes()) {
                        if(e.getNome().equals(equipe)){
                            cadastarTreinador(e);
                            break;
                        }
                        else {
                            System.out.println("Equipe não cadastrada!");
                        }
                    }
                }
                break;
            case 3:
                System.out.println("c");
                break;
            case 4:
                System.out.println("d");
                break;
            case 5:
                System.out.println("e");
                break;
            case 6:

                if (campeonato.getEquipes().isEmpty()) {
                    System.out.println("Não há equipes cadastradas!");
                }
                else {
                    String equipe = escolherEquipe();
                    for (Equipe e : campeonato.getEquipes()) {
                        if(e.getNome().equals(equipe)){
                            exibirDetalhesEquipe(e);
                            break;
                        }
                        else {
                            System.out.println("Equipe não cadastrada!");
                        }
                    }
                }

                break;
            case 7:
                System.out.println("g");
                break;
            case 0:
                System.out.println("JAVA FUT ENCERRADO!");
                break;
            default:
                System.out.println("OPÇÃO INVÁLIDA!");
                break;
        }

        sc.close();
    }

    public static void cadastarJogador(Equipe equipe) {
        Scanner sc = new Scanner(System.in);

        limparConsole();

        System.out.println("***** Cadastrar jogador *****");
        Jogador jogador = new Jogador();

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        jogador.setNome(nome);

        System.out.print("Idade: ");
        Integer idade = sc.nextInt();
        jogador.setIdade(idade);

        System.out.print("Quantidade de títulos: ");
        Integer qtdTitulos = sc.nextInt();
        jogador.setQuantidadeTitulos(qtdTitulos);

        System.out.print("Nota: ");
        Double nota = sc.nextDouble();
        jogador.setNota(nota);

        System.out.print("Posição: ");
        sc.nextLine();
        String posicao = sc.nextLine();
        jogador.setPosicao(posicao);

        System.out.print("Número: ");
        Integer numero = sc.nextInt();
        jogador.setNumero(numero);

        System.out.print("Gols marcados: ");
        Integer gols = sc.nextInt();
        jogador.setGolsMarcados(gols);

        equipe.adicionarJogador(jogador);

        System.out.print("\n\nJOGADOR CADASTRADO COM SUCESSO!");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        limparConsole();
        //exibirMenuOpcoes();

        sc.close();
    }

    public static void cadastarTreinador(Equipe equipe) {
        Scanner sc = new Scanner(System.in);

        limparConsole();

        System.out.println("***** Cadastrar treinador *****");
        Treinador treinador = new Treinador();

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        treinador.setNome(nome);

        System.out.print("Idade: ");
        Integer idade = sc.nextInt();
        treinador.setIdade(idade);

        System.out.print("Quantidade de títulos: ");
        Integer qtdTitulos = sc.nextInt();
        treinador.setQuantidadeTitulos(qtdTitulos);

        System.out.print("Nota: ");
        Double nota = sc.nextDouble();
        treinador.setNota(nota);

        System.out.print("Anos de experiência: ");
        Integer anosExperiencia = sc.nextInt();
        treinador.setAnosExperiencia(anosExperiencia);

        System.out.print("Quantidade de equipes treinadas: ");
        Integer qtdEquipesTreinadas = sc.nextInt();
        treinador.setQuantidadeEquipesTreinadas(qtdEquipesTreinadas);



        System.out.print("\n\nTREINADOR CADASTRADO COM SUCESSO!");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        limparConsole();
        //exibirMenuOpcoes();

        sc.close();
    }

    public static void exibirDetalhesEquipe(Equipe equipe){
        System.out.println("Equipe: " + equipe.getNome());
        System.out.println("Treinador: " +  equipe.getTreinador());
        System.out.println("Jogadores:");
        for (Jogador jogador : equipe.getJogadorList()) {
            System.out.println(jogador.getNome());
        }
    }

    public static String escolherEquipe(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome da equipe: ");
        String equipe = sc.nextLine();
        sc.close();

        return equipe;
    }

    public static void limparConsole() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

}
