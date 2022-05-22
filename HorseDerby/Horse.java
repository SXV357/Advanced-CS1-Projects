 

import java.awt.Graphics;
import java.applet.*;
import java.awt.Color;
import java.util.*;
class horse
{
    private String horseName;
    private int speed;
    private int xPosition;
    private int yPosition;
    horse()
    {
        Random rand = new Random();
        horseName = "jack";
        speed = rand.nextInt(5) + 5;
    }
    horse(String name, int spd)
    {
        horseName = name;
        speed = spd;
    }
    public void setPosition(int x, int y)
    {
        xPosition = x;
        yPosition = y;
    }
    public void showHorse(Graphics g)
    {
        Expo.setColor(g, Expo.red);
        Expo.fillCircle(g, xPosition, yPosition, 15);
    }
    public String getName()
    {
        return horseName;
    }
    public int getPosition()
    {
        return xPosition;
    }
    public int getLane()
    {
        return yPosition;
    }
    public int runHorse()
    {
        Random rand = new Random();
        int steps = rand.nextInt(speed) + 4;
        return steps;
    }
    public void hideHorse(Graphics g)
    {
        Expo.setColor(g, Expo.white);
        Expo.fillCircle(g, xPosition, yPosition, 15);
    }
    public void run(Graphics g)
    {
        hideHorse(g);
        int position = xPosition;
        int lane = yPosition;
        int step = runHorse();
        position += step;
        setPosition(position, lane);
        showHorse(g);
    }
}