// Display all numbers entered by user except mulitples of 10
import java.util.*;

public class Que_continue13 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter the number :");
            int n = sc.nextInt();

            if(n%10==0){
                continue;
            }

            System.out.println(n);
        }while(true);

        
    }
    
}
