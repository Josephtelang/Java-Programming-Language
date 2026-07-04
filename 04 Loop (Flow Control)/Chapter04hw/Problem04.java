package Chapter04hw;
import java.util.*;
// Question4:Write a program to print the multiplication table of a number N,entered by the user.

public class Problem04 {
    public static void main(String arg[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();

        for (int i =1; i<=10;i++){
            System.out.println(i+" x "+n+" = "+(i*n));
        }

        sc.close();

    }
    
}
