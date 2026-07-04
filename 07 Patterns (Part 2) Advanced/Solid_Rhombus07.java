import java.util.*;

public class Solid_Rhombus07 {
    public static void solid_rhombus(int n){
        // Outer loop
        for (int i= 1 ; i<=n ; i++){
            // spaces
            for (int j = 1; j<=(n-i) ; j ++){
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j<=n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of rows you want :");
        int n = sc.nextInt();

        solid_rhombus(n);
        sc.close();

    }
    
}
