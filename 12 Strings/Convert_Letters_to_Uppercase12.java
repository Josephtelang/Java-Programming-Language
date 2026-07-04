public class Convert_Letters_to_Uppercase12 {
    public static String toUppercase(String str){
        StringBuilder sb = new StringBuilder("");

        sb.append(Character.toUpperCase(str.charAt(0)));

        for (int i =1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i< str.length()-1){
                sb.append(' ');
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();

    }
    public static void main(String arg[]){
        String str = "hey , i am JOSEPH ";
        System.out.println(toUppercase(str));
    }
    
}
