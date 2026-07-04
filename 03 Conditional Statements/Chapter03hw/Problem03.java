import java.util.*;

public class Problem03 {
    public static void main(String arg[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the days number in weeek :");
        int day = sc.nextInt();

        switch(day){
            case 1: System.out.println("to days day is monday :");
                                break;
            case 2: System.out.println("to days day is tuesday :");
                                break;
            case 3: System.out.println("to days day is wednesday");
                                break;
            case 4: System.out.println("to days day is tuseday ");
                                break;
            case 5: System.out.println("to days day is friday");
                                break;
            default : System.out.println("to days day is saturday");
        }


    }
    
}
