import java.util.*;
public class PhoneNumber
{
public static void main (String[] args)
    {
    question();
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter month: ");
    String month = input.nextLine();
    System.out.print("Enter year: ");
    int year = input.nextInt();
    daysInMonth(month, year);
    input.nextLine();
    System.out.print("Enter the letter on the phone keypad: ");
    char letter = input.nextLine().charAt(0);
    phone(letter);
    }
public static void question()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Which of the following is a valid variable declaration in Java?");
        System.out.println("1. int 1a = 4;");
        System.out.println("2. double circle-area = 5.78;");
        System.out.println("3. String s = 'hello!';");
        System.out.println("4. boolean whoaNow = true;");
        System.out.print("Your answer: ");
        int answer = input.nextInt();
        switch (answer) 
   { 
    case 1 : System.out.println("Wrong");
                    System.out.println("This is not the right format.");
                     break;
    case 2 : System.out.println("Wrong.");
                    System.out.println("This is not the right answer.");
                     break;
   case 3 :  System.out.println("Wrong.");
                    System.out.println("This is not the right answer.");
                    break;

   case 4 : System.out.println("Correct");
                   System.out.println("This is an acceptable format");
                   break;
   default : System.out.println("No Match Found"); 
   }
   }
   public static void daysInMonth(String month, int year)
   {
        int remainder1 = year % 4;
        int remainder2 = year % 100;
        int remainder3 = year % 400;
        int x = 0;
if (remainder1 == 0)
    {
        if (remainder2 != 0)
        {
            System.out.println(year + " is a leap year!");
            x = 1;
        }
        else if (remainder2 == 0)
        {
            if (remainder3 == 0)
            {
                System.out.println(year + " is a leap year!");
                x = 1;
            }
            else if (remainder3 != 0)
            {
                System.out.println(year + " is not a leap year!");
                x = 0;
            }
        }
    }
    else if (remainder1 != 0)
    {
        System.out.println(year + " is not a leap year!");
        x = 0;
    }
    if (x == 0)
    {
    switch (month)
    {
        case "January" : System.out.println("31 days");
        break;
        case "Feburary" : System.out.println("28 days");
        break;
        case "March" : System.out.println("31 days");
        break;
        case "April" : System.out.println("30 days");
        break;
        case "May" : System.out.println("31 days");
        break;
        case "June" : System.out.println("30 days");
        break;
        case "July" : System.out.println("31 days");
        break;
        case "August" : System.out.println("31 days");
        break;
        case "September" : System.out.println("30 days");
        break;
        case "October" : System.out.println("31 days");
        break;
        case "November" : System.out.println("30 days");
        break;
        case "December" : System.out.println("31 days");
        break;
    }
}
    else if (x == 1)
    {
        switch (month)
    {
        case "January" : System.out.println("31 days");
        break;
        case "Feburary" : System.out.println("29 days");
        break;
        case "March" : System.out.println("31 days");
        break;
        case "April" : System.out.println("30 days");
        break;
        case "May" : System.out.println("31 days");
        break;
        case "June" : System.out.println("30 days");
        break;
        case "July" : System.out.println("31 days");
        break;
        case "August" : System.out.println("31 days");
        break;
        case "September" : System.out.println("30 days");
        break;
        case "October" : System.out.println("31 days");
        break;
        case "November" : System.out.println("30 days");
        break;
        case "December" : System.out.println("31 days");
        break;
    }
}
}
public static void phone(char letter)
{
    
    switch (letter)
    {
        case 'A' : System.out.println("The numerical equivalent is 2");
        break;
        case 'B' : System.out.println("The numerical equivalent is 2");
        break;
        case 'C' : System.out.println("The numerical equivalent is 2");
        break;
        case 'D' : System.out.println("The numerical equivalent is 3");
        break;
        case 'E' : System.out.println("The numerical equivalent is 3");
        break;
        case 'F' : System.out.println("The numerical equivalent is 3");
        break;
        case 'G' : System.out.println("The numerical equivalent is 4");
        break;
        case 'H' : System.out.println("The numerical equivalent is 4");
        break;
        case 'I' : System.out.println("The numerical equivalent is 4");
        break;
        case 'J' : System.out.println("The numerical equivalent is 5");
        break;
        case 'K' : System.out.println("The numerical equivalent is 5");
        break;
        case 'L' : System.out.println("The numerical equivalent is 5");
        break;
        case 'M' : System.out.println("The numerical equivalent is 6");
        break;
        case 'N' : System.out.println("The numerical equivalent is 6");
        break;
        case 'O' : System.out.println("The numerical equivalent is 6");
        break;
        case 'P' : System.out.println("The numerical equivalent is 7");
        break;
        case 'Q' : System.out.println("The numerical equivalent is 7");
        break;
        case 'R' : System.out.println("The numerical equivalent is 7");
        break;
        case 'S' : System.out.println("The numerical equivalent is 7");
        break;
        case 'T' : System.out.println("The numerical equivalent is 8");
        break;
        case 'U' : System.out.println("The numerical equaivalent is 8");
        break;
        case 'V' : System.out.println("The numerical equivalent is 8");
        break;
        case 'W' : System.out.println("The numerical equivalent is 9");
        break;
        case 'X' : System.out.println("The numerical equivalent is 9");
        break;
        case 'Y' : System.out.println("The numerical equivalent is 9");
        break;
        case 'Z' : System.out.println("The numerical equivalent is 9");
        break;
    }
}

}