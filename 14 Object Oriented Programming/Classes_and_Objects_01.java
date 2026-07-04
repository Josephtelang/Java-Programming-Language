public class Classes_and_Objects_01{
    public static void main(String arg[]){
        Pen p1 = new Pen();

        p1.set_color("Blue");
        System.out.println(p1.color);
        p1.set_tip(10);
        System.out.println(p1.tip);
        // p1.set_color("Yellow");
        p1.color = "yellow";
        System.out.println(p1.color);



    }
}

class Pen{
    String color;
    int tip;

    void set_color(String new_color){
        color = new_color;
    }

    void set_tip(int new_tip){
        tip = new_tip;
    }
}

class Student{
    String name ;
    int age;
    float precentage;

    void calculate_precentage(int chem , int phy , int math){
        precentage = (chem+ phy+ math)/3;
    }
}