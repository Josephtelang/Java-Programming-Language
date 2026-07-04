
public class If_else_cond01{
    public static void main(String arg[]){
        int age = 21;

        if (age >= 18){
            System.out.println("Adult: drive,vote");
        }
        if (age>=13 && age<18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Not Adult");
        }
    }
}