

import java.awt.*;
import java.applet.*;
import java.util.*;

public class duckPond extends Applet
{
    public void paint(Graphics g)
    {
       
        Background.showBackground(g);
        
        
        Duck duck1 = new Duck();
        duck1.showDuck(g);
        
        Duck duck2 = new Duck();
        duck2.showDuck(g);
        
        Duck duck3 = new Duck();
        duck3.showDuck(g);
        
          
    
    }

}

class Background
{
    public static void showBackground(Graphics g)
    {
        drawSky(g);
        drawField(g);
        drawPond(g);
    }
    private static void drawSky(Graphics g)
    {
        Expo.setColor(g, Expo.lightBlue);
        Expo.fillRectangle(g, 0, 0, 1000, 225);
    }
    private static void drawField(Graphics g)
    {
        Expo.setColor(g, Expo.green);
        Expo.fillRectangle(g, 0, 225, 1000, 650);
    }
    private static void drawPond(Graphics g)
    {
        Expo.setColor(g, Expo.blue);
        Expo.fillOval(g, 500, 450, 350, 150);
    }
}

class Duck
{
    private int xPos;
    private int yPos;
    
    Duck()
    {
        Random rand = new Random();
        xPos = rand.nextInt(300) + 350;
        yPos = rand.nextInt(175) + 375;
    }
    
    public void showDuck(Graphics g)
    {
        Expo.setColor(g, Expo.white);
        Expo.fillOval(g, xPos, yPos, 20, 15);
        Expo.fillOval(g, xPos + 50, yPos + 10, 45, 20);
        Expo.setColor(g, Expo.orange);
        Expo.fillOval(g, xPos - 25, yPos, 20, 5);
        Expo.setColor(g, Expo.black);
        Expo.drawPoint(g, xPos - 10, yPos - 10);
    }
}
