import java.util.*;

public class Floyds_Triangle_Pattern04 {

    public static void Floyds_Tringle(int n){
        int counter = 1;
        // Outer loop
        for (int i =1 ; i <= n; i++){
            for (int j = 1 ; j <= i ; j ++){
                System.out.print(counter + " ");
                counter ++;
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want :");
        int n = sc.nextInt();

        Floyds_Tringle(n);
        sc.close();

    }
    
}
