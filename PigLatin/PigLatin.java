import java.util.*;
public class PigLatin
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        //1
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        String n = str.toUpperCase();
        System.out.println(n.charAt(0) + str.substring(1));
        //2
        System.out.print("Enter a string: ");
        str = input.nextLine();
        String upper = str.toUpperCase();
        String lower = str.toLowerCase();
        System.out.println(lower.substring(0, lower.length() - 2) + upper.substring(upper.length() - 2));
        //3
        System.out.print("Enter a string: ");
        str = input.nextLine();
        int counter = 0;
        for (int i = 0; i < str.length(); i++)
        {
        if (str.charAt(i) == 'e')
        {
        counter++;
        }
        }
        System.out.println("Number of e\'s: " + counter);
        //4
        System.out.print("Enter a string: ");
        str = input.nextLine();
        int co = 0;
        for (int i = 0; i < str.length(); i++)
        {
        if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i')
        {
        co++;
        }
        }
        System.out.println("Number of occurrences of hi: " + co);
        //5
        System.out.print("Enter the string: ");
        str = input.nextLine();
        System.out.print("Enter target: ");
        String target = input.nextLine();
        String foundTarget = " ";
        int lenTarget = target.length();
        for (int i = 0; i < str.length(); i++)
        {
        if (str.indexOf(target) != -1)
        {
        foundTarget = "Found it";
        }
        else
        {
        foundTarget = "Nope";
        }
        }
        System.out.println(foundTarget);
        //6
        System.out.print("Enter the string: ");
        str = input.nextLine();
        System.out.print("Enter integer > 0: ");
        int reps = input.nextInt();
        for (int i = 0; i < reps; i++)
        {
        System.out.print(str.substring(str.length() - 3));
        }
        System.out.println();
        input.nextLine();
        //8
        System.out.print("Enter first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter second name: ");
        String secondName = input.nextLine();
        System.out.print(firstName + " " + secondName.toUpperCase());
        //9
        System.out.print("Enter the string: ");
        str = input.nextLine();
        String withoutAsterisk = str.replace("*", "");
        System.out.println(withoutAsterisk);
        //10
        System.out.print("Enter email: ");
        String email = input.nextLine();
        int locAt = email.indexOf("@");
        System.out.println(email.substring(locAt + 1));

        //Pig Latin App
        System.out.println("Pig Latin App");
        System.out.println("Enter word >>> ");
        String word = input.nextLine();
        boolean game = false;
        int character = 0;
        for (int i = 0; i < word.length(); i++)
        {
            char vowel = word.charAt(i);
            if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u' ||
            vowel == 'A' || vowel == 'E' || vowel == 'I' || vowel == 'O' || vowel == 'U')
            {
                game = true;
                character = i;
                break;
            }
        }
        if (game)
        {
            String partTwo = word.substring(character);
            String partOne = word.substring(0, character);
            System.out.println(partTwo + partOne + "ay");
        }
    }
}