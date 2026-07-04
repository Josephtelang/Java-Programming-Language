import java.util.*;

public class Syntax_with_Parameters02 {
    public static void printhelloworld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static int Calculater(int num1, int num2){ //Parameters or Formal Parameters
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = Calculater(a,b); //Arguments or Actual Parameters

        System.out.println("Sum of a and b :"+sum);

        sc.close();



    }
    
}
