public class myPractice14 {
    public static boolean isPalindrom(String str){
        int n = str.length();

        for (int i =0 ; i<n/2 ; i++){
            if (str.charAt(i)!=str.charAt(n-i-1)){
                return false;
                
            }
        }
     
        return true;

    }

    public static float Shortest_distance(String str){
        int x = 0 , y =0; 

        for (int i =0 ; i<str.length() ; i++){
            // North
            if (str.charAt(i)=='N'){
                y++;
            }

            // South
            else if (str.charAt(i)=='S'){
                y--;
            }

            // East

            else if (str.charAt(i) =='E'){
                x++;
            }

            // West

            else{
                x--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;

        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String arg[]){
        // String str = "racecar";
        // System.out.println(isPalindrom(str));

        // String str = "WNEENESENNN";
        // System.out.println(Shortest_distance(str));

        // String str = "joseph";
        // Substring(str, 0, 4);

        // String str[] = {"apple","mango","banana"};
        // Largest_string(str);

        // StringBuilder sb = new StringBuilder("");
        // for (char i='a' ; i<='z' ;i++){
        //     sb.append(i);

        // }
        // System.out.println(sb);

        // String str = "hey , my name is joseph";
        // make_uppercase(str);

        String str = "aaabbcccdd";
        Compression(str);








    }

    public static void Compression(String str){
        StringBuilder newstr = new StringBuilder();

        for (int i =0 ; i<str.length(); i++){
            int count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i ++;
            }
            newstr.append(str.charAt(i));
            if (count>1){
                newstr.append(count);
            }

        }
        System.out.println(newstr);
    }

    public static void make_uppercase(String str){
        StringBuilder newstr = new StringBuilder("");
        for (int i =0 ; i<str.length() ; i++){
            if (str.charAt(i)==' ' && i<str.length()-1){
                newstr.append(' '); 
                i++;
                newstr.append(Character.toUpperCase(str.charAt(i)));


            }
            else {
                newstr.append(str.charAt(i));
            }

        }
        System.out.println(newstr);
    }
    public static void Largest_string(String str[]){
        String largest =  str[0];
        for (int i =1 ; i<str.length; i++){
            if (largest.compareTo(str[i])<0){
                largest = str[i];
            }
        }
        System.out.println(largest);

    }

    public static void Substring(String str, int si , int ei){
        String substring = "";
        for (int i=si ; i<ei; i++){
            substring += str.charAt(i);
        }
        System.out.println(substring);
    }
    
}
