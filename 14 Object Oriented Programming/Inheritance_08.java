public class Inheritance_08 {
    public static void main(String arg[]){
        Fish sharks = new Fish();
        sharks.eat();

    }
    
}

// Base class
class Animal{
    String color; 

    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breaths");
    }
}

// Derived class
class Fish extends Animal{
    int fins ;

    void swims(){
        System.out.println("swims");
    }
}
