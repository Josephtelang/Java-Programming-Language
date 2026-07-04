public class Overriding_04 {
    public static void main(String arg[]){
        Animal a = new Animal();
        a.eat();
        Deer d = new Deer();
        d.eat();

    }
    
}

class Animal{
    void eat(){
        System.out.println("Eats anything");
    }

}

class Deer extends Animal{
    void eat(){
        System.out.println("Eats grass");
    }
}
