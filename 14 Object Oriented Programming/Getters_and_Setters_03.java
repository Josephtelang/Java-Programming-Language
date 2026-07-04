
public class Getters_and_Setters_03 {
    public static void main(String arg[]){
        Pen p1 = new Pen();

        p1.set_color("Blue");
        System.out.println(p1.getColor());
        p1.set_tip(10);
        System.out.println(p1.getTip());
        // p1.set_color("Yellow");
        p1.set_color("yellow");
        System.out.println(p1.getColor());
        System.out.println("helloworld");



    }    
    
}

class Pen{
    private String color;
    private int tip;

    
    String getColor(){
        return this.color;

    }

    int getTip(){
        return this.tip;
    }

    void set_color(String new_color){
        this.color = new_color;
    }

    void set_tip(int tip){
        this.tip = tip;
    }
}
