import java.util.*;

public class Tow_D_arrays {

    public static boolean search(int matrix[][],int key){
        for (int i =0 ; i<matrix.length ; i++){
            for ( int j=0 ; j<matrix[0].length ; j++){
                if (matrix[i][j] == key){
                    System.out.println("key is found at index : ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("key is not found ");
        return false;
    }

    public static void find_max_min(int matrix[][]){

        int min_number = Integer.MAX_VALUE;
        int max_number = Integer.MIN_VALUE;
        for (int i =0 ; i<matrix.length ; i++){
            for (int j=0 ; j<matrix[0].length ; j++){
                min_number = Math.min(matrix[i][j],min_number);
                max_number = Math.max(matrix[i][j],max_number);

            }
        }
        System.out.println("The max number is : "+max_number +","+" Ther min number is : "+min_number);
    }
    public static void main(String arg[]){
        int matrix[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);
        
        // input
        for (int i =0 ; i<matrix.length ; i++){
            for (int j=0 ; j<matrix[0].length ; j++){
                matrix[i][j] = sc.nextInt();

            }
        }

        // output
        for (int i =0 ; i<matrix.length ;i++){
            for (int j =0 ; j<matrix[0].length ; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        search(matrix,5);
        find_max_min(matrix);

        
        

    }
    
}
