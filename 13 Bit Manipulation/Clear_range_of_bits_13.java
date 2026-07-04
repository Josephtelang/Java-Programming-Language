import java.util.*;

public class Clear_range_of_bits_13 {
    public static int Clear_bits_in_range(int n,int j,int i){
        int a = ~0 << (j+1);
        int b = (1<<i) - 1;

        int bitmask = a | b;

        return n & bitmask;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Enter the jth position : ");
        int j = sc.nextInt();
        System.out.println("Enter the ith position : ");
        int i = sc.nextInt();

        System.out.println("The answer is : "+Clear_bits_in_range(n,j,i));
    }
    
}
