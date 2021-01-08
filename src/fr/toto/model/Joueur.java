package fr.toto.model;

public class Joueur extends Personne {

    private int id;
    private int poste;
    private int num_maillot;
    private int age;
    private int niveau;

    private Statistiques stats;

    public Joueur(String prenom, String nom) {
        super(prenom, nom);

        stats = new Statistiques();
        //TODO: fill stats
    }

    public Statistiques getStats() {
        return stats;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoste() {
        return poste;
    }

    public void setPoste(int poste) {
        this.poste = poste;
    }

    public int getNum_maillot() {
        return num_maillot;
    }

    public void setNum_maillot(int num_maillot) {
        this.num_maillot = num_maillot;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }
}
