import java.util.*;
class Calc{
    public static void main (String[] args){
    int initial_value = 1;
    while(initial_value != 0){
    initial_value = showMenu();
    if (initial_value == 0)
    {
    }
    else{
    double val_1 = getValue();
    double val_2 = getValue();
    if (initial_value == 1)
    {
        add(val_1, val_2);
    }
    else if (initial_value == 2)
    {
        subtract(val_1, val_2);
    }
    else if (initial_value == 3)
    {
        multiply(val_1, val_2);
    }
    else if (initial_value == 4)
    {
        divide(val_1, val_2);
    }
}
    }
}
public static int showMenu(){
    Scanner input = new Scanner(System.in);
    System.out.println("Calculator Program \n 1 - Add \n 2- Subtract\n 3 - Multiply\n 4 - Divide\n 0 - End Program");
    System.out.print("Select the operation to perform: ");
    int initial_value = input.nextInt();
    return initial_value;
}
public static double getValue(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number: ");
    double val_1 = input.nextDouble();
    return val_1;
}
public static void add(double val_1, double val_2){
    System.out.println(val_1 + " + " + val_2 + " = " + (val_1 + val_2));
    System.out.println();
}
public static void subtract(double val_1, double val_2){
   System.out.println(val_1 + " - " + val_2 + " = " + (val_1 - val_2));
   System.out.println();
}
public static void multiply(double val_1, double val_2){
    System.out.println(val_1 + " * " + val_2 + " = " + (val_1 * val_2));
    System.out.println();
}
public static void divide(double val_1, double val_2){
    System.out.println(val_1 + " / " + val_2 + " = " + (val_1 / val_2));
    System.out.println();
}
}