package chapter16hw;

public class Problem_04 {
    public static void printString(String str, int si , int ei,int count){
        int n = str.length();

        if (si==n){
            System.out.print(count);
            return;
            
            
        }
        
        
        if (ei< n){
            
            if ( str.charAt(si)==str.charAt(ei)){
                System.out.println(str.substring(si,ei+1));
                count ++;
                
            }
            printString(str,si,ei+1,count);
        }

        else{
            printString(str,si+1,si+1,count);

        }

    
    }
    public static void main(String arg[]){
        String str = "abcab";
        printString(str, 0, 0,0);

    }
    
    
}