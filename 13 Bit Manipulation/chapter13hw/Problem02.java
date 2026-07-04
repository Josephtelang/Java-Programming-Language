package chapter13hw;
import java.util.*;


public class Problem02 {
    public static void swapping_with_arithmetic_operator(int a, int b){
        System.out.println("This is a : "+a+" and b : "+b);
        a = a+b;
        b = a - b;
        a = a - b;
        System.out.println("This is swapped a : "+a+" and b :"+b);


    }

    public static void swapping_with_XOR_operator(int a , int b){
        System.out.println("This is a : "+a+" and b : "+b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("This is swapped a : "+a+" and b :"+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a : ");
        int a = sc.nextInt();
        System.out.println("Enter the b : ");
        int b = sc.nextInt();


        swapping_with_XOR_operator(a, b);
        swapping_with_arithmetic_operator(a, b);

        
    }
    
}
