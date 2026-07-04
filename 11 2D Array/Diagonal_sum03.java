public class Diagonal_sum03 {
    public static int Diagonal_sum_1(int matrix[][]){
        int sum = 0;
        for (int i = 0 ; i<matrix.length ; i++){
            for (int j = 0 ; j<matrix.length ; j++){
                if(i==j){
                    sum += matrix[i][j];
                }
                else if ((i+j)==matrix.length-1){
                    sum += matrix[i][j];
                }

            }
        }
        return sum;
    }

    public static int Diagonal_sum_2(int matrix[][]){
        int sum = 0;
        for (int i =0 ; i<matrix.length ; i++){
            sum += matrix[i][i];
            if(i!=matrix.length-1-i){
                sum += matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String arg[]){
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};

        System.out.println("This diagonal sum is with O(n^2) complexcity : "+Diagonal_sum_1(matrix));
        System.out.println();
        System.out.println("This diagonal sum is with O(n) complexcity : "+Diagonal_sum_2(matrix));

    }
    
}
