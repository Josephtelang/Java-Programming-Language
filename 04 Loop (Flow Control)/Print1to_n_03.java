import java.util.*;

public class Print1to_n_03 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int count = 0;

        while(count<=range){
            System.out.print(count + " ");
            count++;
        }
        System.out.println("\n"+range +" number has been printed");
        sc.close();
    }
    
}
