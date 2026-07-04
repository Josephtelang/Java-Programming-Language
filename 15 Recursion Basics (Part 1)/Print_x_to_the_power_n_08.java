import java.util.*;

public class Print_x_to_the_power_n_08 {
    public static int Print_x_to_power_n(int x, int n){
        if ( n ==0){
            return 1;
        }

        // int xnm1 = Print_x_to_power_n(x, n-1);
        // int xn = x*xnm1;
        // return xn;

        return x * Print_x_to_power_n(x, n-1);

    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("form x^n enter x : ");
        int x = sc.nextInt();
        System.out.println("form x^n enter n : ");
        int n = sc.nextInt();
        System.out.println(Print_x_to_power_n(x,n));
    }
    
}
