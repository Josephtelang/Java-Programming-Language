import java.util.*;

public class Clear_i_bits_12 {
    public static int Clear_i_bits(int n , int i){
        int bitmask = ~0 << i;
        return n & bitmask;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Enter the ith digit : ");
        int i = sc.nextInt();

        System.out.println("The answer is : "+Clear_i_bits(n,i));
    }
    
}
