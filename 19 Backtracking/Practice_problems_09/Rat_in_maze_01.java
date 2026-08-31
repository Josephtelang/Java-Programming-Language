package Practice_problems_09;
import java.util.Arrays;


public class Rat_in_maze_01 {
    public static void ratInMaze(int maze[][], int row , int col , int n ,StringBuilder str,boolean visited[][]){
        // base case
        if(row == n-1 && col == n-1){
            System.out.println(str);
            printArr(visited);
            
            return;
        }
        else if(row ==n || col== n || row <0 || col<0){
            return;

        }

        if(maze[row][col]==0 || visited[row][col]==true){
            return;
        }

        visited[row][col] = true;
        
        // move right
        str.append("R");
        ratInMaze(maze,row,col+1,n,str,visited);
        str.deleteCharAt(str.length()-1);

        // move left
        str.append("L");
        ratInMaze(maze,row,col-1,n,str,visited);
        str.deleteCharAt(str.length()-1);

        // move down
        str.append("D");
        ratInMaze(maze,row+1,col,n,str,visited);
        str.deleteCharAt(str.length()-1);

        // move up
        str.append("U");
        ratInMaze(maze,row-1,col,n,str,visited);
        str.deleteCharAt(str.length()-1);

        visited[row][col] = false;

        

        

    }

    public static void printArr(boolean maze[][]){
        for(int i=0 ; i<maze.length ; i++){
            for(int j=0 ; j<maze.length ; j++){
                System.out.print(maze[i][j]+" ");
            }
            System.out.println();
        }
    }


    

    public static void main(String arg[]){
        StringBuilder str = new StringBuilder("");
        int maze[][] = { { 1, 0, 0, 0 },
                        { 1, 1, 0, 1 },
                        { 0, 1, 0, 0 },
                        { 1, 1, 1, 1 } };

        boolean visited [][] = new boolean[maze.length][maze.length];

        ratInMaze(maze,0,0,maze.length,str,visited);
        

    }
    
}
