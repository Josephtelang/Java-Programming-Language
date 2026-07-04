import java.util.*;

public class Butterfly_Pattern06 {
    public static void butterfly(int n){
        // outer loop 
        for (int i = 1 ; i<=n ; i++){
            for ( int j = 1 ; j<= i ; j++){
                System.out.print("*");
            }
            for (int j = 1 ; j<= 2*(n-i); j++){
                System.out.print(" ");
            }
            for (int j = 1 ; j<= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
 
        for (int i =n ; i>=1 ; i--){
            for (int j= 1 ; j<=i; j++){
                System.out.print("*");
            }
            for (int j = 1; j<= 2*(n-i); j++){
                System.out.print(" ");
            }
            for (int j = 1; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want :");
        int n = sc.nextInt();

        butterfly(n);

        sc.close();

    }
    
}
