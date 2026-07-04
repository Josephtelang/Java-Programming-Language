import java.util.*;
/*Question 5 :Write a Java method to compute the sum of the digits in an integer.*/

public class Problem05 {
    public static int sum(int num){
        int sum = 0;

        while(num>0){
            int num_ld = num%10;
            
            
            sum += num_ld ;
            num /= 10;
            
        }

        return sum ;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number :");
        int a = sc.nextInt();

        System.out.println("This is the number "+a+" who's digit sum is "+sum(a));

        sc.close();

        


    }
    
}
