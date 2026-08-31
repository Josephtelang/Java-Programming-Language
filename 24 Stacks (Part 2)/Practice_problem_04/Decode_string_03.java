package Practice_problem_04;

import java.util.Stack;

public class Decode_string_03 {
    public static StringBuilder decodeString(String str){
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> prevStrStack = new Stack<>();
        StringBuilder currString = new StringBuilder("");
        int number = 0;
        for(int i=0 ; i<str.length() ;i++){
            
            
            while(str.charAt(i) != '['&& str.charAt(i) != ']' && !Character.isDigit(str.charAt(i))){
                currString = currString.append(str.charAt(i));
                i++;
            }
            while(str.charAt(i)!= '[' && str.charAt(i)>='0' && str.charAt(i)<='9'){
                number = number * 10 + (str.charAt(i) - '0');
                i++;
            }
            
            if(str.charAt(i) == '['){
                countStack.push(number);
                prevStrStack.push(currString);
                currString = new StringBuilder("");
                number = 0;
            }
            else if (str.charAt(i) == ']'){
                int count = countStack.pop();
                StringBuilder previous = prevStrStack.pop();
                StringBuilder newCurrString = new StringBuilder("");
                for(int j=0 ; j<count ; j++){
                    newCurrString.append(currString);
                }
                currString = previous.append(newCurrString);
            }
        
        }

        return currString;
    }

    public static StringBuilder decodeStringPerfect(String str){
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> prevStrStack  = new Stack<>();
        int number = 0;
        StringBuilder currString = new StringBuilder();

        for(int i=0 ; i<str.length() ; i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                number = number * 10 + (ch - '0');
            }
            else if(ch == '['){
                prevStrStack.push(currString);
                countStack.push(number);
                currString = new StringBuilder();
                number = 0;
            }
            else if(ch == ']'){
                int count = countStack.pop();
                StringBuilder prevStr = prevStrStack.pop();
                StringBuilder newCurrStr = new StringBuilder();
                for(int j = 0 ; j<count ; j++){
                    newCurrStr.append(currString);
                }
                currString = prevStr.append(newCurrStr);
            }
            else{
                currString.append(ch);
            }
        }
        return currString;
    }
    public static void main(String arg[]){
        String str = "3[b2[v]c]";
        System.out.println(decodeString(str));
        System.out.println(decodeStringPerfect(str));
    }
    
}
