package Practice_problems_09;
import java.util.Scanner;

public class Key_pad_combinations_02 {
    public static void keyPadCombinations(String map[] , String result , String digits){
        // base case
        if(result.length() == digits.length()){
            System.out.println(result);
            return;
        }
        
        // kaam
        int currDigit = digits.charAt(result.length()) - '0';
        for (int i = 0 ; i<map[currDigit].length() ; i++){
            keyPadCombinations(map,result + map[currDigit].charAt(i),digits );
        }

    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String digits = sc.nextLine();

        String map[] =  {
                        "",      // 0
                        "",      // 1
                        "abc",   // 2
                        "def",   // 3
                        "ghi",   // 4
                        "jkl",   // 5
                        "mno",   // 6
                        "pqrs",  // 7
                        "tuv",   // 8
                        "wxyz"   // 9
                    };

        keyPadCombinations(map,"",digits);
    }
    
}
