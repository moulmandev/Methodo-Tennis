package fr.toto.model;

import java.util.ArrayList;

public class Match {

    private int date;
    private ArrayList<Joueur> team1 = new ArrayList<>();
    private ArrayList<Joueur> team2 = new ArrayList<>();

    //TODO: storing score
    //private int score

    public Match() {

    }

    public ArrayList<Joueur> getTeam1() {
        return team1;
    }

    public ArrayList<Joueur> getTeam2() {
        return team2;
    }
}
