package fr.toto.view.admin;

import fr.toto.Main;
import fr.toto.controller.Contr_Navigation;
import fr.toto.view.AbstractVue;
import fr.toto.view.MainWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;


public class VueMenuAdmin extends AbstractVue implements Observer {

    private final JButton btList = new JButton("Mettre à jour liste des joueurs");
    private final JButton btCreate = new JButton("Créer un tournoi");
    private final JButton btEnter = new JButton("Saisir des données");

    private final JButton btMatch = new JButton("Résultats d'un match");
    private final JButton btTournoi = new JButton("Résultats d'un tournoi");
    private final JButton btJoueur = new JButton("Résultats d'un joueur");

    public VueMenuAdmin(MainWindow mainWindow, Object data) {
        super(mainWindow, data);

        connectedAs();
        disconnect();

        btList.setFocusPainted(false);
        btCreate.setFocusPainted(false);
        btEnter.setFocusPainted(false);
        btMatch.setFocusPainted(false);
        btTournoi.setFocusPainted(false);
        btJoueur.setFocusPainted(false);

        this.setLayout(null);

        btList.setSize(200, 30);
        btList.setLocation((Main.WIDTH / 2) - (btList.getWidth() / 2) + 250, (Main.HEIGHT / 2) - (btList.getHeight() / 2) - 60);
        this.add(btList);

        btCreate.setSize(200, 30);
        btCreate.setLocation((Main.WIDTH / 2) - (btCreate.getWidth() / 2) + 250, (Main.HEIGHT / 2) - (btCreate.getHeight() / 2) - 20);
        this.add(btCreate);

        btEnter.setSize(200, 30);
        btEnter.setLocation((Main.WIDTH / 2) - (btEnter.getWidth() / 2) + 250, (Main.HEIGHT / 2) - (btEnter.getHeight() / 2) + 20);
        this.add(btEnter);

        btMatch.setSize(200, 30);
        btMatch.setLocation((Main.WIDTH / 2) - (btMatch.getWidth() / 2), (Main.HEIGHT / 2) - (btMatch.getHeight() / 2) - 20);
        this.add(btMatch);

        btTournoi.setSize(200, 30);
        btTournoi.setLocation((Main.WIDTH / 2) - (btTournoi.getWidth() / 2), (Main.HEIGHT / 2) - (btTournoi.getHeight() / 2) + 20);
        this.add(btTournoi);

        btJoueur.setSize(200, 30);
        btJoueur.setLocation((Main.WIDTH / 2) - (btJoueur.getWidth() / 2), (Main.HEIGHT / 2) - (btJoueur.getHeight() / 2) + 60);
        this.add(btJoueur);

        btJoueur.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("login clicked");
            }
        });

        btEnter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> dest = new ArrayList<>();
                dest.add("adminMenuData");
                new Contr_Navigation(null).control(dest);
            }
        });

        this.repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        drawHeader(g);
    }

    @Override
    public void update(Observable o, Object arg) {
        this.repaint();
    }
}
