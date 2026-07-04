public class Method_Overriding_13 {
    public static void main(String arg[]){
        Deer d = new Deer();
        d.eat();
        

    }
    
}

class Animal{
    void eat(){
        System.out.println("eat anything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("ean grass");
    }
}
