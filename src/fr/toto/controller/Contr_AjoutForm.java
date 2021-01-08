package fr.toto.controller;

/**

public class Contr_AjoutForm extends AbstractControleur {

    public Contr_AjoutForm(Promotion promotion) {
        super(promotion);
    }

    @Override
    public void control(ArrayList<String> arrayList) {
        String numero = arrayList.get(0);
        String prenom = arrayList.get(1);
        String nom = arrayList.get(2);
        String bac = arrayList.get(3);
        String dpt = arrayList.get(4);

        if (!numero.matches("[0-9]+")) throw new IllegalArgumentException("Etudiant 'numero' is not valid");
        if (!prenom.matches("[a-zA-Z]+")) throw new IllegalArgumentException("Etudiant 'prenom' is not valid");
        if (!nom.matches("[a-zA-Z]+")) throw new IllegalArgumentException("Etudiant 'nom' is not valid");
        if (bac.equalsIgnoreCase("- - -")) throw new IllegalArgumentException("Etudiant 'bac' is not valid");
        if (dpt.equalsIgnoreCase("- - -")) throw new IllegalArgumentException("Etudiant 'dpt' is not valid");

        Etudiant etu = new Etudiant(numero, prenom.toUpperCase(), nom.toUpperCase(), dpt, bac);

        Etudiant rechercheEtu = promotion.recherche(numero);
        if (rechercheEtu == null) {
            promotion.ajout(etu);
        } else {
            promotion.suppr(rechercheEtu);
            promotion.ajout(etu);
        }
    }
}
 */