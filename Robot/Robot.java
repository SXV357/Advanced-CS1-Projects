
import java.awt.*;
import java.applet.*;
import java.util.*;

public class myRobot extends Applet
{
	

	public void paint(Graphics g)
	{


	Robot sam = new Robot();
	Robot pam = new Robot();
	Robot marty = new Robot();
	
	sam.changeColor("green");
	sam.showRobot(g);
	pam.showRobot(g);
	marty.showRobot(g);


	
	Robot ted = new Robot(200, 200);
	ted.changeColor("green");
	
	Robot randy = new Robot(400, 300);
	randy.changeColor("red");
	ted.showRobot(g);
	randy.showRobot(g);
	

	}

}

class Robot
{
	private int xPos;
	private int yPos;
	private String color;
	
	Robot()
	{
	   Random rand = new Random();
	   xPos = rand.nextInt(1000) + 1;
	   yPos = rand.nextInt(650) + 1;
	   int c = rand.nextInt(3) + 1;
	   if (c == 1)
	   {
	       color = "red";
	   }
	   else if(c == 2)
	   {
	       color = "green";
	   }
	   else if (c == 3)
	   {
	       color = "blue";
	   }
	}
	public Robot(int x, int y)
	{
	    Random rand = new Random();
	    xPos = x;
	    yPos = y;
	    int c = rand.nextInt(3) + 1;
	    if (c == 1)
	   {
	       color = "red";
	   }
	   else if(c == 2)
	   {
	       color = "green";
	   }
	   else if (c == 3)
	   {
	       color = "blue";
	   }
	   }
	public Robot(int x, int y, String c)
	{
	    xPos = x;
	    yPos = y;
	    color = c;
	   }
	public void showRobot(Graphics g)
	{
	    Expo.setColor(g, Expo.red);
	    Expo.drawRectangle(g, xPos - 25, yPos - 25, xPos + 25, yPos + 25);
	    Expo.setColor(g, Expo.orange);
	    Expo.drawLine(g, xPos + 25, yPos - 25, xPos + 100, yPos - 100);
	    Expo.drawLine(g, xPos - 25, yPos - 25, xPos - 75, yPos - 100);
	    Expo.setColor(g, Expo.black);
	    Expo.drawLine(g, xPos - 25, yPos + 25, xPos - 25, yPos + 50);
	    Expo.drawLine(g, xPos + 25, yPos + 25, xPos + 25, yPos + 50);
	    if (color.equals("red"))
	    {
	        Expo.setColor(g, Expo.red);
	       }
	    else if (color.equals("green"))
	    {
	        Expo.setColor(g, Expo.green);
	       }
	    else if (color.equals("blue"))
	    {
	        Expo.setColor(g, Expo.blue);
	       }
	    Expo.fillOval(g, xPos, yPos, 10, 10);
	   }
	public void changeColor(String c)
	{
	    color = c;
	   }
}

