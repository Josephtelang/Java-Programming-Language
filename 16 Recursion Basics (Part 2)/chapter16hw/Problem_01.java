package chapter16hw;
// Question1:For a given integer array of size N. You have to find all the occurrences (indices) 
// of a given element (Key) and print them .Use a recursive function to solve this problem.

// Sample Input: arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2},key = 2
// Sample Output: 1 5 7 8

public class Problem_01 {
    public static void find_indices(int n,int arr[],int key){
        if (n==arr.length){
            return;
        }

        if(arr[n]==key){
            System.out.print(n+" ");
            
        }


        find_indices(n+1, arr, key);
    }
    public static void main(String arg[]){
        int arr[] = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        find_indices(0, arr, key);

    }
    
}
 