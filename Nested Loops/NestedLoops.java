import java.util.*;
class nestedLoops{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter an even number between 4 and 20: ");
        int x = input.nextInt();
        input.nextLine();
        if (x % 2 == 0 && x > 4 && x < 20){
            for(int i=0; i<= x; i++) //Controls the rows
            {
                for(int j = 1; j<=(i); j++)  //Controls the output within the row.
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
            for (int i=1; i<=x; i++){
                for (int j=1; j<=x; j++){
                    if(i==1||i==x||j==1||j==x){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
            for(int i=x; i>= 0; i--) //Controls the rows
            {
                for(int j = i; j>= 1; j--)  //Controls the output within the row.
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        System.out.print("Enter an odd number between 5 and 21: ");
        x = input.nextInt();
        input.nextLine();
        if (x%2 == 1 && x >= 5 && x <= 21){
            for (int i=1; i<=x; i++){
                for (int j=1; j<=x; j++){
                    if (i==1||i==x){
                        System.out.print("*");
                    }
                }
                if (i!=1&&i!=x){
                    System.out.print("  ");
                    for (int z = 1; z <= (x-4); z++){
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("Enter the number of rows between 10 and 30: ");
        x = input.nextInt();
        input.nextLine();
        if (x >= 10 && x <= 30){
            for (int i = 1; i <= x; i++){
                if (i == 2 || i == (x - 1)){
                    System.out.print("*");
                    for (int z = 1; z <= (x - 2); z++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                for (int j = 1; j <= x; j++){
                    if (i != 2 && i != (x - 1)){
                        if (i > 2 && i < (x - 1)){
                            System.out.print("* ");
                            for (int z = 1; z <= (x - 4); z++){
                                System.out.print("*");
                            }
                            System.out.print(" *");
                            break;
                        }
                        else {
                            System.out.print("*");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
