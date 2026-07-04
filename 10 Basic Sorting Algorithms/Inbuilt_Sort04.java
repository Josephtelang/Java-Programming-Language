import java.util.*;
public class Inbuilt_Sort04 {
    public static void print_sorted_array(Integer arr[]){
        for (int i = 0; i<arr.length; i++ ){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static int comparetor(int a , int b){
        //a>b == +ve
        //a==b == 0
        //a<b == -ve
        return a-b;
    }
    public static void main(String arg[]){
        Integer arr[] = {5,4,1,3,2};
        // Arrays.sort(arr);
        // print_sorted_array(arr);

        // Arrays.sort(arr,0,3);
        // print_sorted_array(arr);

        // Arrays.sort(arr,Collections.reverseOrder());
        // print_sorted_array(arr);

        Arrays.sort(arr,1,3,Collections.reverseOrder());
        print_sorted_array(arr);


        
    }
    
}
