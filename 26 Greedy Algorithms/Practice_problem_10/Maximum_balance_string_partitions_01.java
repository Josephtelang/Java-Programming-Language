package Practice_problem_10;
import java.util.*;

public class Maximum_balance_string_partitions_01 {
    public static void maximumBalanceStringPartitions(String str){
        StringBuilder sb = new StringBuilder("");
        ArrayList<StringBuilder> resultStr = new ArrayList<>();

        int count = 0 ; 

        for(int i=0 ; i<str.length() ; i++){
            char currChar = str.charAt(i);
            if(currChar == 'L'){
                sb.append(currChar);
                count++;
            }
            else if(currChar == 'R'){
                sb.append(currChar);
                count--;
            }
            
            if(count == 0 ){
                resultStr.add(sb);
                sb = new StringBuilder("");
            }
        }
        System.out.println(resultStr);
        System.out.println(resultStr.size());
    }
    public static void main(String arg[]){
        String str = "LRRRRLLRLLRL";
        maximumBalanceStringPartitions(str);

    }
    
}
