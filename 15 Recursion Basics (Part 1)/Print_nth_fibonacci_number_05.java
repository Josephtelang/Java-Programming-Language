import java.util.*;

public class Print_nth_fibonacci_number_05{
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fibnm1 = fib(n-1); //1
        int fibnm2 = fib(n-2); //0
        int fibn = fibnm1 + fibnm2;
        return fibn;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        System.out.println(fib(n));
    }
}