public class StringBuilder11 {
    public static void main(String arg[]){
        StringBuilder str = new StringBuilder("");
        for (char ch = 'a' ; ch<='z' ; ch++){
            str.append(ch);
        }
        System.out.println(str.length());
    }
    //O(n)
    
}
