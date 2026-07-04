public class opps_inheritance_02 {
    public static void main(String arg[]){
        Fish shark = new Fish();
        shark.eat();
        shark.swim();

        Mammel dog = new Mammel();
        dog.eat();
        dog.walk();

        Bird beacock = new Bird();
        beacock.eat();
        beacock.fly();

        // Dog dobby = new Dog();
        // dobby.eat();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);

    }
    
}

//Base class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breaths");
    }

}

class Mammel extends Animal{
    int legs;
    void walk(){
        System.out.println("Walks");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("Swims");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("flys");
    }
}

class Dog extends Mammel{
    String breed;
}



// Derived class / Subclass
// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("Swims");
//     }


// }
