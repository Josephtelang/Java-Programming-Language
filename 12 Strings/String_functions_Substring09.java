public class String_functions_Substring09 {
    public static String Print_Substring(String str ,int si ,int ei){
        String Substring = "";
        for (int i = si ; i<ei ; i++){
            Substring += str.charAt(i);
        }
        return Substring;

    }
    public static void main(String arg[]){
        String str = "Hello World";
        
        System.out.println(str.substring(0,5));
        // System.out.println(Print_Substring(str, 0, 5));


    }
    
}
