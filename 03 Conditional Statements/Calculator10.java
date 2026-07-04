import java.util.*;

public class Calculator10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a :");
        float a = sc.nextFloat();
        System.out.println("Enter b :");
        float b = sc.nextFloat();
        System.out.println("Enter Operator :");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+': System.out.println(a + b);
                        break;
            case '-': System.out.println(a-b);
                        break;
            case '*': System.out.println(a*b);
                        break;
            case '/': System.out.println(a/b);
                        break;
            case '%': System.out.println(a%b);
                        break;
            default : System.out.println("This calculation is out of mu range ");
                    
        }

        
    }
    
}
