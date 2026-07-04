import java.util.*;

public class String_problems {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first string : ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second string : ");
        String str2 = sc.nextLine();
        System.out.println(OptimizeDetermineAnagrams(str1, str2));


        System.out.println("The number of lower case vowels are : "+countLowerVowels(str1));
        
    }
    public static int countLowerVowels(String str){
        int count =0;

        for(int i =0 ; i<str.length() ; i++){
            if (str.charAt(i) == 'a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                count ++;
            }
        }
        return count;
    }

    public static boolean determineAnagrams(String str1 , String str2){
        int n = str1.length();
        int count = 0 ;
        if (n == str2.length()){
            
            for(int i=0 ; i<n ; i++){
                int m = str2.length();
    
                for(int j=0 ; j<m ; j++){
                    if(str1.charAt(i)==str2.charAt(j)){
                        str2 = str2.substring(0,j) + str2.substring(j+1,m);
                        count++;
                        break;
                    }
                }
            }
            
        }
        
        if(count == n){
            return true;
        }
        
        return false;
            
    }

    public static boolean OptimizeDetermineAnagrams(String str1, String str2){

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length()== str2.length()){
            char str1charArray[] = str1.toCharArray();
            char str2charArray[] = str2.toCharArray();

            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            return Arrays.equals(str1charArray,str2charArray);

        }
        return false;
    }
    
}
