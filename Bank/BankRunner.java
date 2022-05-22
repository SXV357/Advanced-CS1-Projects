import java.util.*;
class BankRunner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Bank shreyas = new Bank("Shreyas Viswanathan", 500);
        Bank rithvik = new Bank("Rithvik Pandey", 1000);
        Bank yourMom = new Bank("Your Mom", 250);
        if (shreyas.getAmount() > rithvik.getAmount() && shreyas.getAmount() > yourMom.getAmount())
        {
            System.out.println(shreyas.getName() + " " + shreyas.getAmount());
        }
        else if (rithvik.getAmount() > shreyas.getAmount() && rithvik.getAmount() > yourMom.getAmount())
        {
            System.out.println(rithvik.getName() + " " + rithvik.getAmount());
        }
        else
        {
            System.out.println(yourMom.getName() + " " + yourMom.getAmount());
        }
        System.out.println("Enter an amount: ");
        double amt = input.nextDouble();
        rithvik.withdraw(amt);
        System.out.println(rithvik.getAmount() + " " + rithvik.getName());
        System.out.println("Enter balance: ");
        double balance = input.nextDouble();
        input.nextLine();
        System.out.println("Enter name: ");
        String name = input.nextLine();
        Bank compsci = new Bank(name, balance);
        System.out.println(compsci.getName() + " " + compsci.getAmount());
    }
}