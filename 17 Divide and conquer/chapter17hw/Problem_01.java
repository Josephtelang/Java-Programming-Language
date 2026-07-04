package chapter17hw;
import java.util.*;

// Question1:Apply Merge sort to sort an array of Strings.
// (Assumethatallthecharactersinall the Strings are in lowercase). 
// (EASY)
// Sample Input 1: arr = { "sun", "earth", "mars", "mercury"}
// Sample Output 1: arr = { "earth", "mars", "mercury","sun"}

public class Problem_01 {
    public static void printArray(String arr[]){
        System.out.println(Arrays.toString(arr));
    }
    public static void merge_sort(String str[] , int si , int ei){
        if (si >= ei){
            return;
        }

        int mid = si + (ei - si)/2;

        merge_sort(str,si,mid);
        merge_sort(str,mid+1,ei);

        merge_using_compto(str,mid,si,ei);
    }

    public static void merge(String str[] , int mid , int si, int ei){
        String temp[] = new String[ei - si +1];
        int i = si;
        int j = mid + 1;
        int l = 0;

        while(mid>=i && ei>= j){
            if (str[i].length() >= str[j].length()){ 
                for(int k = 0 ; k<str[j].length() ; k++){
                    if (str[i].charAt(k) > str[j].charAt(k)){
                        temp[l] = str[j];
                        j++; l++;
                        break;
                    }
                    else if (str[i].charAt(k) < str[j].charAt(k)){
                        temp[l] = str[i];
                        i++; l++;
                        break;

                    }
                    else{
                        temp[l] = str[j];
                        j++ ; l++;
                        break;
                    }
                }
            }
            else{
                for(int k = 0 ; k<str[i].length() ; k++){
                    if (str[i].charAt(k) > str[j].charAt(k)){
                        temp[l] = str[j];
                        j++; l++;
                        break;
                    }
                    else if (str[i].charAt(k) < str[j].charAt(k)){
                        temp[l] = str[i];
                        i++; l++;
                        break;

                    }
                    else{
                        temp[l] = str[i];
                        l++; i++;
                        break;
                    }
                }

            }
        }
        while(mid>=i){
            temp[l] = str[i];
            i++; l++;
        }

        while(ei>=j){
            temp[l] = str[j];
            j++; l++;
        }

        for(l = 0 , i = si ;l<temp.length; l++ , i++){
            str[i] = temp[l];
        }
    }

    public static void merge_using_compto(String str[], int mid,int si , int ei){
        String temp[] = new String[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<= ei){
            if((str[i].compareTo(str[j]))<=0){  // if string is name it take there diference app.length - apple.length = -2
                temp[k++] = str[i++];
            }
            else{
                temp[k++] = str[j++];
            }
        }

        while(i<=mid){
            temp[k++] = str[i++];
        }

        while(j<=ei){
            temp[k++] = str[j++];
        }

        for(k= 0 , i=si; k<temp.length ; i++ , k++){
            str[i] = temp[k];
        }
    }
    public static void main(String arg[]){
        String str[]= { "sun", "earth", "mars", "mercury","apple"};
        merge_sort(str,0,str.length-1);
        printArray(str);


    }
    
}
