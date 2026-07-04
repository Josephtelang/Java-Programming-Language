package Chapter04hw;
import java.util.*;
// Question 3 :Write a program to find the factorialof any number entered by the user.

/*(Hint:factorialofanumbern=n*(n-1)*(n-2)*(n-3)*......*1andexistsforpositivenumbersonly.
   We write factorial as n!So, factorial of 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24 and so on.
   Note - Please do not confuse factorial with NOT EQUAL TO operator, they are not the same)*/


public class Problem03 {
    public static void main(String arg[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the of which you want to find the factorial :");
        int num = sc.nextInt();
        int factorial = num;
        if (num>=0){
            if (num==0){
                System.out.print("The factorial of "+num+" is :"+ 1);
            }
            else{
                for (int i = 1;i<num;i++){
                    factorial = factorial * (num-i);

                }
                System.out.println("The factorial of "+num+" is :"+factorial);            
            }

        }
        else{
            System.out.print("Factoria of negative number does not exist.");
        }
        sc.close();


    }
    
}
