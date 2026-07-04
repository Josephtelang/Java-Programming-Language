public class Static_keyword_17 {
    public static void main(String arg[]){
        Student s1 = new Student();
        s1.school_name = "JMV";

        System.out.println(s1.school_name);

        Student s2 = new Student();
        System.out.println(s2.school_name);
        s2.school_name = "ABC";

        System.out.println(s1.school_name);

    }
    
}

class Student{

    static int returnpercentage(int math , int chem , int phy){  //static will make only one function for 
                                                                 // all the object for calculating precentage 
        return (math+chem+phy)/3;
    }
    String name;
    int roll_no;

    static String school_name;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}