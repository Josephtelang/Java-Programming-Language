import java.util.*;

public class Creation_of_2D_array01{
    public static boolean print_index_for_key(int matrix[][],int key){
        for (int i =0 ; i< matrix.length ; i++){
            for (int j=0 ; j<matrix[0].length ; j++){
                if (matrix[i][j]== key){
                    System.out.println("Index is found at index :");
                    System.out.println("("+i+","+j+")");
                    return true;
                }
            }
        }
        return false;

    }
    public static void Create_2D_matrix(int matrix[][]){   // in java matrix can not start form digit
        Scanner sc = new Scanner(System.in);
        int n = matrix.length , m = matrix[0].length;
        for (int i = 0 ; i<n ; i++){
            for (int j =0 ; j<m ; j++){
                matrix[i][j] = sc.nextInt();

            }
        }
        sc.close();
    }

    public static void print_matrix(int matrix[][]){
        for (int i=0 ; i<matrix.length ; i++){
            for (int j=0 ; j< matrix[0].length ; j++){
                System.out.print(matrix[i][j]+" ");
                
            }
            System.out.println();
        }
    }

    public static void print_largest_and_smallest(int matrix[][]){
        int min_value = Integer.MAX_VALUE;
        int max_value = Integer.MIN_VALUE;

        for(int i=0 ; i<matrix.length ; i++){
            for(int j = 0 ; j<matrix[0].length ; j++){
                min_value = Math.min(min_value,matrix[i][j]);
                max_value = Math.max(max_value,matrix[i][j]);
            }
        }
        System.out.println("Maximum value in matrix is : "+max_value);
        System.out.println("Minimum value in matrix is : "+min_value);
    }
    public static void main(String arg[]){
        int matrix[][] = new int[3][3];
        int key = 6;

        Create_2D_matrix(matrix);
        System.out.println();
        print_matrix(matrix);
        System.out.println();
        print_index_for_key(matrix,key );
        System.out.println();
        print_largest_and_smallest(matrix);




    }
}