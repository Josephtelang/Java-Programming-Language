import java.util.*;

/*Question2:Write a method named isEven that accepts an int argument.
The method should return true if the argument is even, or false other wise.
Also write a program to test your method.*/

public class Problem02 {

    public static boolean isEven(int num){
        if (num%2==0){
            return true;
        }
        return false;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number :");
        int a = sc.nextInt();

        System.out.println(isEven(a));

        sc.close();


    }
    
}
