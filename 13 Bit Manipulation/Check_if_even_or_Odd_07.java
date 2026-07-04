import java.util.*;
public class Check_if_even_or_Odd_07 {
    public static void Odd_or_Even(int n){
        int bitmask = 1 ;
        if ((n & bitmask)==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is Odd");
        }
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it is odd or even :");
        int n = sc.nextInt();

        Odd_or_Even(n);

    }
    
}
