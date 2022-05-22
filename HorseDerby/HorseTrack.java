 

import java.awt.Graphics;
import java.applet.*;
import java.awt.Color;

class track
{
    track()
    {
    }
    public void showTrack(Graphics g)
    {
        g.setColor(Color.green);
        g.fillRect(0,0, 900, 70);
        g.setColor(Color.black);
        g.drawLine(0, 125, 900, 125);
        g.drawLine(0, 175, 900, 175);
        g.drawLine(0, 225, 900, 225);
        g.drawLine(800, 70, 800, 250);
    }
    public void addHorse(int lane, horse h)
    {
        if (lane == 1)
        {
            int x = 0;
            int y = 100;
            h.setPosition(x, y);
        }
        else if (lane == 2)
        {
            int x = 0;
            int y = 150;
            h.setPosition(x, y);
        }
        else if (lane == 3)
        {
            int x = 0;
            int y = 200;
            h.setPosition(x, y);
        }
    }
    public boolean checkFinish(int x)
    {
        if (x >= 800)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}