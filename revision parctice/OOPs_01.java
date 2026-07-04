import java.util.*;

public class OOPs_01 {
    public static void main(String arg[]){
        // Pen p1 = new Pen();
        // p1.setColor( "blue");
        // System.out.println(p1.getColor());
        // p1.setTip(5);
        // System.out.println(p1.getTip());
        // p1.setColor("yellow");
        // System.out.println(p1.getColor());
        // // p1.color = "green";
        // // System.out.println(p1.color);

        // Student s1 = new Student();
        // s1.calcPercentage(60,65,69);
        // System.out.println(s1.percentage);
        // s1.percentage = 0;
        // System.out.println(s1.percentage);


        // BankAccount myAcc = new BankAccount();
        // myAcc.username = "Joseph Telang";
        // System.out.println(myAcc.username);
        // // myAcc.password = "Pass@123"; // this will through error because password is private 
        // myAcc.setPassword("Pass@123");
        // // System.out.println(myAcc.password); // password is not accessible from here

        Student s1 = new Student();
        // Student s2 = new Student("Joseph");
        // Student s3 = new Student(22);
        // Student s4 = new Student("joseph",22); // there is no constructor that takes string and in as argument so compiler error
        
        s1.name = "Joseph";
        s1.rollNo = 22;
        s1.password = "abcd";

        s1.marks[0] = 100;
        s1.marks[1] = 80;
        s1.marks[2] = 90;

        Student s2 = new Student(s1);
        s2.password = "xyz";
        s2.name = "thomas";
        System.out.println(s2.name);

        s1.marks[1] += 20;
        for (int i=0 ; i<3 ; i++){
            System.out.println(s2.marks[i]);
        }

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);




        
        

        

    }
    
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }

}

class Pen{
    private String color;
    private int tip;

    void setColor(String color){
        this.color = color;
        System.out.println(color);
    }

    void setTip(int tip){
        this.tip = tip;
    }

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

}

class Student{
    String name;
    int rollNo;
    String password;
    int marks[];

    // Copy constructor
    // Student(Student s1){
    //     // marks = new int[3];
    //     this.name = s1.name;
    //     this.rollNo = s1.rollNo;
    //     this.marks = s1.marks;
    // }

    //CopyDeep constructor
    Student(Student s1){
        this.marks = new int[3];
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        for (int i=0 ; i<marks.length; i++){
            marks[i] = s1.marks[i];
        }
    }

    Student(){
        marks = new int[3];
        System.out.println("Constructor is called ...");
    }
    
    Student(String name){
        marks = new int[3];
        this.name = name;

    }
    
    Student(int rollNo){
        marks = new int[3];
        this.rollNo = rollNo;
    }

}


// class Student{
//     String name;
//     int age;
//     int percentage;

//     void calcPercentage(int math , int phy , int chem){
//         percentage = (math + phy + chem)/3;
//     }
// }
