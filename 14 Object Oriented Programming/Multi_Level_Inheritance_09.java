public class Multi_Level_Inheritance_09 {
    public static void main(String arg[]){
        Dog dobby = new Dog();

        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);

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
    
}

class Dog extends Mamals{
    String breed;
}
