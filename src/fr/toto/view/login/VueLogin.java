package fr.toto.view.login;

import fr.toto.Main;
import fr.toto.controller.Contr_Login;
import fr.toto.utils.Draw;
import fr.toto.view.AbstractVue;
import fr.toto.view.MainWindow;
import fr.toto.view.objects.PlaceholderPasswordField;
import fr.toto.view.objects.PlaceholderTextField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;


public class VueLogin extends AbstractVue implements Observer {

    private final PlaceholderTextField login = new PlaceholderTextField();
    private final PlaceholderPasswordField password = new PlaceholderPasswordField();
    private final JButton btLogin = new JButton("Se connecter");
    private final JLabel connexionLabel = new JLabel("Connexion");


    public VueLogin(MainWindow mainWindow, Object data) {
        super(mainWindow, data);

        addBackArrow("startMenu");

        btLogin.setFocusPainted(false);
        this.setLayout(null);


        connexionLabel.setSize(connexionLabel.getPreferredSize());
        connexionLabel.setLocation((Main.WIDTH / 2) - 98, (Main.HEIGHT / 2) - (login.getHeight() / 2) - 70);
        this.add(connexionLabel);

        login.setPlaceholder("Identifiant");
        login.setSize(200, 30);
        login.setLocation((Main.WIDTH / 2) - (login.getWidth() / 2), (Main.HEIGHT / 2) - (login.getHeight() / 2) - 35);
        this.add(login);

        password.setPlaceholder("Mot de passe");
        password.setSize(200, 30);
        password.setLocation((Main.WIDTH / 2) - (password.getWidth() / 2), (Main.HEIGHT / 2) - (password.getHeight() / 2));
        this.add(password);

        btLogin.setSize(200, 30);
        btLogin.setLocation((Main.WIDTH / 2) - (btLogin.getWidth() / 2), (Main.HEIGHT / 2) - (btLogin.getHeight() / 2) + 35);
        this.add(btLogin);

        btLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<String> creditentials = new ArrayList<String>();
                creditentials.add(login.getText());
                creditentials.add(password.getText());
                new Contr_Login(null).control(creditentials);
            }
        });

        this.repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.black);

        Draw.drawRect(g, (Main.WIDTH / 2) - 200, (Main.WIDTH / 2) + 200, (Main.HEIGHT / 2) - 100, (Main.HEIGHT / 2) + 100);
    }

    @Override
    public void update(Observable o, Object arg) {
        this.repaint();
    }
}
