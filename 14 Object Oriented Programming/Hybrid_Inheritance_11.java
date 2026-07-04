public class Hybrid_Inheritance_11 {
    public static void main(String[] args) {

        Peacock p1 = new Peacock();
        p1.fly();


        
    }
    
}
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breaths");
    }
}

class Mamals extends Animal{
    int legs ;
    
    void walk(){
        System.out.println("walks");
    }
}

class Fishs extends Animal{

    void swim(){
        System.out.println("swims");
    }
}

class Birds extends Animal{

    void fly(){
        System.out.println("flys");
    }
}

class Tuna extends Fishs{
    String size;
}

class Sharks extends Fishs{
    String size;
}

class Peacock extends Birds{
    
}

class Dog extends Mamals{
    String breed;
}

class Cat extends Mamals{
    String breed;
}

class Human extends Mamals{
    String intelligent;
}