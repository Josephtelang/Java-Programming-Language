package chapter16hw;

// Question 2 :You are given a number (eg -  2019), convert it into a String of english like“two 
// zero one nine”.  Use a recursive function to solve this problem.
// NOTE-The digits of the number will only be in the range 0-9 and the last digit of anumber can’t be 0.

// Sample Input: 1947
// Sample Output: “one nine four seven”

public class Problem_02 {
    static String map[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    static void convert_String(int num,String str){
        if(num == 0 ){
            System.out.println(str);
            return ;
        }

        int last_digit = num%10;
        int update_num = num/10;

        convert_String(update_num, map[last_digit]+" "+str);


    }
    public static void main(String[] args) {
        
        convert_String(1230,"");
    }
    
}
