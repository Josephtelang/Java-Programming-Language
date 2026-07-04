public class Abstract_Classes_15 {
    public static void main(String[] args) {
        // Horse h = new Horse();
        // h.walk();
        // System.out.println(h.color);

        Chicken c = new Chicken();
        c.walk();
        c.eat();

        Mustang myhorse = new Mustang();
        // Animal -> Horse -> Mustang


        // Animal a = new Animal();
        

    }
    
}

abstract class Animal{

    String color;
    Animal(){
        color = "brown";
        System.out.println("Animal construnctor is called");
    }
    void eat(){
        System.out.println("Eats");
    }

    abstract void  walk();
}


class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor is called");
    }
    void Change_color(){
        color = "dark brown";

    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor is called");
    }
}
class Chicken extends Animal{
    void walk(){
        System.out.println("walk on 2 legs");
    }
}
