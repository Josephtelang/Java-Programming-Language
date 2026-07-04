public class Hollow_Rectangle_Pattern01{
    public static void hollow_rectangle(int total_rows, int total_col){
        // in rows 
        for (int i =1 ; i <= total_rows; i++){
            // in columns
            for (int j = 1 ; j <= total_col; j++){
                // -> (i,j)
                if(i == 1 || i == total_rows || j == 1 || j == total_col){
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String arg[]){
        hollow_rectangle(4,5 );

    }
}