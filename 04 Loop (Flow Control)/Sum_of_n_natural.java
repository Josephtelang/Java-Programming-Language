import java.util.*;

public class Sum_of_n_natural {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        int i = 1;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println("The sum of "+n+" numbers is :"+ sum);
        sc.close();

    }
    
}
