package Lab07;

import java.awt.*;

public class Body {
    public static void drawDoor(Graphics g){
        Polygon penta = new Polygon();
        penta.addPoint(400, 150);
        penta.addPoint(500, 50);
        penta.addPoint(600, 50);
        penta.addPoint(600, 350);
        penta.addPoint(400, 350);
        g.drawPolygon(penta);

    }

    public static void drawFront(Graphics g){
        Polygon penta = new Polygon();
        penta.addPoint();

    }

    public static void drawBack(Graphics g){

    }
}
