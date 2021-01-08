package fr.toto.controller;

import fr.toto.Main;
import fr.toto.model.Administrateur;

import java.util.ArrayList;

public class Contr_Login extends AbstractControleur {

    public Contr_Login(Object data) {
        super(data);
    }

    @Override
    public void control(ArrayList<String> arrayList) {
        String login = arrayList.get(0);
        String password = arrayList.get(1);

        //TODO: HTTP Request to verify connexion
        //TODO: C'est ici qu'on check si un utilisateur est admin depuis la réponse de notre api sur le site

        if (login.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
            Main.localUser = new Administrateur("Toto", "Titi");
            Main.mainWindow.setCurrentVue(Main.mainWindow.getMenuFormAdmin());
        } else {
            Main.mainWindow.setCurrentVue(Main.mainWindow.getMenuForm());
        }


    }
}
