package Chapter04hw;
import java.util.*;
// Write a program that reads a set of integers,and then prints the sum of the even and odd integers.

public class Problem02 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        
        int sum_of_even = 0;
        int sum_of_odd = 0;
        int choice;
        // System.out.println(choice);                //The local variable choice may not have been initialized
        
        do{
            System.out.print("Enter the number :");
            int num = sc.nextInt();
            if (num%2==0){
                sum_of_even +=num;
            }
            else{
                sum_of_odd +=num;
            }
            System.out.print("If you want to continue entering number enter 1 :");
            choice = sc.nextInt();

        }while(choice==1);

        System.out.println("number of  even numbers :"+sum_of_even);
        System.out.println("number of odd numbers :"+sum_of_odd);
        sc.close();


    }
    
}
