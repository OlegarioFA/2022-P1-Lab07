package Lab07;

import java.awt.*;
import java.applet.*;

public class Car extends Applet{

    public void paint(Graphics g){
        Body.drawDoor(g);
        Body.drawFront(g);
        Body.drawBack(g);

        Wheels.drawFrontWheel(g);
        Wheels.drawBackWheel(g);

        Details.drawWindow(g);

    }

}

