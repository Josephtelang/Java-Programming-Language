public class Multiple_Inheritance_17 {
    public static void main(String arg[]){
        Bear b1 = new Bear();
        b1.eat_meat();
        b1.eat_grass();

    }
}

interface Harbivore{
    void eat_meat();
}

interface Carnivore{
    void eat_grass();
}

class Bear implements Harbivore,Carnivore{
    public void eat_meat(){
        System.out.println("bear eats fishes");
    }

    public void eat_grass(){
        System.out.println("bear eats corns");
    }
}