package chapter11hw;
import java.util.*;

// Question 2 :Print out the sum of the numbers in the second row of the “nums” array.
// Example :
// Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
// Output - 18

public class Problem02 {
    public static void print_sum_of_row(int num[][]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row 1 to "+num.length+" you want sum of : ");
        int row = sc.nextInt() - 1;
        int sum = 0;
        if (row<0 || row>= num.length){
            System.out.println("Invalid row number");
            sc.close();
            return;
        }

        
        // for (int i=0 ; i<num.length ; i++){
        //     for (int j=0 ; j<num[0].length ; j++){
        //         if (i==row){
        //             sum += num[i][j];
        //         }
        //     }
        // }


                        // Or

        for (int j =0 ;j< num[0].length ; j++){
            sum += num[row][j];

        }
        System.out.println("The sum of the row number "+row + 1+" is : "+sum+"");
        sc.close();



    }
    public static void main(String arg[]){
        int nums[][] = {{1,4,9},{11,4,3},{2,2,3}};

        print_sum_of_row(nums);


    }
    
}
