import java.util.*;

class Print_files_in_decreasing_order_01{
    public static void decreasing_order(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        decreasing_order(n-1);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");

        int n = sc.nextInt();

        decreasing_order(n);
    }
}