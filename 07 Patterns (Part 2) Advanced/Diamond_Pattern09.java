import java.util.*;

public class Diamond_Pattern09 {
    public static void diamond(int n){
        // outer loop
        // 1'st half
        for (int i = 1 ; i<=n; i++){
            // Spaces
            for (int j = 1 ;j <= n-i ; j++) {
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j<= (2 * i)-1; j++){
                System.out.print("*");
            }
            System.out.println();


        }

        // 2'nd half
        for (int i = n ; i>=1; i--){
            // Spaces
            for (int j =1 ; j <= n-i ; j++){
                System.out.print(" ");
            }
            // Stars
            for (int j = 1; j <= (2*i)-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String arg[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the numbers of rows you want :");
        int n = sc.nextInt();

        diamond(n);
        sc.close();

    }
    
}
