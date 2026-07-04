public class Static_keyword {
    public static void main(String arg[]){

        Student s1 = new Student();
        s1.schoolName = "JVM";
        System.out.println(s1.schoolName);

        Student s2 = new Student();
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "ABC";

        System.out.println(s3.schoolName);
        System.out.println(s1.schoolName);

        System.out.println(Student.returnPercentage(35,30,90));


        
    }
    
}

class Student{
    String name;
    int rollNo;

    static int returnPercentage(int chem , int math , int phy){
        return (chem+math+phy)/3;
    }

    static String schoolName;

    void setName(String name){
        this.name = name;
    }

    String  getName(){
        return this.name;
    }
}
