public class Shortest_Path07 {
    public static float GetShortestPath(String path){
        int x =0 ,y = 0 ;

        for (int i=0 ; i<path.length();i++){
            // North
            if (path.charAt(i)=='N'){
                y++;
            }

            // South
            else if (path.charAt(i)=='S'){
                y--;
            }

            // East
            else if (path.charAt(i)=='E'){
                x++;
            }

            // West
            else{
                x--;
            }

        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String arg[]){
        String path = "WNEENESENNN";

        System.out.println(GetShortestPath(path));

    }
    
}
