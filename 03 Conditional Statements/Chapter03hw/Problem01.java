import java.util.*;

public class Problem01 {
    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number :");
        float num = sc.nextFloat();

        if (num >= 0 ){
            System.out.println("The number is positive :" + num);
        }
        else{
            System.out.println("The number is negative :" + num);
        }
    }
    
}
