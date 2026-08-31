package Backtracking;

public class Find_permutations_03 {
    public static void findPermutations(String str , String ans){
        // base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        // kaam (recursion - O(n*n!))
        for (int i=0 ; i<str.length() ; i++){
            char curr = str.charAt(i);
            // "abcde" = "ab" + "de" = "abde"
            String newStr =  str.substring(0,i) + str.substring(i+1);
            findPermutations(newStr,ans+curr);

        }
    }
    public static void main(String arg[]){
        findPermutations("abc","");

    }
    
}
