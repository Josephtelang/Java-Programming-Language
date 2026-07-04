public class Hierarchial_Inheritance_10 {
    public static void main(String[] args) {

        Birds sparrow = new Birds();
        sparrow.eat();
        
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
