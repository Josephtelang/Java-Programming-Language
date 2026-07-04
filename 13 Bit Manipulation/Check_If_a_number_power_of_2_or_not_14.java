import java.util.*;

public class Check_If_a_number_power_of_2_or_not_14 {
    public static boolean is_Power_of_2(int n){
        return ((n & (n-1))==0);
        
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check if it is even or not : ");
        int n = sc.nextInt();

        System.out.println(is_Power_of_2(n));
    }
    
}
