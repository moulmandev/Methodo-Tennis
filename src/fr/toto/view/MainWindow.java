package fr.toto.view;

import fr.toto.Main;
import fr.toto.view.admin.VueMenuAdmin;
import fr.toto.view.admin.VueMenuData;
import fr.toto.view.login.VueLogin;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private VueLogin loginForm = null;
    private VueMenu menuForm = null;
    private VueMenuAdmin menuFormAdmin = null;
    private VueMenuData menuFormData = null;
    private VueStart menuFormStart = null;

    public MainWindow(Object data) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Bonsoir");

        menuFormStart = new VueStart(this, null);
        loginForm = new VueLogin(this, null);
        menuForm = new VueMenu(this, null);
        menuFormAdmin = new VueMenuAdmin(this, null);
        menuFormData = new VueMenuData(this, null);

        this.setContentPane(menuFormStart);

         // Window size
        this.setSize(new Dimension(Main.WIDTH, Main.HEIGHT));
        this.setPreferredSize(new Dimension(Main.WIDTH, Main.HEIGHT));
        this.setResizable(false);
    }

    public VueLogin getLoginForm() {
        return loginForm;
    }

    public VueMenu getMenuForm() {
        return menuForm;
    }

    public VueMenuAdmin getMenuFormAdmin() {
        return menuFormAdmin;
    }

    public VueMenuData getMenuFormData() {
        return menuFormData;
    }

    public VueStart getStartForm() {
        return menuFormStart;
    }

    public void setCurrentVue(AbstractVue vue) {
        if (vue instanceof VueMenu) {
            menuForm = new VueMenu(this, null);
            vue = menuForm;
        } else if (vue instanceof VueMenuAdmin) {
            menuFormAdmin = new VueMenuAdmin(this, null);
            vue = menuFormAdmin;
        } else if (vue instanceof VueMenuData) {
            menuFormData = new VueMenuData(this, null);
            vue = menuFormData;
        }


        this.setContentPane(vue);
        this.pack();
    }
}   
