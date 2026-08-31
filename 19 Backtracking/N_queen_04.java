

public class N_queen_04 {
    public static boolean isSafe(String board[][] , int row , int col){
        // Vertical up 
        for(int i = row -1 ; i>= 0 ; i--){
            if(board[i][col] == "Q") {
                return false;
            }
        }

        // Daigonaly left
        for(int i = row -1 , j = col -1 ; i>= 0 && j>=0 ; i-- , j--){
            if(board[i][j]== "Q"){
                return false;
            }
        }

        // Diagonaly right
        for(int i = row -1 , j = col +1 ; i>=0 && j<board[0].length ; i-- , j++){
            if(board[i][j]== "Q"){
                return false;
            }
        }

        return true;
    }
    public static void nQueens(String board[][], int row){
        // base case
        if(row == board.length){
            printBoard(board);
            return;
        }

        for(int j =0 ; j<board[0].length ; j++){
            if(isSafe(board,row,j)){
                board[row][j]= "Q";
                nQueens(board,row+1);
                board[row][j] = "x";
                
            }
        }



    }

    public static void printBoard(String board[][]){
        System.out.println("-------- chess board --------");
        for(int i = 0 ; i< board.length ; i++){
            for (int j = 0 ; j< board[0].length ; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String arg[]){
        int n = 4;
        String board[][] = new String[n][n];
        for (int i = 0 ; i<board.length; i++){
            for(int j =0 ; j<board.length; j++){
                board[i][j] = "x";
            }
        }

        nQueens(board,0);

    }
    
}
