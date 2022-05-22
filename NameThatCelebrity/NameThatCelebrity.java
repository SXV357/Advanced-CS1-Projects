import java.util.*;
public class NameThatCelebrity
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //1
        System.out.print("Enter a word: ");
        String s = input.nextLine();
        System.out.println(s.length());
        System.out.println();
        //2
        System.out.print("Enter another word: ");
        s = input.nextLine();
        System.out.println(s.substring(1, s.length() - 1));
        System.out.println();
        //3
        System.out.print("Enter another word: ");
        s = input.nextLine();
        System.out.println(s.substring(0, s.length() - 1));
        System.out.println();
        //4
        System.out.print("Enter word 1: ");
        String wordOne = input.nextLine();
        System.out.print("Enter word 2: ");
        String wordTwo = input.nextLine();
        if (wordOne.length() > wordTwo.length())
        {
        System.out.println(wordTwo + wordOne + wordTwo);
        }
        else if (wordTwo.length() > wordOne.length())
        {
        System.out.println(wordOne + wordTwo + wordOne);
        }
        System.out.println();
        //5
        System.out.print("Enter a string: ");
        String evenString = input.nextLine();
        for (int i = 0; i < evenString.length() / 2; i++)
        {
            System.out.println(evenString.charAt(i));
        }
        System.out.println();
        //6
        System.out.print("a : ");
        String a = input.nextLine();
        System.out.print("b: ");
        String b = input.nextLine();
        String subA = a.substring(1, a.length());
        String subB = b.substring(1, b.length());
        System.out.println(subA + subB);
        System.out.println();
        //8
        System.out.print("New value for a : ");
        a = input.nextLine();
        if (a.substring(0, 3).equals("bad"))
        {
        System.out.println("HAS BAD");
        }
        else
        {
        System.out.println("NOT BAD");
        }
        System.out.println();
        //9
        System.out.print("New value for b: ");
        b = input.nextLine();
        System.out.println(b.substring(1, b.length() - 1));
        System.out.println();
        //10
        System.out.println("Another value for b: ");
        b = input.next();
        if (!b.equals("way"))
        {
        System.out.println("No way");
        }
        else
        {
        System.out.println("Yes way");
        }
        System.out.println();
        //11
        System.out.print("Enter some word: ");
        String oddString =  input.nextLine();
        int index = oddString.length() / 2 - 1;
        System.out.println(oddString.substring(index, oddString.length() - 2));
        System.out.println();

        //Guess the celebrity
        String celebrity = "Chris Rock";
        String subCeleb = celebrity.substring(3, 8);
        System.out.println("Easy, medium, or hard ? ");
        int difficulty = input.nextInt();
        if (difficulty == 1)
        {
            subCeleb = celebrity.substring(1, 7);
        }
        else if (difficulty == 2)
        {
            subCeleb = celebrity.substring(3, 8);
        }
        else if (difficulty == 3)
        {
            subCeleb = celebrity.substring(4, 7);
        }
        int guesses = 4;
        int counter1 = 0;
        String guess = " ";
        input.nextLine();
        do{
            if (guesses == 1)
            {
                System.out.println("Heres a hint >>> He got slapped by Will Smith at the Oscars");
                System.out.print("What\'s your guess: ");
                guess = input.nextLine();
            }
            else{
                System.out.println("Here\'s your clue: ");
                System.out.print(subCeleb);
                System.out.println();
                System.out.print("What\'s your guess: ");
                guess = input.nextLine();
            }
            if (guess.equals(celebrity))
            {
                guesses = 0;
            }
            else
            {
                guesses--;
                System.out.println("Incorrect. Try again!");
            }
        }while(guesses != 0);
        if (!guess.equals(celebrity))
        {
            System.out.println("Game over! The celebrity is Chris Rock");
        }
        else
        {
            System.out.println("You\'re right!");
        }
    }
}