package chapter13hw;
import java.util.*;

// Question 4 :This question is based on a trick, pleasedirectly look at the solution.
// Convert uppercase characters to lowercase using bits.

public class Problem04 {
    public static char uppercase_to_lowercase(char ch){
        int bitmask = 32;
        return (char)(ch | bitmask);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Uppercase character : ");
        char ch = sc.next().charAt(0);

        System.out.println("The lowercase character was "+ch+" and uppercase character is : "+uppercase_to_lowercase(ch));
    }
    
}
