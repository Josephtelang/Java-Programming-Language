import java.util.*;

public class my_practice05{
    public static void Create_matrix(int matrix[][]){
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ; i < matrix.length ; i++){
            for (int j =0 ; j< matrix[0].length ; j++){
                matrix[i][j] = sc.nextInt();

            }
        }
        System.out.println();
    }

    public static void print_matrix(int matrix[][]){
        for (int i =0 ; i < matrix.length ; i++){
            for (int j=0 ; j< matrix[0].length ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void search_key(int matrix[][],int key){
        for (int i=0 ; i< matrix.length ; i++){
            for (int j=0 ; j< matrix[0].length ; j++){
                if (key == matrix[i][j]){
                    System.out.println("The key is found at index : ("+i+","+j+")");
                }

            }
        }
    }

    public static void print_maximum_and_minimum(int matrix[][]){
        int max_num = Integer.MIN_VALUE;
        int min_num = Integer.MAX_VALUE;

        for (int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix[0].length; j++){
                max_num = Math.max(max_num,matrix[i][j]);
                min_num = Math.min(min_num,matrix[i][j]);

            }
        }
        System.out.println("The maximum number in matrix is : "+max_num);
        System.out.println("The minimum number in matrix is : "+min_num);
    }
    public static void main(String[] args) {
        // int matrix[][] = new int[3][3];  
        // int key = 6; 

        
        // Create_matrix(matrix);
        // System.out.println();
        // print_matrix(matrix);
        // System.out.println();
        // search_key(matrix,key);
        // System.out.println();
        // print_maximum_and_minimum(matrix);

        // Spiral matrix
        // int matrix[][] = {{1,2,3,4},
        //                   {5,6,7,8},
        //                   {9,10,11,12}};

        // spiral_matrix(matrix);

        // diagonal matrix sum
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        // diagonal_sum_1(matrix);
        // System.out.println();
        // diagonal_sum_2(matrix);

        // search in sorted matrix

        int key = 11;

        Search_in_sorted_matrix_right_top(matrix, key);
        System.out.println();
        Search_in_sorted_matrix_left_bottom(matrix,key);

        
    }
    public static void spiral_matrix(int matrix[][]){
        int start_row = 0 , end_row = matrix.length-1;
        int start_col = 0 , end_col= matrix[0].length-1;

        while(start_row <= end_row && start_col <= end_col){
            
            //top boundary
            for (int j = start_col ; j<=end_col ; j++){
                System.out.print(matrix[start_row][j]+" ");
            }

            // right boundary
            for (int i = start_row+1 ; i<=end_row ; i++){
                System.out.print(matrix[i][end_col]+" ");
            }

            // bottom boundary
            for (int j = end_col-1 ; j>=start_col ; j--){
                if (start_row == end_row){
                    break;
                }
                System.out.print(matrix[end_row][j]+" ");
            }

            // left boundary
            for (int i = end_row -1 ; i>=start_row+1 ; i--){
                if (start_col == end_col){
                    break;
                }
                System.out.print(matrix[i][start_col]+" ");
            }

            start_row++;
            start_col++;
            end_row--;
            end_col--;
        }
    }

    public static void diagonal_sum_1(int matrix[][]){
        int sum = 0;
        for (int i=0 ; i<matrix.length ; i++){
            for (int j=0 ; j<matrix[0].length ; j++){
                if (i == j){
                    sum += matrix[i][j];
                }
                else if ((i+j)== matrix.length-1){
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("The diagonal sum with O(n^2) complexcity is : "+sum);
    }

    public static void diagonal_sum_2(int matrix[][]){
        int sum = 0;
        for (int i =0 ; i<matrix.length ; i++){
            sum += matrix[i][i];
            if(i!=matrix.length-1-i){
                sum += matrix[i][matrix.length-1-i];

            }

        }
        System.out.println("The diagonal sum with O(n) complexcity is : "+sum);
    }

    public static boolean Search_in_sorted_matrix_right_top(int matrix[][],int key){
        int row = 0 , col = matrix[0].length-1;

        while(row<matrix.length&& col>=0){
            if (key ==matrix[row][col]){
                System.out.println("The key is found at index : ("+row+","+col+")");
                return true;
            }
            else if (key > matrix[row][col]){
                row++;
            }
            else{
                col--;
            }

        }
        System.out.println("The key is not found ");
        return false;
    }

    public static boolean Search_in_sorted_matrix_left_bottom(int matrix[][],int key){
        int row=matrix.length-1, col= 0;

        while(row>=0 && col<matrix[0].length){
            if (key == matrix[row][col]){
                System.out.println("The key is found at index : ("+row+","+col+")");
                return true;
            }
            else if (key > matrix[row][col]){
                col++;
            }
            else{
                row--;
            }


        }
        System.out.println("The key is not found ");
        return false;

    }
}