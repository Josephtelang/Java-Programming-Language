import java.util.*;

public class Print_increasing_02 {
    public static void printIncre(int n){
        if (n==1){
            System.out.print(n+" ");
            return;
        }
        printIncre(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();

        printIncre(n);

    }
    
}
