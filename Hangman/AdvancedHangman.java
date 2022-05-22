import java.util.Scanner;
public class AdvancedHangman
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        char[] actualWord = {'a', 'p', 'p', 'l', 'e'};
        char[] emptyWord = new char[13];
        char[] missedWords = new char[13];
        char[] guessedWords = new char[13];
        int guesses = 5;
        boolean sameLen; 
        int counterForMisses = 0;
        boolean checkIfCorrect;
        for (int i = 0; i < emptyWord.length; i++)
        {
            emptyWord[i] = '_';
        }

        while (guesses != 0)
        {
            System.out.println();
            int j = 0;
            int x = 0;
            int k = 0;
            int y;
            for (int i = 0; i < actualWord.length; i++)
            {
                System.out.println();
                System.out.print("Enter a letter: ");
                char userInput = input.nextLine().charAt(0);
                if (userInput == actualWord[i])
                {
                    checkIfCorrect = true;
                    if (checkIfCorrect = true)
                    {
                        emptyWord[i] = actualWord[i];
                    }
                    else if (checkIfCorrect = false)
                    {
                        missedWords[j] = userInput;
                        j++;
                        guesses--;
                        counterForMisses++;
                    }
                }
                if (emptyWord.length == actualWord.length)
                {
                    sameLen = true;
                }
                System.out.println("Guesses remaining >>> " + guesses);
                System.out.println("Word: ");
                for (x = 0; x < emptyWord.length; x++)
                {
                    System.out.print(emptyWord[x] + " ");
                }
                System.out.println();
                System.out.print("Letters missed: ");
                for (x = 0; x < missedWords.length; x++)
                {
                    System.out.print(missedWords[x] + " ");
                }
                System.out.println();
                System.out.print("Letters guessed: ");
                for (x = 0; x < guessedWords.length; x++)
                {
                    System.out.print(guessedWords[x] + " ");
                }
                switch (counterForMisses)
                {
                    case 1: firstMiss();
                    break;
                    case 2: secondMiss();
                    break;
                    case 3: thirdMiss();
                    break;
                    case 4: fourthMiss();
                    break;
                    case 5: fifthMiss();
                    break;
                    case 6: sixthMiss();
                    break;
                }
            }
            if (sameLen = true)
            {
                System.out.println("You won. Good job!");
                break;
            }
            if (counterForMisses == 6)
            {
                System.out.println("Game over! Try again");
                break;
            }
        }
    }

    public static void firstMiss()
    {
        System.out.println();
        System.out.println("  +---+");
        System.out.println("  |   |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("=========");
    }

    public static void secondMiss()
    {
        System.out.println();
        System.out.println("  +---+");
        System.out.println("  |   |");
        System.out.println("  0   |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("=========");
    }

    public static void thirdMiss()
    {
        System.out.println();
        System.out.println("  +---+");
        System.out.println("  |   |");
        System.out.println("  0   |");
        System.out.println(" /   |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("=========");
    }

    public static void fourthMiss()
    {
        System.out.println();
        System.out.println("  +---+");
        System.out.println("  |   |");
        System.out.println("  0   |");
        System.out.println(" /|   |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("=========");
    }

    public static void fifthMiss()
    {
        System.out.println();
        System.out.println("  +---+");
        System.out.println("  |   |");
        System.out.println("  0   |");
        System.out.println(" /|\\  |");
        System.out.println("      |");
        System.out.println("      |");
        System.out.println("=========");
    }

    public static void sixthMiss()
    {
        System.out.println();
        System.out.println("  +---+");
        System.out.println("  |   |");
        System.out.println("  0   |");
        System.out.println(" /|\\  |");
        System.out.println(" /    |");
        System.out.println("      |");
        System.out.println("=========");
    }

}