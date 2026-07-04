import java.util.*;
public class Strings {
    public static void main(String arg[]){
        // char arr[] = {'a','b','c','d'};
        // String str = "abcd";
        // String str1 = new String("xyz");

        // // Strings are immutable

        // Scanner sc = new Scanner(System.in);
        // String name ;  
        // name = sc.next();
        // System.out.println(name);
        // sc.nextLine();
        // name = sc.nextLine();
        // System.out.println(name);


        // String fullname;
        // fullname = sc.nextLine();
        // System.out.println(fullname.length());

        // concatination
        String first_name = "joseph";
        String last_name = "telang";
        // String full_name = first_name+" "+last_name;
        // System.out.println(full_name);

        // // accessing characters from string
        // System.out.println(first_name.charAt(0));
        // print_letters(full_name);

        // System.out.println(first_name.substring(0,5));

        // String str3[] = {"apple","mongo","banana"};
        // String largest_string = str3[0];
        // for (int i=0 ; i<str3.length ; i++){
        //     if (largest_string.compareToIgnoreCase(str3[i])<0){
        //         largest_string = str3[i];
        //     }
        // }

        // System.out.println("The largest string is : "+largest_string);


        // StringBuilder sb = new StringBuilder("");
        // for (char i = 'a' ; i<='z' ; i++){
        //     sb.append(i);
        // }

        // System.out.println(sb);

        // String str4 = "hello WORLD";

        // System.out.println("The each letter as first char as uppercase :"+toUpperCase(str4));

        String str5 = "aaaabbbcccdd";
        System.out.println("The compressed string of the given string is : "+stringCompressor(str5));







    }
    public static String stringCompressor(String str){
        StringBuilder sb = new StringBuilder("");
        int count ;
        for (int i=0 ; i<str.length() ; i++){
            count = 1;
            sb.append(str.charAt(i));
            // i++;
            while( i<str.length()-1&& str.charAt(i+1) == str.charAt(i)){
                count++;
                i++;

            }
            if (count >1){
                sb.append(count);
            }
            

        }
        return sb.toString();
    }

    public static String toUpperCase(String str){
        StringBuilder sb  = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i =1 ; i<str.length() ; i++){
            if (str.charAt(i)==' ' && i< str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void print_letters(String name){
        for (int i =0 ; i<name.length();i++){
            System.out.print(name.charAt(i)+" ");
        }
    }

    
}
