import java.util.*;
public class DayOfWeek{
    public static void main (String[] args)
    {
       Scanner input = new Scanner(System.in);
       boolean runProgram = true;
       while (runProgram)
       {
       String month = getMonth();
       int day = getDay();
       int year = getYear();
       calculateDay(month, day, year);
       System.out.print("Would you like to enter another date? Y/N: ");
       String choice = input.nextLine();
       if (choice.equals("Y"))
       {
           calculateDay(month, day, year);
            }
       else
       {
           System.out.println("Thank you!");
           runProgram = false;
        }
        }
    }
    public static String getMonth()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your birth month: ");
        String month = input.nextLine();
        return month;
    }
    public static int getDay()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your birth day: ");
        int day = input.nextInt();
        return day;
    }
    public static int getYear()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your birth year: ");
        int year = input.nextInt();
        return year;
    }
     public static int leapYear(int year, String month)
    {
        int isLeap = 1;
        if (year % 4 == 0)
        {
            if (year % 100 == 0 && year % 400 == 0)
            {
                if (month.equals("January") || month.equals("February"))
                {
                  isLeap = 1; 
                }
                else{
                    isLeap = 0;
                }
            }
            else
            {
                isLeap = 0;
            }
        }
        else{
            isLeap = 0;
        }
        return isLeap;
    }
    public static void calculateDay(String month, int day, int year)
    {
        int total = 0;
        int lastTwoDigits = year % 100;
        int quotient = (lastTwoDigits / 4);
        total += quotient;
        total += day;
        switch(month)
        {
            case "January": total += 1;
                            break;
            case "February": total += 4;
                             break;
            case "March": total += 4;
                          break;
            case "April": total += 0;
                          break;
            case "May": total += 2;
                        break;
            case "June": total += 5;
                         break;
            case "July": total += 0;
            break;
            case "August": total += 3;
            break;
            case "September": total += 6;
            break;
            case "October": total += 1;
            break;
            case "November": total += 4;
            break;
            case "December": total += 6;
            break;
        }
        total -= leapYear(year, month);
        if (year > 1799 && year < 1900)
        {
            total += 2;
        }
        else if (year > 1899 && year < 2000)
        {
            total += 0;
        }
        else if (year > 1999 && year < 2100)
        {
            total += 6;
        }
        total += lastTwoDigits;
        int remainder = total % 7;
        switch(remainder)
        {
            case 1: System.out.println("You were born on a Sunday");
            break;
            case 2: System.out.println("You were born on a Monday");
            break;
            case 3: System.out.println("You were born on a Tuesday");
            break;
            case 4: System.out.println("You were born on a Wednesday");
            break;
            case 5: System.out.println("You were born on a Thursday");
            break;
            case 6: System.out.println("You were born on a Friday");
            break;
            case 0: System.out.println("You were born on a Saturday");
            break;
        }
        System.out.println();
    }
}