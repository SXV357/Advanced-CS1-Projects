import java.util.Scanner;

public class BinaryConversion
{
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
      int[] nums = {2, 4, 5, 8, 6, 2, 3, 5, 9, 0, 9, 6};
     
      //Problem 1
      System.out.println(sum(nums));
       System.out.println();
      //Problem 2
      System.out.println(foundOdd(nums));
       System.out.println();
      //Problem 3
      System.out.println(noZeros(nums));
       System.out.println();
      //Problem 5
      System.out.println(twoSixes(nums));
       System.out.println();

      //Problem 6
      System.out.println(foundTwoThree(nums));
       System.out.println();
      //Problem 7
      System.out.println(inOrder(nums));
       System.out.println();
      //Problem 8
      System.out.println(evens(nums));
       System.out.println();
      //Problem 9
      System.out.println(threeInARow(nums));
       System.out.println();
      //problem 10
      System.out.println(difference(nums));
       System.out.println();
     
      System.out.print("Enter binary number >>> ");
      String binary = input.nextLine();
      System.out.println(toBinary(binary));
     
 
   
    //Add all your methods here
   
   
}
public static int sum(int[] nums)
{
      int total = 0;
      for (int i = 0; i < nums.length; i++)
      {
          total += nums[i];
        }
      return total;
}
public static String foundOdd(int[] nums)
{
    String isOdd = "";
      for (int i = 0; i < nums.length; i++)
      {
          if (nums[i] % 2 != 0)
          {
              isOdd = "Found an odd";
            }
        }
      return isOdd;
}
public static String noZeros(int[] nums)
{
    String hasZero = " ";
      for (int i = 0; i < nums.length; i++)
      {
          if (nums[i] != 0)
          {
              hasZero = "Found a zero";
            }
          else{
              hasZero = "No zeros";
            }
        }
      return hasZero;
}
public static String twoSixes(int[] nums)
{
    int counter = 0;
      String sixes = " ";
      for (int i = 0; i < nums.length; i++)
      {
          if (nums[i] == 6)
          {
              counter++;
            }
        }
      if (counter > 1)
      {
          sixes = "Two 6s";
        }
      else
      {
          sixes = "Less than 2 sixes";
        }
      return sixes;
}
public static String foundTwoThree(int[] nums)
{
    int count = 0;
    String twoOrThree = " ";
      for (int i = 0; i < nums.length; i++)
      {
          if (nums[i] + nums[i + 1] == 5)
          {
              count += (2 + nums[i + 1]);
              i = nums.length;
            }
        }
      if (count == 5)
      {
          twoOrThree = "Found 2/3";
        }
      else
      {
          twoOrThree = "No 2/3";
        }
    return twoOrThree;
}
public static String inOrder(int[] nums)
{
    String order = " ";
    int co = 0;
    for (int i = 0; i < nums.length; i++)
      {
          if (nums[i] == nums[nums.length - 1])
          {
            }
          else if (nums[i] <= nums[i + 1])
          {
             co++;
            }
        }
    if (co == nums.length - 1)
    {
        order = "In order";
    }
    else
    {
        order = "Not in order";
    }
      return order;
}
public static String evens(int[] nums)
{
    String evenNo = " ";
      int c = 0;
      for (int i = 0; i < nums.length; i++)
      {
          if (nums[i] % 2 == 0)
          {
              c++;
            }
        }
      if (c % 2 == 0)
      {
          evenNo = "Even evens";
        }
      else
      {
          evenNo = "Uneven evens";
        }
      return evenNo;
}
public static String threeInARow(int[] nums)
{
    String row = " ";
      for (int i = 0; i < nums.length; i++)
      {
          if (nums[i] == nums[nums.length - 2] || nums[i] == nums[nums.length - 1])
          {
            }
          else if  (nums[i] == nums[i + 1])
          {
             if (nums[i + 1] == nums[i + 2])
             {
                 row = "Three in a row";
                }
            }
          else
          {
              row = "No three in a row";
            }
        }
     return row;
}
public static int difference(int[] nums)
{
    int max = nums[0];
    int min = nums[0];
    int diff = 0;
    for (int i = 1; i < nums.length; i++)
    {
        if (nums[i] > max)
        {
            max = nums[i];
        }
        else if (nums[i] < min)
        {
            min = nums[i];
        }
    }
    diff = max - min;
    return diff;
}
public static int toBinary(String binary)
{
    int actualNumber = Integer.parseInt(binary, 2); //using base 2 to directly convert
    return actualNumber;
}
}