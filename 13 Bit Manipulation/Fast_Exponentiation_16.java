import java.util.*;

public class Fast_Exponentiation_16 {
    public static int Fast_Expo(int a , int n){
        int ans = 1; 
        while (n>0){
            if ((n&1)!=0){
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        System.out.println("Enter the power : ");
        int n = sc.nextInt();

        System.out.println(Fast_Expo(a,n));
    }
    
}
