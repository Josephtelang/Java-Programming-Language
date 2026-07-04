import java.util.Scanner;

public class Set_ith_bit_09 {
    public static int Set_ith_bit(int n, int i){
        int bitmask = 1<<i;

        return n | bitmask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        System.out.println("Enter the ith position :");
        int i = sc.nextInt();

        System.out.println("this is the answer : "+Set_ith_bit(n, i));
    }
    
}
