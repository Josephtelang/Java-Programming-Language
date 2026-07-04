import java.util.*;

public class Inverted_Half_Pyramid_with_Numbers03 {
    public static void inverted_half_pyramid_withnumbers(int n){
        for (int i = 1 ; i<=n ; i++){
            for (int j = 1 ; j<=n-i+1 ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number of row you want :");
        int n = sc.nextInt();

        inverted_half_pyramid_withnumbers(n);
        sc.close();

    }
    
}
