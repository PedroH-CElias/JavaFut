package services;

import entities.*;
import enums.TipoEscolha;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuService {
    private Campeonato campeonato;
    public void exibirTitulo() {
        System.out.println("***** JAVA FUT *****\n");
    }
    public void exibirMenuOpcoes(Campeonato campeonato) {
        this.campeonato = campeonato;

        Scanner sc = new Scanner(System.in);
        exibirTitulo();
        System.out.println("1 - Cadastrar Jogador.");
        System.out.println("2 - Cadastrar Treinador.");
        System.out.println("3 - Simular Partida.");
        System.out.println("4 - Exibir detalhes jogador.");
        System.out.println("5 - Exibir detalhes treinador.");
        System.out.println("6 - Exibir detalhes equipe.");
        System.out.println("0 - Encerrar.\n");

        System.out.print("Digite o número da opção escolhida: ");
        int opcaoEscolhida = sc.nextInt();
        
        switch (opcaoEscolhida) {
            case 1:
                String equipe1 = escolherNome(TipoEscolha.EQUIPE);

                for (Equipe equipe : campeonato.getEquipes()) {
                    if (equipe.getNome().equals(equipe1)) {
                        cadastrarJogador(equipe);
                        break;
                    }
                }

                System.out.println("\nEquipe não cadastrada!");
                exibirOpcaoVoltarMenu();
                break;

            case 2:
                String equipe2 = escolherNome(TipoEscolha.EQUIPE);

                for (Equipe equipe : campeonato.getEquipes()) {
                    if (equipe.getNome().equals(equipe2)) {
                        cadastrarTreinador(equipe);
                        break;
                    }
                }

                System.out.println("\nEquipe não cadastrada!");
                exibirOpcaoVoltarMenu();
                break;

            case 3:
                simularPartida();
                break;
            case 4:
                String nomeJogador = escolherNome(TipoEscolha.JOGADOR);

                List<Jogador> jogadores = new ArrayList<>();

                campeonato.getEquipes().forEach(equipe -> {
                    jogadores.addAll(equipe.getJogadores());
                });

                for (Jogador jogador : jogadores){
                    if (jogador.getNome().equals(nomeJogador)) {
                        exibirDetalhesJogador(jogador);
                        break;
                    }
                }

                System.out.println("\nJogador não cadastrado!");
                exibirOpcaoVoltarMenu();

                break;
            case 5:
                String nomeTreinador = escolherNome(TipoEscolha.TREINADOR);
                List<Treinador> treinadores = new ArrayList<>();
                campeonato.getEquipes().forEach(equipe -> {
                    treinadores.add(equipe.getTreinador());
                });

                for (Treinador treinador : treinadores){
                    if (treinador != null && treinador.getNome().equals(nomeTreinador)) {
                        exibirDetalhesTreinador(treinador);
                        break;
                    }
                }

                System.out.println("\nTreinador não cadastrado!");
                exibirOpcaoVoltarMenu();
                break;
            case 6:
                String equipe3 = escolherNome(TipoEscolha.EQUIPE);

                for (Equipe equipe : campeonato.getEquipes()) {
                    if (equipe.getNome().equals(equipe3)) {
                        exibirDetalhesEquipe(equipe);
                        break;
                    }
                }

                System.out.println("\nEquipe não cadastrada!");
                exibirOpcaoVoltarMenu();
                break;

            case 0:
                System.out.println("JAVA FUT ENCERRADO!");
                break;
            default:
                System.out.println("OPÇÃO INVÁLIDA!");
                System.out.println("JAVA FUT ENCERRADO!");
                break;
        }

        sc.close();
    }
    public void cadastrarJogador(Equipe equipe) {
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

        System.out.print("\n\nJOGADOR CADASTRADO COM SUCESSO!\n");

        exibirOpcaoVoltarMenu();

        sc.close();
    }
    public void cadastrarTreinador(Equipe equipe) {
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

        System.out.print("Anos de experiência: ");
        Integer anosExperiencia = sc.nextInt();
        treinador.setAnosExperiencia(anosExperiencia);

        System.out.print("Quantidade de equipes treinadas: ");
        Integer qtdEquipesTreinadas = sc.nextInt();
        treinador.setQuantidadeEquipesTreinadas(qtdEquipesTreinadas);

        equipe.setTreinador(treinador);

        System.out.print("\n\nTREINADOR CADASTRADO COM SUCESSO!\n");

        exibirOpcaoVoltarMenu();

        sc.close();
    }
    public void simularPartida() {
        Scanner sc = new Scanner(System.in);
        Partida partida = new Partida();
        System.out.print("Digite o nome da primeira equipe: ");
        String primeiraEquipe = sc.nextLine();
        System.out.print("Digite o nome da segunda equipe: ");
        String segundaEquipe = sc.nextLine();

        for (Equipe equipeDoCampeonato : campeonato.getEquipes()) {
            if (equipeDoCampeonato.getNome().equals(primeiraEquipe) || equipeDoCampeonato.getNome().equals(segundaEquipe)) {
                partida.adicionarEquipe(equipeDoCampeonato);
            }
        }

        if (partida.getEquipes().isEmpty() || partida.getEquipes().size() != 2) {
            System.out.println("\nEquipes inválidas!");
        } else {
            partida.simularPartida();

            System.out.println("\nEquipe vencedora: " + partida.getEquipeVencedora());
            System.out.println("Placar: " + partida.getPlacar());
            System.out.println("Quantidade de gols na partida: " + partida.getQuantidadeGols());
        }

        exibirOpcaoVoltarMenu();

        sc.close();
    }
    public void exibirDetalhesJogador(Jogador jogador) {
        jogador.exibirJogador();
        exibirOpcaoVoltarMenu();
    }
    public void exibirDetalhesTreinador(Treinador treinador) {
        treinador.exibirTreinador();
        exibirOpcaoVoltarMenu();
    }
    public void exibirDetalhesEquipe(Equipe equipe) {
        System.out.println("Equipe: " + equipe.getNome());
        String treinador = equipe.getTreinador() == null ? "Não há treinador" : equipe.getTreinador().getNome();
        System.out.println("Treinador: " + treinador);
        System.out.println("Jogadores:");
        equipe.getJogadores().forEach(jogador -> {
            System.out.println(jogador.getNome());
        });

        exibirOpcaoVoltarMenu();

    }

    public String escolherNome(TipoEscolha escolha) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do(a) " + escolha.toString().toLowerCase() + ": ");
        String jogador = sc.nextLine();

        return jogador;
    }

    public void exibirOpcaoVoltarMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nDigite 0 para voltar ao menu ");
        Integer voltar = sc.nextInt();
        if (voltar == 0) {
            limparConsole();
            exibirMenuOpcoes(campeonato);
        } else {
            System.out.println("JAVA FUT ENCERRADO!");

        }
        sc.close();
    }
    public void limparConsole() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }

}
