import java.util.*;

public class Array_Input_output02 {
    public static void main(String arg[]){
        Scanner sc = new Scanner (System.in);

        int marks[] = new int[50];

        System.out.print("Enter your phy marks :");
        marks[0] = sc.nextInt();

        System.out.print("Enter your che marks :");
        marks[1] = sc.nextInt();

        System.out.print("Enter your math marks :");
        marks[2] = sc.nextInt();

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        marks[0] = marks[0] + 1;

        System.out.println(marks[0]);

        int percentage =  (marks[0] + marks[1] + marks[2])/3;

        System.out.println("The percentage "+percentage+"%");

        System.out.println("lenth of array :"+marks.length);

        sc.close();
        
    }
    
}
