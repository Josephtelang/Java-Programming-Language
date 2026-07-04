import java.util.*;

public class Get_ith_bit_08 {
    public static int Get_ith_bit(int n , int i){
        int bitmast= 1<<i;

        if((n& bitmast)==0){
            return 0;
        }
        else{
            return 1;
        }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        System.out.println("Enter the ith position :");
        int i = sc.nextInt();

        System.out.println(Get_ith_bit(n,i));
    }
    
}
