public class WordScramble
{
    public static void main(String[] args)
    {
        System.out.println(isLetterA('a'));
        System.out.println(hasTwoA("Shreyas"));
        System.out.println(isVowel('C'));
        System.out.println(numVowels("Shreyas Viswanathan"));
        System.out.println(evenChars("Shreyas", 'e', 'c'));
        System.out.println(twoInARow("Shreeyas", 'e'));
        System.out.println(capitalizeVowels("shreyas viswanathan"));
        System.out.println(longestWord("Hello how are you"));
        wordScramble("Pneumonoultramicroscopicsilicovolcanoconiosis");
    }
    public static boolean isLetterA(char letter)
    {
       boolean hasA;
       if (letter == 'a')
       {
           hasA = true;
        }
       else
       {
           hasA = false;
        }
       return hasA;
    }
    public static boolean hasTwoA(String s)
    {
        int numA = 0;
        boolean hasTwoA;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == 'a')
            {
                numA++;
            }
        }
        if (numA >= 2)
        {
            hasTwoA = true;
        }
        else
        {
            hasTwoA = false;
        }
        return hasTwoA;
    }
    public static boolean isVowel(char letter)
    {
        boolean vowel;
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'
        || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U')
        {
            vowel = true;
        }
        else
        {
            vowel = false;
        }
        return vowel;
    }
    public static int numVowels(String s)
    {
        int vowels = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' ||
            s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' 
            || s.charAt(i) == 'O' || s.charAt(i) == 'U')
            {
                vowels++;
            }
        }
        return vowels;
    }
    public static boolean evenChars(String s, char a, char b)
    {
        int numberA = 0;
        int numberB = 0;
        boolean isEqual;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == a)
            {
                numberA++;
            }
            else if (s.charAt(i) == b)
            {
                numberB++;
            }
        }
        if (numberA == numberB)
        {
            isEqual = true;
        }
        else
        {
            isEqual = false;
        }
        return isEqual;
    }
    public static boolean twoInARow(String s, char a)
    {
       boolean row;
       int counter = 0;
       for (int i = 0; i < s.length(); i++)
       {
           if (s.charAt(i) == a && s.charAt(i + 1) == a)
           {
               counter++;
            }
           else
           {
               counter = 0;
            }
        }
       if (counter == 2)
       {
           row = true;
        }
       else
       {
           row = false;
        }
       return row;
    }
    public static String capitalizeVowels(String s)
    {
        String newStr = "";
        newStr = s.replaceAll("a", "A").replaceAll("e", "E").replaceAll("i", "I").replaceAll("o", "O").replaceAll("u", "U");
        return newStr;
    }
    public static String longestWord(String s)
    {
        String longest = "";
        String strArray[] = s.split(" ");
        for (int i = 0; i < strArray.length; i++)
        {
            for (int j = i + 1; j < strArray.length; j++)
            {
                if (strArray[i].length() > strArray[j].length())
                {
                    longest = strArray[i];
                }
            }
        }
        return longest;
    }
    
    //Word Scramble
    public static void wordScramble(String line)
    {
        String scrambledWord = "";
        for (int i = 0; i < line.length(); i++)
        {
            int mainIndex = (int) Math.floor(Math.random() * line.length());
            char mainCharacter = line.charAt(mainIndex);
            line = line.substring(0, mainIndex) + line.substring(mainIndex + 1);
            scrambledWord = scrambledWord + mainCharacter;
        }
        System.out.println("The original word is >>> " + line);
        System.out.println("The scrambled version of the word is >>> " + scrambledWord);
    }
}