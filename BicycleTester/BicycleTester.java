public class BicycleTester
{
    public static void main(String[] args)
    {
        Bicycle bike = new Bicycle("blue");// make a new Bicycle object
        bike.setSpeed(10);
        System.out.println("Color: "+bike.getColor());
        System.out.println("Speed: "+bike.getSpeed());
        System.out.println("Miles traveled: " +bike.travel((double)3/60));//3 minutes
        System.out.println("Location: "+bike.getLocation());
        bike.increaseSpeed(5);
        System.out.println("Speed: "+bike.getSpeed());
        System.out.println("Miles traveled: "+bike.travel((double)3/60));//3 minutes
        System.out.println("Location: "+bike.getLocation());

    }
}
class Bicycle
{
    private String color;
    private double location;
    private double speed;
    public Bicycle(String c)
    {
        color = c;
        location = 0.0;
        speed = 0.0;
    }
    public void setSpeed(double newSpeed)
    {
        speed = newSpeed;
    }
    public void increaseSpeed(double deltaSpeed)
    {
        speed += deltaSpeed;
    }
    public double travel(double hours)
    {
        double miles = speed * hours;
        location += miles;
        return miles;
    }
    public void setColor(String c)
    {
        color = c;
    }
    public void setLocation(double l)
    {
        location = l;
    }
    public String getColor()
    {
        return color;
    }
    public double getLocation()
    {
        return location;
    }
    public double getSpeed()
    {
        return speed;
    }
}