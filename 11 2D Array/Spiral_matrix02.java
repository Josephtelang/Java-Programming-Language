public class Spiral_matrix02 {
    public static void Spiral_matrix(int matrix[][]){
        int col_start = 0 ;
        int col_end = matrix[0].length-1;
        int row_start = 0;
        int row_end = matrix.length-1;

        while(row_start<=row_end && col_start<=col_end){
            // top
            for (int j=col_start; j<=col_end; j++){
                System.out.print(matrix[row_start][j]+" ");
            }

            // right
            for (int i = row_start+1 ; i<=row_end; i++){
                System.out.print(matrix[i][col_end]+" ");
            }

            // bottom
            for (int j = col_end-1 ; j>=col_start; j--){
                if(row_start==row_end){
                    break;
                }
                System.out.print(matrix[row_end][j]+" ");
            }

            // left
            for (int i = row_end-1 ; i>=row_start+1 ; i--){
                if(col_start==col_end){
                    break;
                }
                System.out.print(matrix[i][col_start]+" ");
            }

            row_start++;
            col_start++;
            row_end--;
            col_end--;


        }
    }
    public static void main(String arg[]){
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12}};

        Spiral_matrix(matrix);
    
    
                        
    }
    
}
