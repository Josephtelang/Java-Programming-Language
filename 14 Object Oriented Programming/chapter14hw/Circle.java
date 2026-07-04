



public class Circle extends Shapes{
    protected void display(){
        System.out.println("Display-derived");
    }

    public static void main(String[] args) {
        Circle c =  new Circle();
        c.display();
    }

}