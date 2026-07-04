import java.util.*;

public class Find_the_factorial_of_N_03 {
    public static int print_fact(int n){
        if(n==0){
            return 1;
        }
        int fnm1 = print_fact(n-1);
        int fact_n = n * fnm1;
        return fact_n;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(print_fact(n));

    }
    
}
