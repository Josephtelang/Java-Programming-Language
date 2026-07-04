import java.util.*;

public class Count_Set_Bits_in_number_15 {
    public static int Count_set_Bits(int n){
        int count = 0 ;
        while(n>0){
            if ((n&1)!=0){
                count++;
            }
            n = n>>1;

        }
        return count;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        System.out.println("The answer is : "+Count_set_Bits(n));


    }
    
}
