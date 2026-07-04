import java.util.*;

public class JavaType_casting07 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        int b = (int) a;

        System.out.println(b);


        char ch = 'a';
        int number1 = ch;
         
        char ch1 = 'b';
        int number2 = ch1;

        System.out.println(number1);
        System.out.println(number2);
        


        sc.close();
    }
    
}
