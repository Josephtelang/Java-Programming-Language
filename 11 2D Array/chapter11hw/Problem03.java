package chapter11hw;
import java.util.Arrays;

// Question 3 :Write a program to Find Transpose of a Matrix.
// What is Transpose?
// Transpose of a matrix is the process ofswapping therows to columns. For a 2x3 matrix,

// Matrixa11    
// a11    a12    a13 
// a21    a22    a23

// Transposed Matrixa11    
// a11    a21
// a12    a22
// a13    a23

public class Problem03 {
    public static void matrix_transpose(String matrix[][]){
        int rows = matrix.length , cols = matrix[0].length;
        String matrixs_transpose[][] = new String[cols][rows];

        for (int i =0 ; i < rows ; i++){
            for (int j=0 ; j < cols ; j++){
                matrixs_transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("The transpose of matrix :");
        System.out.println(Arrays.deepToString(matrix));
        System.out.println("is : ");
        System.out.println(Arrays.deepToString(matrixs_transpose));
    }
    public static void main(String arg[]){
        String matrix[][] = {{"a11","a12","a13"},
                            {"a21","a22","a23"}};

        matrix_transpose(matrix);
    }
    
}
