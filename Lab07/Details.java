package Lab07;

import java.awt.*;

public class Details {
    public static void drawWindow(Graphics g) {
        g.setColor(Color.white);
        Polygon penta = new Polygon();
        penta.addPoint(450, 125);
        penta.addPoint(500, 75);
        penta.addPoint(575, 75);
        penta.addPoint(575, 175);
        penta.addPoint(450, 175);
        g.fillPolygon(penta);

    }

    public static void drawSky(Graphics g) {
        g.setColor(Color.CYAN);
        g.fillRect(1, 1, 1000, 325);

    }

    public static void drawGround(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(1, 325, 1000, 325);
    }

    public static void drawSun(Graphics g) {
        g.setColor(Color.orange);
        g.fillOval(10, 10, 100, 100);
    }
}
