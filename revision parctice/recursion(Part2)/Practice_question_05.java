import java.util.*;

public class Practice_question_05{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number : ");
        // int key = sc.nextInt();
        // int arr[]  = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        // int n = arr.length;
        // printAllOccurrences(arr,n,0,key);

        // String digits[] = {"zero","one", "two","three","four","five","six","seven","eight","nine"};
        // int num = 1947;
        // convertNumToString(num, digits);

        // System.out.println("Enter the string : ");
        // String str = sc.nextLine();
        // System.out.println(lengthOfString(str));

        // System.out.println("Enter the String for substrings : ");
        // String str = sc.nextLine();
        // System.out.println(countSubStringWithSameStartEndChar(str, 0));

        // movingDisks(3,"A","B","C");


        char s[] = {'h','e','l','l','o'};
        reverseString(s, 0, s.length-1);
        System.out.println(s);






    }

    public static void printAllOccurrences(int arr[] , int n , int idx,int key){
        //base case
        if(idx==n){
            return;
        }

        if(key == arr[idx] ){
            System.out.print(idx+" ");
        }

        printAllOccurrences(arr, n , idx+1, key);

    }

    public static void convertNumToString(int num , String digits[]){
        //base case
        if(num==0){
            return;
        }

        //kaam with recusive call
        int lastDigit = num % 10;
        int newNum = num/10;

        convertNumToString(newNum,digits);

        System.out.print(digits[lastDigit]+ " ");

    }

    public static int lengthOfString(String str){
        //base case
        if(str.length() == 0){
            return 0;
        }

        //kaam with recusive call 
        return 1+ lengthOfString(str.substring(1));


    }

    public static int countSubStringWithSameStartEndChar(String str1 , int i){
        if(i == str1.length()){
            return 0;
        }
        return countSubStringWithSameStartEndChar(str1,i+1) + countj( str1 ,i,i);
        

        

    }

    public static int countj(String str1, int i , int j){
        if(j == str1.length()){
            return 0;
        }

        if (str1.charAt(i) == str1.charAt(j)){
            return 1 + countj(str1, i,j+1);
        }
        else{
            return countj(str1,i,j+1);
        }

    }

    public static void movingDisks(int n , String rod_A, String rod_B, String rod_C){
        //base case
        if(n==0){
            return;
        }
        
        movingDisks(n-1,rod_A,rod_C,rod_B);   // B and C got exchanged here 
        System.out.println("Move disk "+n+" from dick "+rod_A+" to "+rod_C);
        movingDisks(n-1,rod_B,rod_A,rod_C);   // so because of exchange we have to write rod_B instead of rod_C


       



    }

    

    public static void reverseString(char s[],int left , int right){
        // base case
        if(left>=right){
            return;
        }

        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        reverseString(s,left+1,right-1);

    }
}