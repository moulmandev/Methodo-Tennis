package fr.toto;

import fr.toto.model.Match;
import fr.toto.model.Personne;
import fr.toto.view.MainWindow;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static MainWindow mainWindow;

    public static Personne localUser = null;

    public static ArrayList<Match> matchs = new ArrayList<>();

    public static int WIDTH = 720;
    public static int HEIGHT = 480;

    public static void main(String[] args) {
        mainWindow = new MainWindow(null);
        mainWindow.setVisible(true);

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
