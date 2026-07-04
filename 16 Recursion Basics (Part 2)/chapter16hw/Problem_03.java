package chapter16hw;

// Question 3 :Write a program to findLength of aStringusing Recursion.

public class Problem_03 {
    public static int length(String str){
        if (str.length()==0){
            return 0;
        }

        return length(str.substring(1))+1;
    }
    public static void main(String arg[]){
        System.out.println("The length of the String is : "+length("joseph"));

    }
    
}
