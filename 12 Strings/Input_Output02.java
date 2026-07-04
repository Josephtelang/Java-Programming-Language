import java.util.*;
public class Input_Output02 {
    public static void main (String arg[]){
        char arr[] = {'a','b','c','d'};
        String str = "abcd";
        String str2 = new String("xyz");

        // Strings are IMMUTABLE

        Scanner sc = new Scanner(System.in);
        String name;
        // name = sc.next();       //takes single word 
        // System.out.println(name);
        String name2 = sc.nextLine();
        System.out.println(name2);

    }
    
}
