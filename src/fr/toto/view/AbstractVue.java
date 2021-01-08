
package fr.toto.view;

import fr.toto.Main;
import fr.toto.controller.Contr_Navigation;
import fr.toto.model.Administrateur;
import fr.toto.utils.Draw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public abstract class AbstractVue extends JPanel {

    protected MainWindow mainWindow;
    protected Object data;

    protected final JButton backArrow = new JButton("←");
    protected final JLabel connectedAsLabel = new JLabel();
    protected final JButton disconnectBtn = new JButton("Se déconnecter");


    public AbstractVue(MainWindow mainWindow, Object data) {
        this.mainWindow = mainWindow;
        this.data = data;
    }

    public void addBackArrow(String destination) {
        backArrow.setFocusPainted(false);
        backArrow.setSize(50, 20);
        backArrow.setLocation(5, 50);
        backArrow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> dest = new ArrayList<>();
                dest.add(destination);
                new Contr_Navigation(null).control(dest);
            }
        });
        this.add(backArrow);
    }

    public void drawHeader(Graphics g) {
        g.setColor(Color.black);
        Draw.drawRect(g, 2, Main.WIDTH - 8, 2, 38);
    }

    public void connectedAs() {
        String name;
        if (Main.localUser != null)
            name = "Connecté en tant que :" + Main.localUser.getNom() + " " + Main.localUser.getPrenom() + (Main.localUser instanceof Administrateur ? " (Administrateur)" : "");
        else
            name = "Connecté en tant que : Invité";

        connectedAsLabel.setText(name);
        connectedAsLabel.setSize(connectedAsLabel.getPreferredSize());
        connectedAsLabel.setLocation(5, 12);
        this.add(connectedAsLabel);
    }

    public void disconnect() {
        disconnectBtn.setText((Main.localUser == null ? "Quitter" : "Se déconnecter"));

        disconnectBtn.setFocusPainted(false);
        disconnectBtn.setSize(150, 30);
        disconnectBtn.setLocation(Main.WIDTH - 160, 5);

        disconnectBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.localUser = null;
                ArrayList<String> dest = new ArrayList<>();
                dest.add("startMenu");
                new Contr_Navigation(null).control(dest);
            }
        });

        this.add(disconnectBtn);
    }
}
