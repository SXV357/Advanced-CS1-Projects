import java.awt.*;
import java.applet.*;
import java.util.*;


class Fish
{
    private int xPos;
    private int yPos;
    private String color;
    
    Fish()
    {
        Random rand = new Random();
        xPos = rand.nextInt(375) + 250;
        yPos = rand.nextInt(250) + 175;
        int col = rand.nextInt(4) + 1;
        if (col == 1)
        {
            color = "yellow";
        }
        else if (col == 2)
        {
            color = "orange";
        }
        else if (col == 3)
        {
            color = "red";
        }
        else if (col == 4)
        {
            color = "green";
        }
    }
    Fish(int x, int y)
    {
        Random rand = new Random();
        xPos = x;
        yPos = y;
        int col = rand.nextInt(4) + 1;
        if (col == 1)
        {
            color = "yellow";
        }
        else if (col == 2)
        {
            color = "orange";
        }
        else if (col == 3)
        {
            color = "red";
        }
        else if (col == 4)
        {
            color = "green";
        }
    }
    Fish(int x, int y, String c)
    {
        xPos = x;
        yPos = y;
        color = c;
    }
    public void showFish(Graphics g)
    {
        if (color.equals("yellow"))
        {
            Expo.setColor(g, Expo.yellow);
        }
        else if (color.equals("orange"))
        {
            Expo.setColor(g, Expo.orange);
        }
        else if (color.equals("red"))
        {
            Expo.setColor(g, Expo.red);
        }
        else if (color.equals("green"))
        {
            Expo.setColor(g, Expo.green);
        }
        Expo.fillOval(g, xPos, yPos, 25, 14);
        Expo.fillPolygon(g, xPos, yPos, xPos + 25, yPos - 25, xPos + 25, yPos + 25);
    }
    public void setColor(String c)
    {
        color = c;
    }
}