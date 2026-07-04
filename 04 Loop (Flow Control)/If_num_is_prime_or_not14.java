import java.util.*;

public class If_num_is_prime_or_not14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number :");
        int  n = sc.nextInt();
        
        if (n==2){
            System.out.println(n+" is the prime number");
        }
        else{
            
            boolean is_prime = true;
            for (int i = 2; i<=Math.sqrt(n);i++){
                if(n%i==0){              //n is the mutiple of i (i is not 1 or n)
                    is_prime = false;

                }
            }
            if (is_prime==true){
                System.out.println(n+" is prime number");
            }
            else{
                System.out.println(n+" is not prime number");
            }
            sc.close();
        }
        
    }
    
}
