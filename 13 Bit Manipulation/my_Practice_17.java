import java.util.*;

public class my_Practice_17 {
    public static void is_even_or_odd(int n){
        if((n & 1)==0){
            System.out.println("The number "+n+" is Even");
            
        }
        else{
            System.out.println("The number "+n+" is Odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the power you want : ");
        int n = sc.nextInt();
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        // System.out.println("Enter the jth postion : ");
        // int j = sc.nextInt();

        // is_even_or_odd(n);

        // System.out.println("The answer is :"+Get_ith_bit(n,i));

        // System.out.println("The answer is :"+Set_ith_bit(n,i));

        // System.out.println("The answer is :"+Clear_ith_bit(n,i));

        // System.out.println("Enter the new_bit which you want to set :");
        // int new_bit = sc.nextInt();
        // System.out.println("The answer is :"+Update_ith_bit(n,i,new_bit));

        // System.out.println("The answer is :"+Clear_last_i_bits(n,i));

        // System.out.println("The answer is :"+clear_bits_in_range(n,i,j));

        // System.out.println("The answer is : "+is_power_of_2(n));

        // System.out.println("The answer is : "+count_set_bits(n));

        System.out.println("The answer is : "+fast_expo(n,a));


        
    }

    public static int Get_ith_bit(int n , int i){
        int bitmask = 1<<i;
        if ((n & bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }
    }

    public static int Set_ith_bit(int n , int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }

    public static int Clear_ith_bit(int n , int i ){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static int Update_ith_bit(int n , int i, int new_bit){
        // if (  new_bit == 0 ){
        //     return Clear_ith_bit(n, i);
        // }
        // else{
        //     return Set_ith_bit(n, i);
        // }

        n = Clear_ith_bit(n,i);
        int bit_mask = new_bit<<i;
        return bit_mask | n;
    }

    public static int Clear_last_i_bits(int n , int i){
        int bitmask = ~0 << i;
        return n & bitmask;
    }

    public static int clear_bits_in_range(int n, int i, int j){
        int a = ~0 << (j+1);
        int b = (1<<i) - 1;
        int bit_mask = a | b;

        return n & bit_mask;
    }

    public static boolean is_power_of_2(int n){
        return n>0 && ((n & (n-1))==0);
    }
    
    public static int count_set_bits(int n){
        int count = 0;
        while ( n>0){
            if ((n&1) != 0){
                count ++;
            }
            n = n>>1;


        }
        return count;
    }

    public static int fast_expo(int n , int a ){
        int ans = 1;
        while (n>0){
            if ((n&1)!= 0){
                ans = ans * a;
                
            }
            a = a * a ;
            n = n >> 1;
        }
        return ans;
    }
}
