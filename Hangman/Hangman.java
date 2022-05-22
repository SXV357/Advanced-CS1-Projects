import java.util.*;
public class hangman
{
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
int[] a = {5, 34, 3, -6, 7, 81, 1, 7, 5, 2, 2, 53, 4, 5, 62, 7};
int[] b = {1, 3, 4, 90, -4, 60, 12, 13, 4, -4, -1, 2, 4, 4, 9, 8};

//2
int sum = 0;
for (int i = 0; i < a.length; i++)
{
    sum += a[i];
}
int avg = sum / a.length;
System.out.println("Avg of all elements in a: " + sum);

int s = 0;
for (int i = 0; i < b.length; i++)
{
    s += b[i];
}
int average = s / b.length;
System.out.println("Avg of all elements in b: " + average);

//3
int counter = 0;
for (int i = 0; i < a.length; i++)
{
    if (a[i] > b[i])
    {
        if (a[i] - b[i] <= 2)
        {
            counter++;
        }
    }
    else if (a[i] < b[i])
    {
        if (b[i] - a[i] <= 2)
        {
            counter++;
        }
    }
}
System.out.println(counter);
//4
String evenOrOdd = " ";
int arr1AndTwoEven = 0;
int arr1AndTwoOdd = 0;
for (int i = 0; i < a.length; i++)
{
    if (a[i] % 2 == 0 && b[i] % 2 == 0)
    {
        arr1AndTwoEven++;
    }
    else{
        arr1AndTwoOdd++;
    }
}
if (arr1AndTwoEven > arr1AndTwoOdd)
{
    evenOrOdd = "More even than odd";
}
else
{
    evenOrOdd = "More odd than even";
}
//5
String threeInARow = " ";
for (int i = 0; i < a.length; i++)
{
    if (a[i] == a[a.length - 2] && a[i] == a[a.length - 1])
    {
        if (a[i] == a[i +1] - 1 && a[i +1] - 1 == a[i + 2] - 2)
        {
            threeInARow = "Found three in a row";
        }
    }
    else
    {
        threeInARow = "Didn\'t find three in a row!";
    }
}
System.out.println(threeInARow);
//7
int co = 0;
String two = " ";
for (int i = 0; i < a.length; i++)
{
    if (a[i] == a[i + 1])
    {
       if (a[i] + a[i + 1] == 4 || a[i] + a[i + 1] == 8)
       {
        co += a[i] + a[i + 1];
        i = a.length;
        two = "Two / four ";
    }
    }
    else
    {
        two = "Not two / four ";
    }
}
System.out.println(two);
//8
int[] c = new int[a.length];
int count = 1;
for (int i = 0; i <a.length; i++)
{
    c[i] = a[a.length - count];
    count++;
}
for (int i = 0; i < c.length; i++)
{
    System.out.print(c[i] + " ");
}

//9
int maxArr1 = a[0];
int minArr1 = a[0];
int maxArr2 = b[0];
int minArr2 = b[0];
for (int i = 0; i < a.length; i++)
{
    if (a[i] > maxArr1)
    {
        maxArr1 = a[i];
    }
    else if (a[i] < minArr1)
    {
        minArr1 = a[i];
    }
}
int range1 = maxArr1 - minArr1;
System.out.println("Range of a: " + range1);
for (int i = 0; i < b.length; i++)
{
    if (b[i] > maxArr2)
    {
        maxArr1 = b[i];
    }
    else if (b[i] < minArr2)
    {
        minArr1 = b[i];
    }
}
int range2 = maxArr2 - minArr2;
System.out.println("Range of b: " + range2);

//Hangman App
char[] secretWord = {'c', 'o', 'm', 'p', 'u', 't', 'e', 'r'};
char[] masked = new char[13];
for (int i = 0; i < masked.length; i++)
{
    masked[i] = '_';
}
System.out.print("Here\'s your word to guess: ");
for (int i = 0; i < masked.length; i++)
{
    System.out.print(masked[i] + " ");
}
int guesses = 8;
int gameOverCounter = 0;
String correctWord = " ";
boolean gameOver;
while (guesses != 0)
{
    int x = 0;
    for (int i = 0; i < secretWord.length; i++)
    {
        System.out.print("Enter your guess letter >>> " );
        char guessLetter = input.nextLine().charAt(0);
        if (guessLetter != secretWord[i])
        {
            guesses--;
        }
        else
        {
            System.out.println("Correct letter");
            masked[i] = secretWord[i];
        }
        if (masked.length == secretWord.length)
        {
            gameOver = true;
        }
        System.out.println("Guesses remaining >>> " + guesses);
        for (x = 0; x < masked.length; x++)
        {
        System.out.print(masked[x] + " ");
        }
    }
    if (gameOver = true)
    {
        System.out.print("You won. Good job!");
        break;
    }
}
}
}
