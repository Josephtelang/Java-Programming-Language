public class problem_2D_arrays{
    public static void main(String arg[]){
        int arr[][] = { {4,7,8},{8,8,7} };

        int arr2[][] = { {1,4,9},{11,4,3},{2,2,3} };

        print_no_of_7s(arr,7);
        print_second_row_sum(arr2);
    }

    public static void print_no_of_7s(int arr[][], int target){
        int n = arr.length-1;
        int m = arr[0].length-1; 
        int count = 0;

        for (int i =0 ; i<= n ; i++){
            for ( int j = 0 ; j<= m ; j++ ){
                if (target == arr[i][j]){
                    count ++;
                }
            }
        }

        System.out.println(count);

    }

    public static void print_second_row_sum(int arr2[][]){
        int n = arr2.length-1;
        int m = arr2[0].length-1;
        int sum = 0; 


        int row = 1;

        for (int col =0 ; col<=m ; col++){
            sum += arr2[row][col];
        }
        // for (int i = 0 ; i<=n ; i++){
        //     for ( int j=0 ;m>=j ; j++){
        //         if (i == 1){
        //             sum += arr2[i][j];
        //         }
        //     }
        // }

        System.out.println(sum);
    }
}