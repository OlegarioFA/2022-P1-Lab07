package Lab07;

import java.awt.*;
import java.applet.*;

public class Car extends Applet{

    public void paint(Graphics g){
        Details.drawSky(g);
        Details.drawGround(g);
        Details.drawSun(g);


        Wheels.drawFrontWheel(g);
        Wheels.drawBackWheel(g);

        Body.drawDoor(g);
        Body.drawFront(g);
        Body.drawBack(g);

        Details.drawWindow(g);

    }

}

