import java.awt.*;
import java.applet.*;
import java.util.*;

public class FishTank extends Applet
{
    public void paint(Graphics g)
    {
         Background.showBackground(g);
         Fish fish1 = new Fish();
         Fish fish2 = new Fish();
         Fish fish3 = new Fish();
         Fish fish4 = new Fish();
         Fish fish5 = new Fish();
         fish1.showFish(g);
         fish2.showFish(g);
         fish3.showFish(g);
         fish4.showFish(g);
         fish5.showFish(g);
    }
}