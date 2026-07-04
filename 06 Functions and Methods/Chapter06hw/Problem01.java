import java.util.*;
// Question 1 :Write a Java method to compute the averageof three numbers..

public class Problem01 {

    public static float average(int num1, int num2, int num3){
        float average = (num1+num2+num3)/3;

        return average;
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter any three numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(average(a,b,c));

        sc.close();


    }
}
