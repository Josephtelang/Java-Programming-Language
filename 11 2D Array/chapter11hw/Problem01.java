package chapter11hw;

// Question 1 :Print the number of 7’s that are in the 2d array.
// Example :
// Input - int[][] array = { {4,7,8},{8,8,7} };
// Output - 2

public class Problem01 {
    public static void print_num_times(int arr[][],int key){
        int sum = 0;

        for (int i=0 ; i<arr.length ; i++){
            for (int j =0 ; j<arr[0].length ; j++){
                if (arr[i][j]==key){
                    sum ++;
                }
            }
        }
        System.out.println("The numbers of "+key+" occured in matrix are : "+sum+"");
            
        
    }
    public static void main(String arg[]){
        int arr[][] = {{4,7,8},{8,8,7}};
        int key = 7;

        print_num_times(arr,key);

    }

    

}
