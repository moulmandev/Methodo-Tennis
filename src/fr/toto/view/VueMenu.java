package fr.toto.view;

import fr.toto.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;


public class VueMenu extends AbstractVue implements Observer {

    private final JButton btTour = new JButton("Résultats d'un tour");
    private final JButton btMatch = new JButton("Résultats d'un match");
    private final JButton btTournoi = new JButton("Résultats d'un tournoi");
    private final JButton btJoueur = new JButton("Résultats d'un joueur");

    public VueMenu(MainWindow mainWindow, Object data) {
        super(mainWindow, data);

        connectedAs();
        disconnect();

        btTour.setFocusPainted(false);
        btMatch.setFocusPainted(false);
        btTournoi.setFocusPainted(false);
        btJoueur.setFocusPainted(false);

        this.setLayout(null);

        btTour.setSize(200, 30);
        btTour.setLocation((Main.WIDTH / 2) - (btTour.getWidth() / 2), (Main.HEIGHT / 2) - (btTour.getHeight() / 2) - 60);
        this.add(btTour);

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
