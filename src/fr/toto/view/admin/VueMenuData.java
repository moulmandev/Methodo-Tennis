package fr.toto.view.admin;

import fr.toto.Main;
import fr.toto.view.AbstractVue;
import fr.toto.view.MainWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;


public class VueMenuData extends AbstractVue implements Observer {

    private final JButton btPlayer = new JButton("Données joueur");
    private final JButton btResults = new JButton("Données résultats");
    private final JButton btMatch = new JButton("Données matchs");

    public VueMenuData(MainWindow mainWindow, Object data) {
        super(mainWindow, data);

        addBackArrow("adminMenu");

        btPlayer.setFocusPainted(false);
        btResults.setFocusPainted(false);
        btMatch.setFocusPainted(false);

        this.setLayout(null);

        btPlayer.setSize(200, 30);
        btPlayer.setLocation((Main.WIDTH / 2) - (btPlayer.getWidth() / 2), (Main.HEIGHT / 2) - (btPlayer.getHeight() / 2) - 70);
        this.add(btPlayer);

        btResults.setSize(200, 30);
        btResults.setLocation((Main.WIDTH / 2) - (btResults.getWidth() / 2), (Main.HEIGHT / 2) - (btResults.getHeight() / 2) - 30);
        this.add(btResults);

        btMatch.setSize(200, 30);
        btMatch.setLocation((Main.WIDTH / 2) - (btMatch.getWidth() / 2), (Main.HEIGHT / 2) - (btMatch.getHeight() / 2) + 10);
        this.add(btMatch);

        btPlayer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("login clicked");
            }
        });

        btResults.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("login clicked");
            }
        });

        btMatch.addActionListener(new ActionListener() {
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
