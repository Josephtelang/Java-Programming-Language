public class Constructors_04 {
    public static void main(String arg[]){

        Student s1 = new Student("Joseph");
        System.out.println(s1.name);

    }
    
}

class Student{
    String name;
    int age;

    // This is a Constructor
    Student(String name){
        this.name = name;
        System.out.println("The Constructor is called");
    }
}
