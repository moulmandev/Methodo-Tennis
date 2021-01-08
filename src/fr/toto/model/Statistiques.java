package fr.toto.model;

public class Statistiques {

    private int nbVictoires;
    private int nbDefaites;
    private int nbTournoisGagnes;

    public Statistiques() {
    }

    public int getNbVictoires() {
        return nbVictoires;
    }

    public void setNbVictoires(int nbVictoires) {
        this.nbVictoires = nbVictoires;
    }

    public int getNbDefaites() {
        return nbDefaites;
    }

    public void setNbDefaites(int nbDefaites) {
        this.nbDefaites = nbDefaites;
    }

    public int getNbTournoisGagnes() {
        return nbTournoisGagnes;
    }

    public void setNbTournoisGagnes(int nbTournoisGagnes) {
        this.nbTournoisGagnes = nbTournoisGagnes;
    }
}
