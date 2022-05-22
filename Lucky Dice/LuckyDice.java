import java.util.*;
public class LuckyDice
{
public static void main(String[] args)
{
   Scanner input = new Scanner(System.in);        
   //Problem 1
   System.out.print("Enter a number >>> ");
   int a = input.nextInt();        
   System.out.print("Factors of " + a + " >>> ");
            for (int i = a; i>0; i--)
            {
                if (a%i == 0){
                    System.out.print((a/i)+ " ");
                }
   }      
   //Problem 2
   System.out.println();
   System.out.print("Enter a number >>> ");
   int n = input.nextInt();    
   int cool = 0;
            for(int x = n; x >= 1 ; x--)
            {
               if (x%3 == 1 && x%4 == 1 && x%5 == 1 && x%6 == 1)
               {
                   cool++;
               }
   }       
   System.out.println("There are " + cool + " cool numbers up to " + n);
   //Problem 3      
   System.out.println();
   System.out.print("Enter a number >>> ");
   n = input.nextInt();
   int x = n;
   cool = 0;       
            while(x >= 1 )
            {
                 if (x%3 == 1 && x%4 == 1 && x%5 == 1 && x%6 == 1)
               {
                   cool++;
               }
               x--;
   }
   System.out.println("There are " + cool + " cool numbers up to " + n);        
   //Problem 5       
   System.out.println();
   System.out.print("Enter an integer >>> ");
   int num = input.nextInt();       
   int b = 0;
             for (int i = num; i>1; i--)
            {
                if (num%i == 0){
                   b += num/i;
                }
   }
            if (b == num)
            {
                System.out.println(num+ " is a perfect number");
            }
            else
            {
                System.out.println(num+" is not a perfect number");
   }        
   //Problem 6       
   System.out.println();
   System.out.print("Enter an integer >>> ");
   num = input.nextInt();
   int c = num;
   b = 0;
            do{
                if (num%c == 0){
                    b += num/c;
                }
                c--;
   }while(c >1);       
            if (b == num)
            {
                System.out.println(num+ " is a perfect number");
            }
            else
            {
                System.out.println(num+" is not a perfect number");
   }
           
   //Lucky Dice App       
   System.out.println();
   System.out.print("Number of faces on each die? >>>  ");
   int faces = input.nextInt();        
   System.out.print("Number of simulations? >>> ");
   int simulation = input.nextInt();
   Random randomGen = new Random();
   int rollsTotal = 0;
            for (int i = 1; i <= simulation; i++)
            {
                int simTotal = 0;
                int rolls = 0;
                while(simTotal<1000)
              {
                 int diceA = randomGen.nextInt((faces-1)+1);
                 simTotal += diceA;
                 diceA = randomGen.nextInt((faces-1))+1;
                 simTotal += diceA;
                 rolls++;
              }
              System.out.println("Simulation: "+ i + " - number of rolls to reach 1000 >>> " + rolls);
              rollsTotal += rolls;
   }
   System.out.println();
   int average =(int) Math.ceil(rollsTotal/simulation);
   System.out.println("Average number of rolls, for all simulations >>> " + average);
    
   //Gambler's ruin
   System.out.print("Enter amount of money you're starting with >>> ");
   int initialAmount = input.nextInt();
   System.out.print("Enter your goal (winnings) amount >>> ");
   int winningAmount = input.nextInt();
   System.out.print("Enter your probability of winning (as an integer, e.g. 50 for 50%) >>> ");
   int probability = input.nextInt();
   System.out.print("Enter number of simulations to run >>> ");
   int simulations = input.nextInt();
   int currentSimulation = 1;
   int numberBets = 0;
   int bankReset = initialAmount;
   int numberWins = 0;
   int numberLosses = 0;
   while(currentSimulation <= simulations)
   {
       initialAmount = bankReset;
       while(initialAmount > 1 && initialAmount <= winningAmount)
       {
           int chance = randomGen.nextInt(100) + 1;
           if(chance <= probability)
           {
               initialAmount++;
           }
           else
           {
               initialAmount--;
           }
           numberBets++;
       }
       if(initialAmount >= winningAmount)
       {
           System.out.println("Win! You won in >>> " + numberBets + " bets ");
           numberWins++;
       }
       else
       {
           System.out.println("Lose! You lost in >>> " + numberBets + " bets ");
           numberLosses++;
       }
       numberBets = 0;
       currentSimulation++;
   }
   System.out.println();
   System.out.println("Total number of wins: " + numberWins);
   System.out.println("Total number of losses: " + numberLosses);
}
}
