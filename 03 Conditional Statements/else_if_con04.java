public class else_if_con04 {
    public static void main(String arg[]){
                int age = 21;

        if (age >= 18){
            System.out.println("Adult: drive,vote");
        }
        else if (age>=13 && age<18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Not Adult");
        }

    }
    
}
