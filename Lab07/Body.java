package Lab07;

import java.awt.*;

public class Body {
    public static void drawDoor(Graphics g){
        g.setColor(Color.red);
        Polygon penta = new Polygon();
        penta.addPoint(400, 150);
        penta.addPoint(500, 50);
        penta.addPoint(600, 50);
        penta.addPoint(600, 350);
        penta.addPoint(400, 350);
        g.fillPolygon(penta);

    }

    public static void drawFront(Graphics g){
        g.setColor(Color.DARK_GRAY);
        Polygon penta = new Polygon();
        penta.addPoint(400,150);
        penta.addPoint(200,175);
        penta.addPoint(150,225);
        penta.addPoint(150,350);
        penta.addPoint(400,350);
        g.fillPolygon(penta);


    }

    public static void drawBack(Graphics g){
        g.setColor(Color.DARK_GRAY);
        Polygon penta = new Polygon();
        penta.addPoint(600,175);
        penta.addPoint(900,175);
        penta.addPoint(900,350);
        penta.addPoint(600,350);
        g.fillPolygon(penta);

    }
}
