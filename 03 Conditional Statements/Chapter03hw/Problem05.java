import java.util.*;

public class Problem05 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year :");
        long year = sc.nextInt();

        if (year%400 == 0){
            System.out.println("The "+year+" is a leap year");
        }
        else if (year%100 ==0){
            System.out.println("The "+year+" is not a leap year");
        }
        else if (year%4==0){
            System.out.println("The "+year+" is a leap year");
        }
        else{
            System.out.println("The "+year+" is not a leap year");
        }
    }

    
}
