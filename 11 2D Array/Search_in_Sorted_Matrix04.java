public class Search_in_Sorted_Matrix04 {
    public static boolean from_right_top_most_corner(int matrix[][], int key){
        int row = 0 , column = matrix[0].length-1;

        while (row < matrix.length && column>=0){
            if(matrix[row][column]==key){
                System.out.println("The key is found at : ("+row+","+column+")");
                return true;
            }
            else if (matrix[row][column]>key){
                column--;
            }
            else{
                row++;
            }

        }
        System.out.println("The key not found");
        return false;
    }

    public static boolean from_left_bottom_corner(int matrix[][],int key){
        int row = matrix.length-1, column = 0;

        while(row>=0 && column<matrix[0].length-1){
            if (matrix[row][column]==key){
                System.out.println("The key is found at : ("+row+","+column+")");
                return true;
            }
            else if (matrix[row][column]>key){
                row --;
            }
            else{
                column ++;
            }
        }
        System.out.println("The key not found");
        return false;
    }
    public static void main(String arg[]){
        int matrix[][] = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};

        int key = 32;

        from_right_top_most_corner(matrix,key);
        System.out.println();
        from_left_bottom_corner(matrix,key);

    }
    
}
