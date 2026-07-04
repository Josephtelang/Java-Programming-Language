package chapter12hw;
import java.util.*;

// Question 4 :Determine if 2 Strings areanagramsof each other.What are anagrams?
// If two strings contain the same characters but in a different order,they can be said to be anagrams. Consider race and care.
// In this case,race's characters can be formed in to a study,or care's characters can be formed into race.
// Below is a javaprogram to check if two strings are anagrams or not.

public class Problem04 {
    public static boolean isAnagrams(String str1 , String str2 ){
        if (str1.length()!= str2.length()){
            System.out.println("String "+str1+" and "+str2+" are not anagrams");
            return false;
        }
        
        String temp = str2;
        int count = 0 ;
        for (int i = 0 ; i<str1.length() ; i++){
            for (int j=0 ; j<str2.length() ; j++){
                if (str1.charAt(i) == str2.charAt(j)){
                    count ++;
                    str2 = str2.replaceFirst(String.valueOf(str2.charAt(j))," ");
                    break;
                }

            }

        }
        if (count == str1.length()){
            System.out.println("String "+str1+" and "+temp+" are anagrams");
            return true;

        }

        System.out.println("String "+str1+" and "+temp+" are not anagrams");
        return false;

        
    }

    public static void isAnagrams_sorting(String str1 , String str2){

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length()==str2.length()){
            char char_array1[] = str1.toCharArray();
            char char_array2[] = str2.toCharArray();

            Arrays.sort(char_array1);
            Arrays.sort(char_array2);

            if (Arrays.equals(char_array1,char_array2)){
                System.out.println("The str1 and str2 are anagrams ");
            }
            else{
                System.out.println("The str1 and str2 are not anagrams");
            }

        }
        else{
            System.out.println("The str1 and str2 are not anagrams");
        }

    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st String : ");
        String str1 = sc.nextLine();

        System.out.println("Enter the 2nd String : ");
        String str2 = sc.nextLine();

        // isAnagrams(str1,str2);

        isAnagrams_sorting(str1, str2);



    }
    
}
