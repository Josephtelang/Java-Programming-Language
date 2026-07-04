public class Interfaces {
    public static void main(String arg[]){
        Queen q1 = new Queen();
        q1.moves();
        

        Bear b1 = new Bear();
        b1.eat_grass();
        b1.eat_meat();

    }
    
}

//Multiple inheritance 
interface Harbivore {
    void eat_grass();
}

interface Carnivore{
    void eat_meat();
}

class Bear implements Harbivore,Carnivore{
    public void eat_grass(){
        System.out.println("eats grass");
    }

    public void eat_meat(){
        System.out.println("eats meat");
    }
}


interface ChessPlayer{
    void moves();
}


class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal (in all 4 dirns)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal (by 1 step");
    }
}