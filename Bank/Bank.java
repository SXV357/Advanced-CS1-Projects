import java.util.Random;
public class Bank
{
    private String name;
    private double balance;
    
    public Bank()
    {
        name = " ";
        balance = 0.0;
    }
    public Bank(String n, double bal)
    {
        name = n;
        balance = bal;
    }
    public void deposit(double amt)
    {
     balance += amt;
    }
    public void withdraw(double amt)
    {
        balance -= amt;
    }
    public String getName()
    {
        return name;
    }
    public double getAmount()
    {
        return balance;
    }
}