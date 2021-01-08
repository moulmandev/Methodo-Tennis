package fr.toto.utils;

import java.awt.*;

public class Draw {

    public static void drawRect(Graphics g, int x1, int x2, int y1, int y2) {
        g.drawLine(x1, y1, x2, y1);
        g.drawLine(x2, y1, x2, y2);
        g.drawLine(x1, y2, x2, y2);
        g.drawLine(x1, y1, x1, y2);
    }

}
