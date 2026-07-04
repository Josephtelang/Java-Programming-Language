package chapter13hw;
import java.util.*;

// Question 3 :Add 1 to an integer using Bit Manipulation.
// (Hint: try using Bitwise NOT Operator)

public class Problem03 {
    public static int add_1_using_bit_wise_operator(int n){
        return -(~n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("The "+n+" + 1 is : "+add_1_using_bit_wise_operator(n));

          
    }
    
}
