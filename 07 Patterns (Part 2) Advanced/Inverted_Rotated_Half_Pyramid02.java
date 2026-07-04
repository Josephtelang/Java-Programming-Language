import java.util.*;

public class Inverted_Rotated_Half_Pyramid02 {

    public static void Inverted_rotated_half_pyramid(int n){
        // outer loop
        for (int i = 1; i<=n ; i++){
            // inner loop
            for (int j =1 ; j <= n-i; j++){
                System.out.print(" ");
            }

            for (int k =1 ; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row you want :");
        int n = sc.nextInt();

        Inverted_rotated_half_pyramid(n);
        sc.close();

    }
    
}
