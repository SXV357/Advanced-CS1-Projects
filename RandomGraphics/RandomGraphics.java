
import java.awt.*;
import java.applet.*;
import java.util.*;


public class Lab06Bst extends Applet
{
public void paint(Graphics g)
{
Random randomGen = new Random();
// Draw Grid
Expo.drawLine(g,250,0,250,650);
Expo.drawLine(g,500,0,500,650);
Expo.drawLine(g,750,0,750,650);
Expo.drawLine(g,0,325,1000,325);

// Draw 10,000 Random Points
for (int count = 1; count <= 10000; count++)
{
Expo.setRandomColor(g);
int x = Expo.random(5,245);
int y = Expo.random(5,320);
Expo.drawPoint(g,x,y);
}


// Draw 1000 Random Lines
for (int count = 1; count <= 1000; count++)
        {
            Expo.setRandomColor(g);
            int x1 = randomGen.nextInt(250) + 250;
            int x2 = randomGen.nextInt(250) + 250;
            int y1 = randomGen.nextInt(320);
            int y2 = randomGen.nextInt(320);
            Expo.drawLine(g,x1,y1,x2,y2);    
        }




// Draw 1000 Random Rectangles
for (int count = 1; count <= 1000; count++)
{
   Expo.setRandomColor(g);
   int x1 = randomGen.nextInt(250) + 500;
            int x2 = randomGen.nextInt(250) + 500;
   int y1 = randomGen.nextInt(320);
   int y2 = randomGen.nextInt(320);
   Expo.fillRectangle(g,x1,y1,x2,y2);
 }






// Draw 500 Random Triangles
for (int count = 1; count <= 500; count++)
        {
            Expo.setRandomColor(g);
            int x1 = randomGen.nextInt(250) + 750;
            int x2 = randomGen.nextInt(250) + 750;
            int x3 = randomGen.nextInt(250) + 750;
            int y1 = randomGen.nextInt(320);
            int y2 = randomGen.nextInt(320);
            int y3 = randomGen.nextInt(320);
            Expo.fillPolygon(g,x1,y1,x2,y2,x3,y3);
        }





// Draw 100 Random Initials
for (int count = 1; count <= 100; count++)
        {
            Expo.setRandomColor(g);
            int x1 = randomGen.nextInt(250) + 25;
            int y1 = randomGen.nextInt(650) + 340;
            Expo.drawString(g, "SV", x1, y1);
        }





// Draw 500 Random Stars with a constant radius of 30 and a random # of points
for (int count = 1; count <= 500; count++)
        {
            Expo.setRandomColor(g);
            int x1 = randomGen.nextInt(225) + 250;
            int y1 = randomGen.nextInt(650) + 350;
            int points = randomGen.nextInt(6) + 5;
            int radius = 30;
            Expo.fillStar(g,x1,y1,radius,points);
        }





// Draw 1000 Random Circles with random radii
for (int count = 1; count <= 1000; count++)
{
    Expo.setRandomColor(g);
    int x1 = randomGen.nextInt(200) + 524;
    int y1 = randomGen.nextInt(620) + 350;
    int radius = randomGen.nextInt(45) + 1;
    Expo.fillCircle(g,x1,y1,radius);
}





// Draw 250 Random Arcs with 2 random radii, random start and random finish
for (int count = 1; count <= 250; count++)
{
    Expo.setRandomColor(g);
    int x1 = randomGen.nextInt(200) + 780;
    int y1 = randomGen.nextInt(620) + 350;
    int hrRadius = randomGen.nextInt(60) + 1;
    int vrRadius = randomGen.nextInt(60) + 1;
    int start = randomGen.nextInt(180) + 1;
    int finish = randomGen.nextInt(90) + 1;
    Expo.fillArc(g,x1,y1,hrRadius,vrRadius,start,finish);
}





}

}




