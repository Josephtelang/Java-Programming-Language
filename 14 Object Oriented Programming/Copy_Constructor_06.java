public class Copy_Constructor_06 {
    public static void main(String arg[]){
        Student s1 = new Student();
        s1.name = "joseph";
        s1.age = 23;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s1.marks[2] = 100;
        for (int i =0; i<3 ; i++){
            System.out.println(s2.marks[i]);
        }
        

    }
    
}

class Student{
    String name ;
    int age;
    String password;
    int marks[];

    // Copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.age = s1.age;
        this.password = s1.password;
        this.marks = s1.marks;
    }

    Student(){
        marks = new int[3];
        System.out.println("The constructor is called");
    }

    Student(String name){
        marks = new int[3];
        this.name = name;
    }

    Student(int age){
        marks = new int[3];
        this.age = age;
    }

    // Student(String password){
    //     this.password = password;
    // }



}
