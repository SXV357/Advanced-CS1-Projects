import java.util.*;
public class RomanNumerals
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String[] s = {"Hello", "Goodbye", "Computer", "Science", "Um", "Do", "What", "Now"};

        System.out.println();
        //1
        System.out.println(s.length);
        //2
        for (int i = 0; i < s.length; i++)
        {
            System.out.print(s[i].charAt(0) + " ");
        }
        //3
        int counter = 0;
        for (int i = 0; i < s.length; i++)
        {
            for (int j = 0; j < s[i].length(); j++)
            {
                if (s[i].charAt(s[i].length() - 1) == 'e')
                {
                    counter++;
                }
            }
        }
        System.out.println(counter);
        System.out.println();
        //4
        int sum = 0;
        for (int i = 0; i < s.length; i++)
        {
            sum += s[i].length();
        }
        System.out.println(sum);
        System.out.println();
        //5
        String seven = " ";
        int c = 0;
        for (int i = 0; i < s.length; i++)
        {
            if (s[i].length() == 7)
            {
                c++;
            }
        }
        if (c >= 2)
        {
            seven = "Two length 7";
        }
        else if (c < 2)
        {
            seven = "Under 2 length 7";
        }
        System.out.println(seven);
        System.out.println();
        //6
        int co = 0;
        for (int i = 0; i < s.length; i++)
        {
            for (int j = 0; j < s[i].length() - 1; j++)
            {
                if (s[i].charAt(j) == 'e')
                {
                    co++;
                }
            }
        }
        System.out.println(co);
        System.out.println();
        //7
        String o = " ";
        int cot = 0;
        for (int i = 0; i < s.length; i++)
        {
            for (int j = 0; j < s[i].length() - 1; j++)
            {
                if (s[i].charAt(j) == 'o')
                {
                    cot++;
                }
            }
        }
        if (cot >= 1)
        {
            o = "At least one o";
        }
        else if (cot == 0)
        {
            o = "No o\'s";
        }
        System.out.println(o);
        System.out.println();
        //8
        Random random = new Random();
        String[] responses = {"It is certain", "Most likely", "Better not tell you now", "Outlook not so good", "You may rely on it"};
        int newAnswer = random.nextInt(responses.length);
        System.out.println(responses[newAnswer]);

        //Roman Numeral Coversion App
        final int[] NUMBERS = { 1000, 900,500, 400,100, 90,50,40, 10, 9, 5, 4, 1};
        final String[] LETTERS = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        System.out.print("Enter an integer less than 4000 >>> ");
        int userInput = input.nextInt();
        String romNum = " ";
        for (int i = 0; i < NUMBERS.length; i++)
        {
            while (userInput >= NUMBERS[i])
            {
                userInput -= NUMBERS[i];
                romNum += LETTERS[i];
            }
        }
        System.out.println(romNum);
        input.nextLine();
        //Two Way Conversion
        System.out.print("Enter roman numeral >>> ");
        String romanNumeral = input.next();
        int answer, val2;
        char next_char;
        int len = romanNumeral.length();
        char first_char = romanNumeral.charAt(0);
        for (int j = 0; j < LETTERS.length; j++)
        {
            if (first_char == LETTERS[j])
            {
                answer += NUMBERS[j];
                break;
            }
        }
        for (int i = 1; i < len; i++)
        {
            next_char = romanNumeral.charAt(i);
            for (int j = 0; j < LETTERS.length; j++)
            {
                if (next_char.equals(NUMBERS[j]))
                {
                    val2 = NUMBERS[j];
                    if (answer > val2)
                    {
                        answer += val2;
                    }
                    else{
                        answer = val2 - answer;
                    }
                }
            }
        }
        System.out.println("Roman Number: "+romanNumeral);
        System.out.println("Equivalent Number: " + answer);
    }
}