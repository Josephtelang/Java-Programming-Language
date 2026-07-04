package chapter12hw;
import java.util.*;

// Question1:Count how many times lowercase vowels occurred in a String entered by the user.

public class Problem01 {
    public static void count_vowels(String str){
        int count =0;
        for (int i =0 ; i<str.length() ; i++){
            if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                count ++;
            }
        }
        System.out.println("The total numbers of vowels in the string are : "+count);
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String str = sc.nextLine();

        count_vowels(str);
        



    }
    
}
