import java.util.Stack;
import java.util.Scanner;

public class Reverse_string_using_stack_05{
    public static StringBuilder reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0 ;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return result;

    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to revers : ");
        String str = sc.nextLine();
        System.out.println(reverseString(str));


    }
    
}
