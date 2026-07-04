import java.util.Scanner;

public class Update_ith_bit_11 {
    public static int Clear_ith_bit(int n , int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static int Set_ith_bit(int n , int i){
        int bitmask = 1<<i;
        
        return n | bitmask;

    }

    public static int Update_ith_bit(int n, int i,int newbit ){
        // if (newbit == 0 ){
        //     return Clear_ith_bit(n,i);
        // }
        // else{
        //     return Set_ith_bit(n, newbit);
        // }

        n =  Clear_ith_bit(n,i);
        int bitmask = newbit<<i;
        return bitmask | n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        System.out.println("Enter the ith position :");
        int i = sc.nextInt();
        System.out.println("Enter the newbit you want to place at position i : ");
        int newbit = sc.nextInt();

        System.out.println("this is the answer : "+Update_ith_bit(n, i,newbit));
        
    }
    
}
