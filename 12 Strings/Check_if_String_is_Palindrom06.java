public class Check_if_String_is_Palindrom06{
    public static boolean isPalindrom(String str){
        int n = str.length();
        for (int i=0 ; i<str.length() ;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;

            }
        }
        return true;
    }
    public static void main(String arg[]){
        String str = "racecar";

        System.out.println(isPalindrom(str));

    }
}