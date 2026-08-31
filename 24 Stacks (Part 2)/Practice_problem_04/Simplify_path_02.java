package Practice_problem_04;
import java.util.Stack;
public class Simplify_path_02 {
    public static StringBuilder simplifyPath(String strPath){
        Stack<String> s = new Stack<>();
        String arrPath[] = strPath.split("/");
        for(int i=1 ; i<arrPath.length ; i++){
            
            if(arrPath[i].equals("..")){
                if(s.isEmpty()){
                    continue;
                }
                s.pop();

            }
            else if(arrPath[i].equals("") || arrPath[i].equals(".")){
                continue;
            }
            else{
                s.push(arrPath[i]);
            }
        }
        StringBuilder resultPath = new StringBuilder();
        Stack<String> revStack = new Stack<>();
        if(s.isEmpty()){
            return resultPath.append("/");
        }
        while(!s.isEmpty()){
            revStack.push(s.pop());
        }
        while(!revStack.isEmpty()){
            resultPath.append("/");
            resultPath.append(revStack.pop());
        }
        return resultPath;
    }
    public static void main(String arg[]){
        String strPath = "/a//b";
        System.out.println(simplifyPath(strPath));
    }
    
}
