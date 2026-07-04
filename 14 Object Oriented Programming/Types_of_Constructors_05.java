public class Types_of_Constructors_05 {
    public static void main(String arg[]){
        Student s1 = new Student();
        Student s2 = new Student("Joseph");
        Student s3 = new Student(25);
        // Student s4 = new Student("joseph", 25);  //<-- there is no constructor which takes name and age.

    }
    
}

class Student{
    String name ; 
    int age;

    Student(){
        System.out.println("The constructor is called");
    }

    Student(String name){
        this.name = name;
    }

    Student(int age){
        this.age = age;
    }
}
