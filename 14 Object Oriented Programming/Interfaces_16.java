public class Interfaces_16 {
    public static void main(String arg[]){
        Queen q = new Queen();
        q.moves();

        Queen.moves();



    }
    
}

interface Chessplayer{
    void moves();
}

class Queen implements Chessplayer{
    public void moves(){
        System.out.println("left,right,up,down,diagonal - in all 4 direction");
    }
}

class Rook implements Chessplayer{
    public void moves(){
        System.out.println("left,right,up,down");
    }
}

class King implements Chessplayer{
    public void moves(){
        System.out.println("left,right,up,down,diagonal -one step");
    }
}