package Practice_problems_09;
import java.util.Scanner;
import java.util.Arrays;
public class Knight_tour_03 {
    public static boolean knightTour(int movesBoard[][], int row , int col, int rowMoves[], int colMoves[] , int totalMoves  ){
        
        
        // base case
        if((movesBoard.length * movesBoard.length) == totalMoves){
            // countSolutions++;
            printMoves(movesBoard);
            return true;
        }
        // for boundari cases
        if(row >= movesBoard.length || row < 0 || col >= movesBoard.length || col<0){
            return false;
        }
        
        
        // for already visited
        if(movesBoard[row][col] != -1){
            return false;
        }
        movesBoard[row][col] = totalMoves ;
        for (int i =0 ; i<colMoves.length ; i++){
            if(knightTour(movesBoard,row + rowMoves[i] , col + colMoves[i],rowMoves,colMoves,totalMoves+1)){
                return true;
            }
        }
        movesBoard[row][col] = -1;
        return false;

    }
    // static int countSolutions = 0;

    public static void printMoves(int movesBoard[][]){
        // System.out.println("----------print solution "+countSolutions+" ------------");
        for(int i=0 ; i< movesBoard.length ; i++){
            for(int j =0 ; j<movesBoard[0].length ;j++){
                System.out.print(movesBoard[i][j] + " ");

            }
            System.out.println();
        }
    }

    
    
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int movesBoard[][] = new int[n][n];
        for( int i = 0 ; i<movesBoard.length ; i++){
            Arrays.fill(movesBoard[i],-1);
        }
        
        int rowMoves[] = {2,2,1,-1,-2,-2,1,-1};
        int colMoves[] = {1,-1,2,2,1,-1,-2,-2};

        System.out.println(knightTour(movesBoard,0,0,rowMoves,colMoves,0));





    }
    
}
