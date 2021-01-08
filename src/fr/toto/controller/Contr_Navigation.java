package fr.toto.controller;

import fr.toto.Main;

import java.util.ArrayList;

public class Contr_Navigation extends AbstractControleur {

    public Contr_Navigation(Object data) {
        super(data);
    }

    @Override
    public void control(ArrayList<String> arrayList) {
        String destination = arrayList.get(0);

        switch (destination) {
            case "adminMenuData":
                Main.mainWindow.setCurrentVue(Main.mainWindow.getMenuFormData());
                break;
            case "adminMenu":
                Main.mainWindow.setCurrentVue(Main.mainWindow.getMenuFormAdmin());
                break;
            case "loginMenu":
                Main.mainWindow.setCurrentVue(Main.mainWindow.getLoginForm());
                break;
            case "startMenu":
                Main.mainWindow.setCurrentVue(Main.mainWindow.getStartForm());
                break;
        }


    }
}
