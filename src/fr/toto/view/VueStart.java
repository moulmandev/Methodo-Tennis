package fr.toto.view;

import fr.toto.controller.Contr_Login;
import fr.toto.controller.Contr_Navigation;
import fr.toto.utils.Draw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;


public class VueStart extends AbstractVue implements Observer {

    private final JButton btLogin = new JButton("Administrateur");
    private final JButton btGuest = new JButton("Visiteur");
    private final JLabel appNameLabel = new JLabel("Nom application");
    private final JLabel newsLabel = new JLabel("Actualités sport");

    public VueStart(MainWindow mainWindow, Object data) {
        super(mainWindow, data);

        btLogin.setFocusPainted(false);
        btGuest.setFocusPainted(false);
        btLogin.setSelected(false);
        btGuest.setSelected(false);

        this.setLayout(null);

        btGuest.setSize(200, 30);
        btGuest.setLocation((1050 / 2) - (btGuest.getWidth() / 2), (272) - (btGuest.getHeight() / 2) - 35);
        this.add(btGuest);

        btLogin.setSize(200, 30);
        btLogin.setLocation((1050 / 2) - (btLogin.getWidth() / 2), (272) - (btLogin.getHeight() / 2) + 5);
        this.add(btLogin);

        appNameLabel.setSize(appNameLabel.getPreferredSize());
        appNameLabel.setLocation((1050 / 2) - (btGuest.getWidth() / 2) + 60, (175 / 2) - (btGuest.getHeight() / 2));
        this.add(appNameLabel);

        newsLabel.setSize(newsLabel.getPreferredSize());
        newsLabel.setLocation((325 / 2) - (btGuest.getWidth() / 2) + 50, (175 / 2) - (btGuest.getHeight() / 2));
        this.add(newsLabel);

        btGuest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> creditentials = new ArrayList<String>();
                creditentials.add("");
                creditentials.add("");
                new Contr_Login(null).control(creditentials);
            }
        });

        btLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> dest = new ArrayList<String>();
                dest.add("loginMenu");
                new Contr_Navigation(null).control(dest);
            }
        });

        this.repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.black);

        Draw.drawRect(g, 25, 300, 50, 400);
        Draw.drawRect(g, 350, 700, 50, 125);
        Draw.drawRect(g, 350, 700, 170, 375);


    }

    @Override
    public void update(Observable o, Object arg) {
        this.repaint();
    }
}
