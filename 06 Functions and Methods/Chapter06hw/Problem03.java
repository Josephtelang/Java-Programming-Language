import java.util.*;
/*Question3:Write a Java program to check if a number is a palindrome in Java? 
(121 is a palindrome, 321 is not) A number is called a palindrome if the number is equal to the reverse of a numbere.
e.g.,121 is a palindrome because the reverse of 121 is 121 itself.On the other hand,
321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321.*/

public class Problem03 {

    public static void ispalindrome(int num){
        int origi_num = num;
        int rev = 0;
        
        
        while(num>0){
            int last_digit = num%10;
            rev = last_digit + (rev * (int)Math.pow(10,1));
            num = num / 10;
            
            }


        if (rev == origi_num){
            System.out.println("The number "+origi_num+ " is palindrome which's reverse is : "+rev);
        }
        else{
            System.out.println("The number "+origi_num+" is not palindrome which's reverse is : "+rev);
        }


    }
    public static void main(String arg[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        ispalindrome(num);

        sc.close();
        


    }
    
}
