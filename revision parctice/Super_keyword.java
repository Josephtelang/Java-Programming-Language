public class Super_keyword {
    public static void main(String arg[]){
        Animal a1 = new Animal();
        System.out.println(a1.color);
        
        Horse h1 = new Horse();
        System.out.println(h1.color);
        System.out.println(a1.color);

    }
    
}


class Animal{
    String color;

    Animal(){
        System.out.println("Animal constructor called");
    }

}

class Horse extends Animal{
    Horse(){
        super();
        super.color = "blue";
        // color = "green";
        System.out.println("Horse constructor called");

    }
}


