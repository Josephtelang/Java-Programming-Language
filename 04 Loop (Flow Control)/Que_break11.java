// Keep entering the number till use enters a number of 10
import java.util.*;

public class Que_break11 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
    
        do{
            System.out.print("Enter the number :");
            int n = sc.nextInt();
            if (n%10==0){
                break;
            }
            System.out.println(n);
        }while(true);
        sc.close();
    }

        
}
    

