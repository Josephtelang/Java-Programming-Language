import java.util.Stack;

public class Valid_parentheses_01 {
    public static boolean isValid(String str){  // T.c = O(n)
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char currPar = str.charAt(i);
            
            if(currPar == '(' || currPar == '{' || currPar == '['){ // Opening parentheses
                s.push(currPar);
            }
            else{
                if(s.isEmpty()){ // for str ")))))"
                    return false;
                }
                if((s.peek() == '(' && currPar == ')') || (s.peek() == '{' && currPar == '}' ) || (s.peek() == '[' && currPar == ']')){
                    s.pop();
                }
                else{
                    return false;
                }
            }

            
        }
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String arg[]){
        String str = "({[]}())";
        System.out.println(isValid(str));

    }
    
}
