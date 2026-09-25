package Practice_problem_10;
import java.util.*;

public class Lexicographically_smallest_string_of_lengthN_and_sumK_03 {
    public static StringBuilder lexicographically_smallest_string_of_lengthN_and_sumK_Wrong(int N, int K){ // wrong
        StringBuilder sb = new StringBuilder();
        for(char ch = 'z' ; ch >= 'a' ; ch--){
            int currCharInt = (ch + 1) - 'a';
            while(K >= currCharInt){
                sb.insert(0,ch);
                K -= currCharInt ;
            }
        }
        return sb;
    }

    public static void lexicographically_smallest_string_of_lengthN_and_sumK(int N , int K){
        StringBuilder resultStr = new StringBuilder("a".repeat(N));
        int extra = K - N; // resultStr = [a,a,a,a,a] for N = 5
        
        if(N > K || N*26 < K){
            System.out.println("invalid input");
            return;
        }

        for(int i=N-1 ; i>=0 ; i--){
            if(extra > 0){
                int take = Math.min(extra,25);
                resultStr.setCharAt(i,(char)( 'a' + take));
                extra -= take;
            }
        }

        System.out.println(resultStr);
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 'N' lenght of result String : ");
        int N = sc.nextInt();
        System.out.println("Enter the 'K' sum of all character in result String : ");
        int K = sc.nextInt();

        lexicographically_smallest_string_of_lengthN_and_sumK(N,K);
    }
    
}
