import java.util.*;

public class fullBlackJack
{
    public static void main(String[] args)
    {
       
    Scanner input = new Scanner(System.in);
    int choice = 0;
    System.out.println("Enter 1 to play.");
    choice = input.nextInt();
    while (choice == 1)
    {
        Random random = new Random();
        int cardValue = random.nextInt(10) + 1;
        boolean game = true;
        int userTotal = 0;
        int userChoice;
        int dealerCard;
        int dealerTotal = 0;
        boolean continuePlaying = true;
        if (cardValue == 1)
        {
            System.out.print("You got an Ace. Is it a 1 or an 11? >>> ");
            int ace = input.nextInt();
            if (ace == 1)
            {
                cardValue = 1;
            }
            else
            {
                cardValue = 11;
            }
        }
        System.out.println("Your First card is " + cardValue);
        userTotal += cardValue;
        cardValue = random.nextInt(10) + 1;
        if (cardValue == 1)
        {
            System.out.print("You got an Ace. Is it a 1 or an 11? >>> ");
            int ace = input.nextInt();
            if (ace == 1)
            {
                cardValue = 1;
            }
            else
            {
                cardValue = 11;
            }
        }
        System.out.println("Your Second card is " + cardValue);
        userTotal += cardValue;
        System.out.println("Your total is: " + userTotal);
        while (game)
        {
            System.out.print("Enter 1 to hit, 2 to stay >>> ");
            userChoice = input.nextInt();
            if (userChoice == 2)
            {
                game = false;
            }
            else
            {
                cardValue = random.nextInt(10) + 1;
                if (cardValue == 1)
                {
                    System.out.print("You got an Ace. Is it a 1 or an 11? >>> ");
                    int ace = input.nextInt();
                    if (ace == 1)
                    {
                        cardValue = 1;
                    }
                    else
                    {
                        cardValue = 11;
                    }
                }
                userTotal += cardValue;
                System.out.println("Next Card: " + cardValue);
                System.out.println("Current Total: " + userTotal);
            }
            if (userTotal > 21)
            {
                System.out.println("Bust!");
                System.out.println("You lost, dang.");
                game = false;
                continuePlaying = false;
            }
        }
        if (continuePlaying)
        {
            dealerCard = random.nextInt(10) + 1;
            dealerTotal += dealerCard;
            dealerCard = random.nextInt(10) + 1;
            dealerTotal += dealerCard;
            while (dealerTotal < 14)
            {
                dealerCard = random.nextInt(10) + 1;
                dealerTotal += dealerCard;
            }
            System.out.println("You have >>> " + userTotal);
            System.out.println("Dealer shows " + dealerTotal);
            if (userTotal == dealerTotal)
            {
                System.out.println("It\'s a tie");
            }
            else if (userTotal > 21 && dealerTotal > 21)
            {
                System.out.println("You both lose.");
            }
            else if (userTotal > 21)
            {
                System.out.println("You lose.");
            }
            else if (dealerTotal > 21)
            {
                System.out.println("You Win! Nice!");
            }
            else if (userTotal > dealerTotal)
            {
                System.out.println("You win! Nice!");
            }
            else
            {
                System.out.println("You lose.");
            }
        }
        System.out.println("Enter 1 to play again, or 2 to quit >>> ");
        choice = input.nextInt();
    }
    if (choice != 1)
    {
        System.out.println("Game Over. Come again and play next time.");
    }
}
}  