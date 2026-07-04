import java.util.*;
public class Sum_of_N_natural_numbers_04 {
    public static int Cal_sum(int n){
        if (n==1){
            return 1;
        }
        int snm1 = Cal_sum(n-1);
        int sn = n + snm1;
        return sn;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(Cal_sum(n));
    }
    
}
