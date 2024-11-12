package application;

import entities.Campeonato;
import entities.Equipe;
import services.MenuService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Equipe equipe1 = new Equipe("Santos");
        Equipe equipe2 = new Equipe("Vasco");

        List<Equipe> equipesIniciais = Arrays.asList(equipe1, equipe2);
        Campeonato campeonato = new Campeonato(equipesIniciais);

        MenuService menuService = new MenuService(campeonato);
        menuService.exibirMenuOpcoes();

        sc.close();
    }
}