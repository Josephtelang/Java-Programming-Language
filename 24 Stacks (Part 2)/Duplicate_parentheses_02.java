import java.util.Stack;

public class Duplicate_parentheses_02{
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0 ; i<str.length() ;i++){
            char currChar = str.charAt(i);
            
            //Closing 
            int counter = 0;
            if(currChar == ')'){
                while(s.peek() != '('){  
                    s.pop();
                    counter++;   
                }
    
                if(counter < 1){
                    return true;  // duplicate pair detected
                }
                else{
                    s.pop(); // remove '(' opening pair
                }
            }
            else{
                // push opening -> parentheses '(' , operands ('a','b','c') , operators ('*','+','-') 
                s.push(currChar);
            }


        }

        return false; // there is no duplicate pair
    }
    public static void main(String arg[]){
        String str = "((a+b))";
        String str2 = "(a-b)";
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str2));

    }
    
}
