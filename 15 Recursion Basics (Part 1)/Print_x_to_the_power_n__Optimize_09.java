import java.util.Scanner;

public class Print_x_to_the_power_n__Optimize_09{
    public static int Print_x_to_power_n_O(int x ,int n){//O(logn)
        if (n==0){
            return 1;
        }
        int half_power = Print_x_to_power_n_O(x, n/2);
        int half_power_sq = half_power * half_power;

        if (n%2 !=0){
            half_power_sq = x * half_power_sq;
        }

        return half_power_sq;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("form x^n enter x : ");
        int x = sc.nextInt();
        System.out.println("form x^n enter n : ");
        int n = sc.nextInt();
        System.out.println(Print_x_to_power_n_O(x,n));
    }
    
    
}