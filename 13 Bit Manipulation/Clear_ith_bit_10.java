import java.util.Scanner;

public class Clear_ith_bit_10 {
    public static int Clear_ith_bit(int n , int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        System.out.println("Enter the ith position :");
        int i = sc.nextInt();

        System.out.println("The answer is this : "+Clear_ith_bit(n, i));
        
    }
    
}
