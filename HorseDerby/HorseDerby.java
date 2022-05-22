 

import java.awt.Graphics;
import java.applet.*;
import java.awt.Color;

 public class derby extends Applet
 {

    boolean horseA = false;
    boolean horseB = false;
    boolean horseC = false;
    boolean winner = true;

    public void paint(Graphics g)
    {
        horse A = new horse("Bobby", 10);
        horse B = new horse("Harry", 10);
        horse C = new horse("Charlie", 10);
        track track1 = new track();
        track1.showTrack(g);
        track1.addHorse(1, A);
        track1.addHorse(2, B);
        track1.addHorse(3, C);
        A.showHorse(g);
        B.showHorse(g);
        C.showHorse(g);
        while (horseA != winner && horseB != winner && horseC != winner)
        {
            A.run(g);
            B.run(g);
            C.run(g);
            horseA = track1.checkFinish(A.getPosition());
            horseB = track1.checkFinish(B.getPosition());
            horseC = track1.checkFinish(C.getPosition());
            try
            {
                Thread.sleep(100);
            }
            catch (Exception e) {}
            Expo.setFont(g, "Arial", 100, 36);
            if (horseA == true)
            {
               Expo.drawString(g, "Bobby is the winner", 400, 450);
            }
            else if(horseB == true)
            {
                Expo.drawString(g, "Harry is the winner", 400, 450);
            }
            else if (horseC == true)
            {
                Expo.drawString(g, "Charlie is the winner", 400, 450);
            }
        }
    }
 }

 