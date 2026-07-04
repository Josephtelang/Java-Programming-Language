public class Super_keyword_18 {
    public static void main(String arg[]){
        Mamal m = new Mamal();
        System.out.println(m.color);


    }
    
}

class Animal{
    String color;
    Animal(){
        System.out.println("The animal constructor is called");
    }
}

class Mamal extends Animal{
    Mamal(){
        super.color = "brown";
        System.out.println("The mamal constructor is called");
    }
}